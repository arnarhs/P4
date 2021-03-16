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
	 * Visit a parse tree produced by {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(expressionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(expressionParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(expressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(expressionParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#reactionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionExpr(expressionParser.ReactionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#reactionExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionExprList(expressionParser.ReactionExprListContext ctx);
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
	 * Visit a parse tree produced by {@link expressionParser#intDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDecl(expressionParser.IntDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#parameterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterExpr(expressionParser.ParameterExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#exprParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParameters(expressionParser.ExprParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclParameters(expressionParser.DeclParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaModelFunctional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaModelFunctional(expressionParser.SsaModelFunctionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaParameters(expressionParser.SsaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#listDeclarationFunctional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclarationFunctional(expressionParser.ListDeclarationFunctionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declareList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareList(expressionParser.DeclareListContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#listParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListParameters(expressionParser.ListParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaModelOO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaModelOO(expressionParser.SsaModelOOContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#modelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelDecl(expressionParser.ModelDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#simDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimDecl(expressionParser.SimDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#simulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulation(expressionParser.SimulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#simulationParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulationParameters(expressionParser.SimulationParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#listDeclarationOO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclarationOO(expressionParser.ListDeclarationOOContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(expressionParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#reactionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionOperator(expressionParser.ReactionOperatorContext ctx);
}