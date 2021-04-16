package models.expressions;

public class ElseIfStatement extends Expression {
	String typeElse;
	String typeIf;
	Expression condition;
	Expression elseExpr;
	
	public ElseIfStatement(String typeElse, String typeIf, Expression condition, Expression elseExpr) {
		this.typeElse = typeElse;
		this.typeIf = typeIf;
		this.condition = condition;
		this.elseExpr = elseExpr;
	}
	
	@Override
	public String toString() {
		return typeElse.toString() + typeIf.toString()  + '(' +  condition.toString() + ')' 
				+ '{' + elseExpr.toString() + '}';
	}
}
