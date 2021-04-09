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
	 * Enter a parse tree produced by the {@code ReactionDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterReactionDeclaration(expressionParser.ReactionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitReactionDeclaration(expressionParser.ReactionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(expressionParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(expressionParser.IntDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(expressionParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(expressionParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactionExpression(expressionParser.ReactionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactionExpression(expressionParser.ReactionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
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