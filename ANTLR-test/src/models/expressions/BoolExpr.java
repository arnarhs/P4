package models.expressions;

public class BoolExpr extends Expression {
	
	boolean value;
	
	public BoolExpr (boolean value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
