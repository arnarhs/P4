package GillespieSSA;

import java.util.HashMap;
import java.util.Map;

public class StateSet {
	public Map<String, Double> species = new HashMap<String, Double>();
	public double time;
	
	public StateSet(Map<String, Double> species, double time) {
		this.species = species;
		this.time = time;
	}
	
	public StateSet(StateSet other) {
		this.species = new HashMap<String, Double>(other.species);
		this.time = other.time;
	}
	
	public StateSet(StateSet previousState, double timeIncrement, stoichoReaction reaction) {
		this.time = previousState.time + timeIncrement;
		this.species = new HashMap<String, Double>(previousState.species);
		
		//If a reaction was selected update the state populations.
		if(reaction != null) {
			for(ReactionPair elem : reaction.Prey) {
				double value = this.species.get(elem.species) - elem.multiplier;
				this.species.put(elem.species, value);
			}
			
			for(ReactionPair elem : reaction.Predator) {
				double value = this.species.get(elem.species) + elem.multiplier;
				this.species.put(elem.species, value);
			}
		} 
	}
}
