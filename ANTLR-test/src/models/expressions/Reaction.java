package models.expressions;

public class Reaction extends Expression{
	public ReactionExpr leftside; //prey
	public ReactionExpr rightside; //predator
	public Expression constant; 
	
	public Reaction(ReactionExpr leftside, ReactionExpr rightside, Expression constant) {
		this.leftside = leftside;
		this.rightside = rightside;
		this.constant = constant;
	}
	
	
	@Override
	public String toString() {
		return leftside.toString() + "=>" + rightside.toString() + "(" + constant.toString() + ")";
	}

}

