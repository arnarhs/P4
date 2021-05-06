package GillespieSSA;

import java.util.List;

public class stoichoReaction {
	public List<ReactionPair> Prey;
	public List<ReactionPair> Predator;
	
	double ReactionConstant;
	double currentPropensity;
	
	public double CalculatePropensity(StateSet set) {
		double val = 1;
		for(ReactionPair elem : Prey) {
			for(int i = 0; i<elem.multiplier; i++) {
				double concentration = set.species.get(elem.species) - i;
				val = val * concentration;
			}
		}
		
		currentPropensity = val * ReactionConstant;
		return currentPropensity;
	}
	
}
