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