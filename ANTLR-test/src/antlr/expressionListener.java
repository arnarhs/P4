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
	 * Enter a parse tree produced by {@link expressionParser#parameterExpr}.
	 * @param ctx the parse tree
	 */
	void enterParameterExpr(expressionParser.ParameterExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#parameterExpr}.
	 * @param ctx the parse tree
	 */
	void exitParameterExpr(expressionParser.ParameterExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void enterExprParameters(expressionParser.ExprParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void exitExprParameters(expressionParser.ExprParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactionExpr(expressionParser.ReactionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactionExpr(expressionParser.ReactionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#reactionExprList}.
	 * @param ctx the parse tree
	 */
	void enterReactionExprList(expressionParser.ReactionExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#reactionExprList}.
	 * @param ctx the parse tree
	 */
	void exitReactionExprList(expressionParser.ReactionExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#reactionOperator}.
	 * @param ctx the parse tree
	 */
	void enterReactionOperator(expressionParser.ReactionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#reactionOperator}.
	 * @param ctx the parse tree
	 */
	void exitReactionOperator(expressionParser.ReactionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(expressionParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(expressionParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(expressionParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(expressionParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(expressionParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(expressionParser.AddExprContext ctx);
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
}