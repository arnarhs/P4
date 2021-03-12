// Generated from expression.g4 by ANTLR 4.9.1

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expressionParser}.
 */
public interface expressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(expressionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(expressionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(expressionParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(expressionParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(expressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(expressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(expressionParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(expressionParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(expressionParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(expressionParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(expressionParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(expressionParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(expressionParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(expressionParser.IdContext ctx);
}