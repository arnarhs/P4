package GillespieSSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StateSet {
	Map<String, Double> species = new HashMap<String, Double>();
	double time;
	
	public StateSet(Map<String, Double> species, double time) {
		this.species = species;
		this.time = time;
	}
	
	public StateSet(StateSet previousState, double timeIncrement, stoichoReaction reaction) {
		time = previousState.time + timeIncrement;
		species = previousState.species;
		
		//If a reaction was selected update the state populations.
		if(reaction != null) {
			for(ReactionPair elem : reaction.Prey) {
				double value = species.get(elem.species) - elem.multiplier;
				species.put(elem.species, value);
			}
			
			for(ReactionPair elem : reaction.Predator) {
				double value = species.get(elem.species) + elem.multiplier;
				species.put(elem.species, value);
			}
		}
	}
}
