// Generated from expression.g4 by ANTLR 4.9.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link expressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface expressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(expressionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(expressionParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReacDeclAssignment}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReacDeclAssignment(expressionParser.ReacDeclAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReacDecl}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReacDecl(expressionParser.ReacDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDeclAssignment}
	 * labeled alternative in {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclAssignment(expressionParser.IntDeclAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDecl}
	 * labeled alternative in {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDecl(expressionParser.IntDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(expressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactionExpressionConst}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionExpressionConst(expressionParser.ReactionExpressionConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactionExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionExpression(expressionParser.ReactionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpression(expressionParser.OperationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(expressionParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionExpression(expressionParser.SubtractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link expressionParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(expressionParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link expressionParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(expressionParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfStatement}
	 * labeled alternative in {@link expressionParser#elseifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(expressionParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link expressionParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(expressionParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanOperatorExpr}
	 * labeled alternative in {@link expressionParser#ifconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperatorExpr(expressionParser.BooleanOperatorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link expressionParser#ifconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(expressionParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link expressionParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(expressionParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOperatorExpr}
	 * labeled alternative in {@link expressionParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperatorExpr(expressionParser.LogicalOperatorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(expressionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(expressionParser.VariableContext ctx);
}