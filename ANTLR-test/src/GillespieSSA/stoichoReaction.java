package GillespieSSA;

import java.util.List;

public class stoichoReaction {
	public List<ReactionPair> Prey;
	public List<ReactionPair> Predator;
	public StateSet internalState;
	
	double ReactionConstant;
	double currentPropensity;
	
	public stoichoReaction(List<ReactionPair> prey, List<ReactionPair> predator, double constant, StateSet set) {
		this.Prey = prey;
		this.Predator = predator;
		this.ReactionConstant = constant;
		this.internalState = set;
	}
	
	public double CalculatePropensity(StateSet set) {
        double val = 1;
        for (ReactionPair elem : Prey) {        	
            for (int i = 0; i < elem.multiplier; i++) {
                double concentration = set.species.get(elem.species);
                val = val * concentration;
                internalState.species.put(elem.species, concentration - 1);
            }
        }

        currentPropensity = val * ReactionConstant;
        
        System.out.println(currentPropensity);
        
        return currentPropensity;
    }
}
