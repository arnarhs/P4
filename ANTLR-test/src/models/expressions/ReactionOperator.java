package models.expressions;

public class ReactionOperator {
	Expression leftside;
	Expression rightside;
	
	public ReactionOperator(Expression leftside, Expression rightside) {
		this.leftside = leftside;
		this.rightside = rightside;
	}
	
	//FIX TO STRING method, Make it so that it takes in to account different operators
	@Override
	public String toString() {
		return leftside.toString() + "=>" + rightside.toString();
	}

}
