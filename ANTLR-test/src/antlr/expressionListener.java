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
	 * Enter a parse tree produced by the {@code ReacDeclAssignment}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void enterReacDeclAssignment(expressionParser.ReacDeclAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReacDeclAssignment}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void exitReacDeclAssignment(expressionParser.ReacDeclAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReacDecl}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void enterReacDecl(expressionParser.ReacDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReacDecl}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void exitReacDecl(expressionParser.ReacDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDeclAssignment}
	 * labeled alternative in {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclAssignment(expressionParser.IntDeclAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDeclAssignment}
	 * labeled alternative in {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclAssignment(expressionParser.IntDeclAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDecl}
	 * labeled alternative in {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void enterIntDecl(expressionParser.IntDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDecl}
	 * labeled alternative in {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void exitIntDecl(expressionParser.IntDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListDeclParams}
	 * labeled alternative in {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterListDeclParams(expressionParser.ListDeclParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListDeclParams}
	 * labeled alternative in {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitListDeclParams(expressionParser.ListDeclParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListDecl}
	 * labeled alternative in {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(expressionParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListDecl}
	 * labeled alternative in {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(expressionParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionParameters}
	 * labeled alternative in {@link expressionParser#reacParams}.
	 * @param ctx the parse tree
	 */
	void enterReactionParameters(expressionParser.ReactionParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionParameters}
	 * labeled alternative in {@link expressionParser#reacParams}.
	 * @param ctx the parse tree
	 */
	void exitReactionParameters(expressionParser.ReactionParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionParameter}
	 * labeled alternative in {@link expressionParser#reacParams}.
	 * @param ctx the parse tree
	 */
	void enterReactionParameter(expressionParser.ReactionParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionParameter}
	 * labeled alternative in {@link expressionParser#reacParams}.
	 * @param ctx the parse tree
	 */
	void exitReactionParameter(expressionParser.ReactionParameterContext ctx);
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
	 * Enter a parse tree produced by the {@code ReactionExpressionConst}
	 * labeled alternative in {@link expressionParser#reacExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactionExpressionConst(expressionParser.ReactionExpressionConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionExpressionConst}
	 * labeled alternative in {@link expressionParser#reacExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactionExpressionConst(expressionParser.ReactionExpressionConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionExpression}
	 * labeled alternative in {@link expressionParser#reacExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactionExpression(expressionParser.ReactionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionExpression}
	 * labeled alternative in {@link expressionParser#reacExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactionExpression(expressionParser.ReactionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#basicExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#basicExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#basicExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#basicExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#basicExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#basicExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
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