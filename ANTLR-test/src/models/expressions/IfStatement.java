package models.expressions;

public class IfStatement extends Expression {
	String type;
	Expression condition;
	Expression thenExpr;
	Expression elseExpr = null;
	
	public IfStatement(String type, Expression condition, Expression thenExpr, Expression elseExpr) {
		this.type = type;
		this.condition = condition;
		this.thenExpr = thenExpr;
		this.elseExpr = elseExpr;
	}
	
	@Override
	public String toString() {
		return type.toString() + '(' + condition.toString() + ')' 
				+ '{' + thenExpr.toString() + '}' + elseExpr.toString();
	}
}
