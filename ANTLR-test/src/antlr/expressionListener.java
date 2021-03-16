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
	 * Enter a parse tree produced by {@link expressionParser#intDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntDecl(expressionParser.IntDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#intDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntDecl(expressionParser.IntDeclContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#ssaModelFunctional}.
	 * @param ctx the parse tree
	 */
	void enterSsaModelFunctional(expressionParser.SsaModelFunctionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaModelFunctional}.
	 * @param ctx the parse tree
	 */
	void exitSsaModelFunctional(expressionParser.SsaModelFunctionalContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#listDeclarationFunctional}.
	 * @param ctx the parse tree
	 */
	void enterListDeclarationFunctional(expressionParser.ListDeclarationFunctionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#listDeclarationFunctional}.
	 * @param ctx the parse tree
	 */
	void exitListDeclarationFunctional(expressionParser.ListDeclarationFunctionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declareList}.
	 * @param ctx the parse tree
	 */
	void enterDeclareList(expressionParser.DeclareListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declareList}.
	 * @param ctx the parse tree
	 */
	void exitDeclareList(expressionParser.DeclareListContext ctx);
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
	 * Enter a parse tree produced by {@link expressionParser#ssaModelOO}.
	 * @param ctx the parse tree
	 */
	void enterSsaModelOO(expressionParser.SsaModelOOContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaModelOO}.
	 * @param ctx the parse tree
	 */
	void exitSsaModelOO(expressionParser.SsaModelOOContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#modelDecl}.
	 * @param ctx the parse tree
	 */
	void enterModelDecl(expressionParser.ModelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#modelDecl}.
	 * @param ctx the parse tree
	 */
	void exitModelDecl(expressionParser.ModelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#simDecl}.
	 * @param ctx the parse tree
	 */
	void enterSimDecl(expressionParser.SimDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#simDecl}.
	 * @param ctx the parse tree
	 */
	void exitSimDecl(expressionParser.SimDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#simulation}.
	 * @param ctx the parse tree
	 */
	void enterSimulation(expressionParser.SimulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#simulation}.
	 * @param ctx the parse tree
	 */
	void exitSimulation(expressionParser.SimulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#simulationParameters}.
	 * @param ctx the parse tree
	 */
	void enterSimulationParameters(expressionParser.SimulationParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#simulationParameters}.
	 * @param ctx the parse tree
	 */
	void exitSimulationParameters(expressionParser.SimulationParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#listDeclarationOO}.
	 * @param ctx the parse tree
	 */
	void enterListDeclarationOO(expressionParser.ListDeclarationOOContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#listDeclarationOO}.
	 * @param ctx the parse tree
	 */
	void exitListDeclarationOO(expressionParser.ListDeclarationOOContext ctx);
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
}