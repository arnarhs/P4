package GillespieSSA;

import models.expressions.Expression;

public class ReactionPair extends Expression {
	public int multiplier = 1;
	public String species;
	
	public ReactionPair(String species) {
		this.species = species;
	}
	
	public ReactionPair(String species, int multiplier) {
		this.species = species;
		this.multiplier = multiplier;
	}
}
