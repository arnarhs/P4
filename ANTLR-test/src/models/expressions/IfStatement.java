package models.expressions;

public class IfStatement extends Expression {

	Expression condition;
	Expression thenExpr;
	Expression elseExpr = null;
	
	public IfStatement(Expression condition, Expression thenExpr, Expression elseExpr) {
		this.condition = condition;
		this.thenExpr = thenExpr;
		this.elseExpr = elseExpr;
	}
	
	@Override
	public String toString() {
		return "If Statement";	
	}
}
