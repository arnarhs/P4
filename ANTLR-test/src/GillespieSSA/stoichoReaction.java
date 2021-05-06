package GillespieSSA;

import java.util.List;

public class stoichoReaction {
	public List<ReactionPair> Prey;
	public List<ReactionPair> Predator;
	
	double ReactionConstant;
	double currentPropensity;
	
	public stoichoReaction(List<ReactionPair> prey, List<ReactionPair> predator, double constant) {
		this.Prey = prey;
		this.Predator = predator;
		this.ReactionConstant = constant;
	}
	
	public double CalculatePropensity(StateSet set) {
        StateSet internalState = set; 
        double val = 1;
        for(ReactionPair elem : Prey) {
            for(int i = 0; i<elem.multiplier; i++) {
                double concentration = set.species.get(elem.species);
                val = val * concentration;
                internalState.species.put(elem.species, concentration - 1);
            }
        }

        currentPropensity = val * ReactionConstant;
        return currentPropensity;
    }
	
}
