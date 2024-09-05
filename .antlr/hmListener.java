// Generated from c:/Users/oriol/OneDrive/Escriptori/FIB/23-24Q2/LP/PracticaOriolRamos/hm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hmParser}.
 */
public interface hmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hmParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(hmParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link hmParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(hmParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definicio}
	 * labeled alternative in {@link hmParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDefinicio(hmParser.DefinicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definicio}
	 * labeled alternative in {@link hmParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDefinicio(hmParser.DefinicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipusCombinat}
	 * labeled alternative in {@link hmParser#tipus}.
	 * @param ctx the parse tree
	 */
	void enterTipusCombinat(hmParser.TipusCombinatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipusCombinat}
	 * labeled alternative in {@link hmParser#tipus}.
	 * @param ctx the parse tree
	 */
	void exitTipusCombinat(hmParser.TipusCombinatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(hmParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(hmParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(hmParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(hmParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(hmParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(hmParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(hmParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(hmParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operacio}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperacio(hmParser.OperacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operacio}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperacio(hmParser.OperacioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aplicacio}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAplicacio(hmParser.AplicacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aplicacio}
	 * labeled alternative in {@link hmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAplicacio(hmParser.AplicacioContext ctx);
}