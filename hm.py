from antlr4 import InputStream, CommonTokenStream
from hmLexer import hmLexer
from hmParser import hmParser
from antlr4.tree.Tree import ParseTreeVisitor
from graphviz import Digraph
import streamlit as st
import pandas as pd

# Inicialitza l'estat de sessió per a la taula de símbols i errors
if "taulaSimbols" not in st.session_state:
    st.session_state.taulaSimbols = {}
    st.session_state.definitions = {}  # Per definicions explícites
    st.session_state.inferences = {}  # Per inferències de tipus
    st.session_state.error = None  # Per l'error

mapaTipus = {}

# Definició de les classes Node, Buit, i funcions auxiliars


class Node:
    def __init__(self, text, esquerra, dreta, tipus):
        self.text = text
        self.esquerra = esquerra
        self.dreta = dreta
        self.tipus = tipus


class Buit:
    pass


# Visualització de l'arbre
def visualize_expr(expr, graph=None):
    if graph is None:
        graph = Digraph()
        graph.attr(
            "node",
            shape="ellipse",
            style="filled",
            fillcolor="lightblue",
            fontsize="12",
            fontcolor="black",
        )
        graph.attr("edge", arrowhead="none")

    if isinstance(expr, Node):
        graph.node(str(id(expr)), label=f"{expr.text} \n {expr.tipus}")
        if not isinstance(expr.esquerra, Buit):
            graph.edge(str(id(expr)), str(id(expr.esquerra)))
            visualize_expr(expr.esquerra, graph)
        if not isinstance(expr.dreta, Buit):
            graph.edge(str(id(expr)), str(id(expr.dreta)))
            visualize_expr(expr.dreta, graph)

    return graph


class LetterGenerator:
    def __init__(self):
        self.current = "a"

    def next(self):
        next_letter = chr(ord(self.current) + 1)
        self.current = next_letter


lletra = LetterGenerator()
tipuGeneral = None


# Implementació del visitor per convertir l'AST en un arbre semàntic
class HMVisitor(ParseTreeVisitor):
    def __init__(self):
        self.variables = {}
        self.variablesReplace = {}
        self.definitions = []  # Llista per emmagatzemar definicions temporals
        self.lletra = lletra

    def visitRoot(self, ctx):
        # Recollir totes les definicions primer
        for child in ctx.getChildren():
            if isinstance(child, hmParser.DefinicioContext):
                self.visitDefinicio(child)

        # Després, processar les expressions
        expr_result = None
        for child in ctx.getChildren():
            if not isinstance(child, hmParser.DefinicioContext):
                expr_result = self.visit(child)

        return expr_result

    def visitDefinicio(self, ctx):
        # Procesar i afegir a la taula de símbols
        [id, _, tipus] = list(ctx.getChildren())
        tipo_text = self.visit(tipus)
        if "->" in tipo_text:
            st.session_state.taulaSimbols[id.getText()] = f"({tipo_text})"
        else:
            st.session_state.taulaSimbols[id.getText()] = tipo_text

    def visitTipusCombinat(self, ctx):
        tipus = [child.getText() for child in ctx.getChildren()]
        tipus_formatejat = self.formatTipus(tipus)
        return tipus_formatejat

    def formatTipus(self, tipus):
        if len(tipus) == 1:
            return tipus[0]
        elif len(tipus) == 3:
            return f"({tipus[0]} {tipus[1]}{tipus[2]})"
        return f"{tipus[0]}{tipus[1]}{self.formatTipus(tipus[2:])}"

    def visitTipusBasic(self, ctx):
        return ctx.getText()

    def visitParentesis(self, ctx):
        # Processar parèntesis
        [_, expr, _] = list(ctx.getChildren())
        arbre = self.visit(expr)
        return arbre

    def visitAplicacio(self, ctx):
        # Aplicació de funció
        [apl, expr] = list(ctx.getChildren())

        lletra = self.lletra.current
        self.lletra.next()
        self.variables[f"{id(ctx)}"] = lletra
        esq = self.visit(apl)
        dret = self.visit(expr)

        return Node("@", esq, dret, lletra)

    # Per la inferència de tipus
    def visitAplicacioUnificada(self, ctx):
        [apl, expr] = list(ctx.getChildren())

        esq = self.visit(apl)
        dret = self.visit(expr)
        func_type = esq.tipus
        arg_type = dret.tipus

        # Verificar si el tipus del fill esquerre es una funció amb arguments
        if func_type.startswith("(") and "->" in func_type:
            # Dividir el tipus en arguments i tipus de retorn
            parts = func_type[1:-1].split("->")
            arg_types = [
                part.strip().replace(")", "").replace("(", "") for part in parts
            ]

            # Eliminar el tipsu del fill dret del fill esquerre
            if arg_types and (
                arg_type == arg_types[0] or arg_type.islower()
            ):  # arg_type es una lletra si es minúscula
                if arg_type.islower():
                    # Assignar el tipus general a la variable
                    st.session_state.taulaSimbols[dret.text] = arg_types[0]
                    dret.tipus = arg_types[0]
                    if dret.text in self.variables:
                        self.variablesReplace[self.variables[dret.text]] = arg_types[0]
                    else:
                        self.variablesReplace[dret.text] = arg_types[0]
                if len(arg_types) > 2:
                    new_func_type = "(" + "->".join(arg_types[1:]) + ")"
                else:
                    new_func_type = arg_types[0]
            else:
                # Guardar l'error en la sessió
                st.session_state.error = f"Type Error: {arg_types[0]} vs {arg_type}"
                return Node("@", esq, dret, f"Type Error: {arg_types[0]} vs {arg_type}")

            # Guardar la inferència de tipus amb la lletra original
            if esq.text not in st.session_state.inferences:
                st.session_state.inferences[esq.text] = func_type
            st.session_state.inferences[dret.text] = arg_type

            tipo_final = new_func_type
        else:
            # Si el tipus no es una funció amb arguments, tipus dret
            tipo_final = arg_type

        # Actualizar variablesReplace amb el tipus final del node actual
        self.variablesReplace[self.variables.get(f"{id(ctx)}", f"{id(ctx)}")] = (
            tipo_final
        )
        return Node("@", esq, dret, tipo_final)

    def visitLambda(self, ctx):
        # Expressió lambda
        [_, id, _, expr] = list(ctx.getChildren())

        lletra = self.lletra.current
        self.lletra.next()

        if id.getText() in self.variables:
            segonaLletra = self.variables[id.getText()]
        else:
            segonaLletra = self.lletra.current
            self.variables[id.getText()] = segonaLletra
            self.lletra.next()

        esq = Node(id.getText(), Buit(), Buit(), segonaLletra)
        dret = self.visit(expr)
        self.variables[f"{ctx}"] = lletra
        return Node("λ", esq, dret, lletra)

    def visitLambdaUnificada(self, ctx):
        # Lambda unificada
        [_, id, _, expr] = list(ctx.getChildren())

        dret = self.visit(expr)
        parts = dret.tipus.split("->")
        arg_types = [part.strip().replace(")", "").replace("(", "") for part in parts]

        esq = Node(id.getText(), Buit(), Buit(), arg_types[0])
        tipo_final = f"({esq.tipus} -> {dret.tipus})"
        self.variablesReplace[self.variables[f"{ctx}"]] = tipo_final

        self.variablesReplace[self.variables[id.getText()]] = arg_types[0]
        return Node("λ", esq, dret, tipo_final)

    def visitOperacio(self, ctx):
        # Operació
        [operacio] = list(ctx.getChildren())

        if operacio.getText() in st.session_state.taulaSimbols:
            tipus = st.session_state.taulaSimbols[operacio.getText()]
        else:
            tipus = mapaTipus.get(operacio.getText(), None)
            if tipus is None:
                tipus = self.lletra.current
                self.lletra.next()
        return Node(operacio.getText(), Buit(), Buit(), tipus)

    def visitId(self, ctx):
        # Identificador
        [id] = list(ctx.getChildren())

        if id.getText() in self.variables:
            lletra = self.variables[id.getText()]
        else:
            lletra = self.lletra.current
            self.lletra.next()
        self.variables[id.getText()] = lletra
        return Node(id.getText(), Buit(), Buit(), lletra)

    def visitNum(self, ctx):
        # Procés d'un número
        [num] = list(ctx.getChildren())

        if num.getText() in st.session_state.taulaSimbols:
            tipus = st.session_state.taulaSimbols[num.getText()]
        else:
            tipus = mapaTipus.get(num.getText(), None)
            if tipus is None:
                tipus = self.lletra.current
                self.lletra.next()

        return Node(num.getText(), Buit(), Buit(), tipus)


