package models.expressions;

public class Reaction extends Expression{
	Expression leftside; //prey
	Expression rightside; //predator
	int propensity; 
	
	public Reaction(SpeciesComplex leftside, SpeciesComplex rightside, int propensity) {
		this.leftside = leftside;
		this.rightside = rightside;
		this.propensity = propensity;
	}
	
	
	@Override
	public String toString() {
		return leftside.toString() + "=>" + rightside.toString();
	}

}

