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
	 * Enter a parse tree produced by the {@code DeclaringReactioObject}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaringReactioObject(expressionParser.DeclaringReactioObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaringReactioObject}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaringReactioObject(expressionParser.DeclaringReactioObjectContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#declaringReaction}.
	 * @param ctx the parse tree
	 */
	void enterDeclaringReaction(expressionParser.DeclaringReactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declaringReaction}.
	 * @param ctx the parse tree
	 */
	void exitDeclaringReaction(expressionParser.DeclaringReactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declaringInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclaringInt(expressionParser.DeclaringIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declaringInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclaringInt(expressionParser.DeclaringIntContext ctx);
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
	 * Enter a parse tree produced by the {@code ReactingSpecies}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactingSpecies(expressionParser.ReactingSpeciesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactingSpecies}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactingSpecies(expressionParser.ReactingSpeciesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(expressionParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(expressionParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionOperatorWithPara}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactionOperatorWithPara(expressionParser.ReactionOperatorWithParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionOperatorWithPara}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactionOperatorWithPara(expressionParser.ReactionOperatorWithParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(expressionParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(expressionParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionInitialization}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterReactionInitialization(expressionParser.ReactionInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionInitialization}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitReactionInitialization(expressionParser.ReactionInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumOrId}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumOrId(expressionParser.NumOrIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumOrId}
	 * labeled alternative in {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumOrId(expressionParser.NumOrIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#exprParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(expressionParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#exprParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(expressionParser.ExprParenthesisContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#reactionParameter}.
	 * @param ctx the parse tree
	 */
	void enterReactionParameter(expressionParser.ReactionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#reactionParameter}.
	 * @param ctx the parse tree
	 */
	void exitReactionParameter(expressionParser.ReactionParameterContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#parameterID}.
	 * @param ctx the parse tree
	 */
	void enterParameterID(expressionParser.ParameterIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#parameterID}.
	 * @param ctx the parse tree
	 */
	void exitParameterID(expressionParser.ParameterIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#paraExpr}.
	 * @param ctx the parse tree
	 */
	void enterParaExpr(expressionParser.ParaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#paraExpr}.
	 * @param ctx the parse tree
	 */
	void exitParaExpr(expressionParser.ParaExprContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#valueParameter}.
	 * @param ctx the parse tree
	 */
	void enterValueParameter(expressionParser.ValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#valueParameter}.
	 * @param ctx the parse tree
	 */
	void exitValueParameter(expressionParser.ValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declParameters}.
	 * @param ctx the parse tree
	 */
	void enterDeclParameters(expressionParser.DeclParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declParameters}.
	 * @param ctx the parse tree
	 */
	void exitDeclParameters(expressionParser.DeclParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclStatement(expressionParser.DeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclStatement(expressionParser.DeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#multipleStmt}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStmt(expressionParser.MultipleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#multipleStmt}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStmt(expressionParser.MultipleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(expressionParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(expressionParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#setList}.
	 * @param ctx the parse tree
	 */
	void enterSetList(expressionParser.SetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#setList}.
	 * @param ctx the parse tree
	 */
	void exitSetList(expressionParser.SetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#listParameters}.
	 * @param ctx the parse tree
	 */
	void enterListParameters(expressionParser.ListParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#listParameters}.
	 * @param ctx the parse tree
	 */
	void exitListParameters(expressionParser.ListParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(expressionParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(expressionParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#listExprList}.
	 * @param ctx the parse tree
	 */
	void enterListExprList(expressionParser.ListExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#listExprList}.
	 * @param ctx the parse tree
	 */
	void exitListExprList(expressionParser.ListExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#listParameter}.
	 * @param ctx the parse tree
	 */
	void enterListParameter(expressionParser.ListParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#listParameter}.
	 * @param ctx the parse tree
	 */
	void exitListParameter(expressionParser.ListParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#multiValues}.
	 * @param ctx the parse tree
	 */
	void enterMultiValues(expressionParser.MultiValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#multiValues}.
	 * @param ctx the parse tree
	 */
	void exitMultiValues(expressionParser.MultiValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#runSSA}.
	 * @param ctx the parse tree
	 */
	void enterRunSSA(expressionParser.RunSSAContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#runSSA}.
	 * @param ctx the parse tree
	 */
	void exitRunSSA(expressionParser.RunSSAContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaMethod}.
	 * @param ctx the parse tree
	 */
	void enterSsaMethod(expressionParser.SsaMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaMethod}.
	 * @param ctx the parse tree
	 */
	void exitSsaMethod(expressionParser.SsaMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaParameter}.
	 * @param ctx the parse tree
	 */
	void enterSsaParameter(expressionParser.SsaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaParameter}.
	 * @param ctx the parse tree
	 */
	void exitSsaParameter(expressionParser.SsaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaParameters}.
	 * @param ctx the parse tree
	 */
	void enterSsaParameters(expressionParser.SsaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaParameters}.
	 * @param ctx the parse tree
	 */
	void exitSsaParameters(expressionParser.SsaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaMethodParameters}.
	 * @param ctx the parse tree
	 */
	void enterSsaMethodParameters(expressionParser.SsaMethodParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaMethodParameters}.
	 * @param ctx the parse tree
	 */
	void exitSsaMethodParameters(expressionParser.SsaMethodParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameters(expressionParser.MethodParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameters(expressionParser.MethodParametersContext ctx);
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
	 * Enter a parse tree produced by the {@code Identification}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdentification(expressionParser.IdentificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identification}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdentification(expressionParser.IdentificationContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(expressionParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(expressionParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(expressionParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(expressionParser.MultContext ctx);
}