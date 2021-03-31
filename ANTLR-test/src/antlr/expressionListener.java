// Generated from expression.g4 by ANTLR 4.9.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expressionParser}.
 */
public interface expressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(expressionParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(expressionParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void enterDeclReaction(expressionParser.DeclReactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void exitDeclReaction(expressionParser.DeclReactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclInt(expressionParser.DeclIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclInt(expressionParser.DeclIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(expressionParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(expressionParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declMethod}.
	 * @param ctx the parse tree
	 */
	void enterDeclMethod(expressionParser.DeclMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declMethod}.
	 * @param ctx the parse tree
	 */
	void exitDeclMethod(expressionParser.DeclMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(expressionParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(expressionParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#exprParams}.
	 * @param ctx the parse tree
	 */
	void enterExprParams(expressionParser.ExprParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#exprParams}.
	 * @param ctx the parse tree
	 */
	void exitExprParams(expressionParser.ExprParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaParams}.
	 * @param ctx the parse tree
	 */
	void enterSsaParams(expressionParser.SsaParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaParams}.
	 * @param ctx the parse tree
	 */
	void exitSsaParams(expressionParser.SsaParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaList}.
	 * @param ctx the parse tree
	 */
	void enterSsaList(expressionParser.SsaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaList}.
	 * @param ctx the parse tree
	 */
	void exitSsaList(expressionParser.SsaListContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(expressionParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(expressionParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#reactionConst}.
	 * @param ctx the parse tree
	 */
	void enterReactionConst(expressionParser.ReactionConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#reactionConst}.
	 * @param ctx the parse tree
	 */
	void exitReactionConst(expressionParser.ReactionConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumber(expressionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumber(expressionParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVariable(expressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVariable(expressionParser.VariableContext ctx);
}