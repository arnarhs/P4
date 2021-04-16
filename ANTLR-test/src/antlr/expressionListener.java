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
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactionExpressionConst(expressionParser.ReactionExpressionConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionExpressionConst}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactionExpressionConst(expressionParser.ReactionExpressionConstContext ctx);
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
	 * Enter a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpression(expressionParser.OperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpression(expressionParser.OperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(expressionParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(expressionParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpression(expressionParser.SubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpression(expressionParser.SubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(expressionParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(expressionParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link expressionParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(expressionParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link expressionParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(expressionParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatement}
	 * labeled alternative in {@link expressionParser#elseifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(expressionParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatement}
	 * labeled alternative in {@link expressionParser#elseifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(expressionParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link expressionParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(expressionParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link expressionParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(expressionParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanOperatorExpr}
	 * labeled alternative in {@link expressionParser#ifconds}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperatorExpr(expressionParser.BooleanOperatorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanOperatorExpr}
	 * labeled alternative in {@link expressionParser#ifconds}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperatorExpr(expressionParser.BooleanOperatorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link expressionParser#ifconds}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(expressionParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link expressionParser#ifconds}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(expressionParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link expressionParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(expressionParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link expressionParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(expressionParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOperatorExpr}
	 * labeled alternative in {@link expressionParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperatorExpr(expressionParser.LogicalOperatorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOperatorExpr}
	 * labeled alternative in {@link expressionParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperatorExpr(expressionParser.LogicalOperatorExprContext ctx);
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