package models.expressions;

public class BoolExpr extends Expression {
	
	String value;
	
	public BoolExpr (String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
