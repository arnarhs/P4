package models.expressions;

public class Reaction extends Expression{
	Expression leftside;
	//String operator;
	Expression rightside;
	
	public Reaction(Expression leftside, Expression rightside) {
		this.leftside = leftside;
		//this.operator = operator;
		this.rightside = rightside;
	}
	
	//FIX TO STRING method, Make it so that it takes in to account different operators
	@Override
	public String toString() {
		return leftside.toString() + " " + "=>" + " " + rightside.toString();
	}

}
