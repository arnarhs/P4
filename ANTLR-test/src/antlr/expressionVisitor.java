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
	 * Visit a parse tree produced by the {@code ReactionDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionDeclaration(expressionParser.ReactionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclaration(expressionParser.IntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaringReactioObject}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaringReactioObject(expressionParser.DeclaringReactioObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(expressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declaringReaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaringReaction(expressionParser.DeclaringReactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declaringInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaringInt(expressionParser.DeclaringIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(expressionParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactingSpecies}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactingSpecies(expressionParser.ReactingSpeciesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(expressionParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactionOperatorWithPara}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionOperatorWithPara(expressionParser.ReactionOperatorWithParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(expressionParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactionInitialization}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionInitialization(expressionParser.ReactionInitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumOrId}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumOrId(expressionParser.NumOrIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#exprParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(expressionParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#reactionExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionExprList(expressionParser.ReactionExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#reactionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionParameter(expressionParser.ReactionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(expressionParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(expressionParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#parameterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterExpr(expressionParser.ParameterExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#parameterID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterID(expressionParser.ParameterIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#paraExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaExpr(expressionParser.ParaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#exprParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParameters(expressionParser.ExprParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#valueParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueParameter(expressionParser.ValueParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclParameters(expressionParser.DeclParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStatement(expressionParser.DeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#multipleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStmt(expressionParser.MultipleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(expressionParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#setList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetList(expressionParser.SetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#listParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListParameters(expressionParser.ListParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#listExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(expressionParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#listExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExprList(expressionParser.ListExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#listParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListParameter(expressionParser.ListParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#multiValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiValues(expressionParser.MultiValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#runSSA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunSSA(expressionParser.RunSSAContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaMethod(expressionParser.SsaMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaParameter(expressionParser.SsaParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaParameters(expressionParser.SsaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaMethodParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaMethodParameters(expressionParser.SsaMethodParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#methodParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameters(expressionParser.MethodParametersContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link expressionParser#reactionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionOperator(expressionParser.ReactionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(expressionParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(expressionParser.MultContext ctx);
}