# Streamlit app
def main():
    st.title("Pràctica LP")
    code = st.text_area("Expressió:", height=50)
    if st.button("Fer"):
        # Reiniciar estat de l'error
        st.session_state.error = None

        input_stream = InputStream(code)
        lexer = hmLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = hmParser(stream)
        tree = parser.root()

        visitor = HMVisitor()
        expr = visitor.visit(tree)

        # Visualitzem i mostrem l'arbre semàntic
        graph = visualize_expr(expr)
        st.graphviz_chart(graph)

        # Mostrem la taula de símbols
        df = pd.DataFrame(
            st.session_state.taulaSimbols.items(), columns=["Nom", "Tipus"]
        )

        # Apliquem estil a la taula
        styled_df = df.style.set_properties(
            **{
                "background-color": "lightgreen",
                "color": "black",
                "border-color": "black",
                "border-style": "solid",
                "font-size": "12pt",
                "text-align": "center",
                "width": "500px",
            }
        )

        st.dataframe(styled_df)

        # Arbre amb unificació
        visitor_unificada = HMVisitor()
        visitor_unificada.variables = visitor.variables
        visitor_unificada.visitAplicacio = visitor_unificada.visitAplicacioUnificada
        visitor_unificada.visitLambda = visitor_unificada.visitLambdaUnificada
        expr_unificada = visitor_unificada.visit(tree)
        graph_unificada = visualize_expr(expr_unificada)
        if not st.session_state.error:
            st.graphviz_chart(graph_unificada)

            # Mostrar inferència de tipus
            df_inferences = pd.DataFrame(
                list(visitor_unificada.variablesReplace.items()),
                columns=["Nom", "Tipus"],
            )
            styled_df_inferences = df_inferences.style.set_properties(
                **{
                    "background-color": "lightgreen",
                    "color": "black",
                    "border-color": "black",
                    "border-style": "solid",
                    "font-size": "12pt",
                    "text-align": "center",
                    "width": "500px",
                }
            )

            st.write("**Inferències de tipus:**")
            st.dataframe(styled_df_inferences)
        else:
            st.write(f"**Error:** {st.session_state.error}")


if __name__ == "__main__":
    main()
