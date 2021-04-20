package models.expressions;

public class ReactionExpr extends Expression {
	public Expression left; //prey
	public Expression right; //predator
	public Expression constant; 
	
	public ReactionExpr(Expression left, Expression right, Expression constant) {
		this.left = left;
		this.right = right;
		this.constant = constant;
	}
	
	public ReactionExpr(Expression left, Expression right) {
		this.left = left;
		this.right = right;
		this.constant = null;
	}
	
	@Override
	public String toString() {
		return left.toString() + " => " + right.toString() + " (" + constant.toString() + ")";
	}
}
