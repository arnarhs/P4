package models.expressions;

public class Assign extends Expression{
	public Variable leftside;
	public Expression rightside;
	
	public Assign(Variable left, Expression right) {
		this.leftside = left;
		this.rightside = right;
	}
	
	@Override
	public String toString() {
		return leftside.toString() + ":" + rightside.toString();
	}
}
