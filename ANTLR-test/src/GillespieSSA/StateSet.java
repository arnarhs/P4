package GillespieSSA;

import java.util.HashMap;
import java.util.Map;

public class StateSet {
	
	public Map<String, Double> species = new HashMap<String, Double>();
	public double timeStep;
	public double globalTime = 0;
	
	public StateSet(Map<String, Double> species, double time) {
		this.species = species;
		this.timeStep = time;
	}
	
	public StateSet(StateSet other) {
		this.species = new HashMap<String, Double>(other.species);
		this.timeStep = other.timeStep;
	}
	
	public StateSet(StateSet previousState, double timeIncrement, stoichoReaction reaction) {
		this.timeStep = previousState.timeStep + timeIncrement;
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
