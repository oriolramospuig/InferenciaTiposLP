# Analitzador HinNer

Nota: 9.25

**Inferència de Tipus en Árbols Sintàctics** és una aplicació interactiva que utilitza Streamlit i ANTLR per inferir tipus en expressions lambda i visualitzar els arbres sintàctics resultants. La interfície permet visualitzar l'arbre original, l'arbre amb tipus unificats, i les taules de definicions i inferències de tipus.

## Instal·lació

### Requisits

- **Python 3.8** o superior
- **ANTLR 4**: Descàrrega i instal·lació des del [lloc oficial](https://www.antlr.org/download.html)

### Instruccions

1. **Instal·la les dependències**:

   ```bash
   pip3 install streamlit antlr4-python3-runtime graphviz pandas
   ```


2. **Instal.la ANTLR**:

   ```bash
   pip3 install antlr4-tools
   ```

### Ús

1. **Executar l'aplicació**:

   ```bash
   antlr4 -Dlanguage=Python3 -no-listener -visitor hm.g4
   streamlit run hm.py
   ```


2. **Posar expresions**:

   ```bash
   2 :: N
   (+) :: N->N->N
   \x -> (+) 2 x
   ```

## Autor 

Oriol Ramos Puig
