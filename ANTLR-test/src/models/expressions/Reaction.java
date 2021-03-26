package models.expressions;

public class Reaction extends Expression{
	ReactionExpr leftside; //prey
	ReactionExpr rightside; //predator
	Variable constant; 
	
	public Reaction(ReactionExpr leftside, ReactionExpr rightside, Variable constant) {
		this.leftside = leftside;
		this.rightside = rightside;
		this.constant = constant;
	}
	
	
	@Override
	public String toString() {
		return leftside.toString() + "=>" + rightside.toString();
	}

}

