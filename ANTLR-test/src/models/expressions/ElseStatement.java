package models.expressions;

public class ElseStatement extends Expression {
	String type;
	Expression elseExpr;
	
	public ElseStatement(String type, Expression elseExpr) {
		this.type = type;
		this.elseExpr = elseExpr;
	}
	
	@Override
	public String toString() {
		return type.toString() + '{' + elseExpr.toString() + '}';
	}
}
