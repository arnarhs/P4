package GillespieSSA;

import java.util.List;

public class Reaction {
	public List<ReactionPair> prey;
	public List<ReactionPair> predator;
	private double reactionConstant;
	private double currentPropensity;
	
	public Reaction(List<ReactionPair> prey, List<ReactionPair> predator, double constant) {
		this.prey = prey;
		this.predator = predator;
		this.reactionConstant = constant;
	}
	
	public double CalculatePropensity(StateSet currentState) {
        double val = 1;
        
        for (ReactionPair elem : prey) {        	
            for (int i = 0; i < elem.multiplier; i++) {
                double concentration = currentState.getSpecies().get(elem.species);
                val = val * concentration;
                if (concentration != 0) {
                	currentState.getSpecies().put(elem.species, concentration - 1);
                }
            }
        }     
        
        currentPropensity = val * reactionConstant;
        return currentPropensity;
    }
}
