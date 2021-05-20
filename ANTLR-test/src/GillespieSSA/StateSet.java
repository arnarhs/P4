package GillespieSSA;

import java.util.HashMap;
import java.util.Map;

public class StateSet {
	
	private Map<String, Double> species = new HashMap<String, Double>();
	private double time = 0;
	
	public Map<String, Double> getSpecies() {
		return species;
	}

	public void setSpecies(Map<String, Double> species) {
		this.species = species;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public StateSet(Map<String, Double> species) {
		this.setSpecies(species);
	}
	
	public StateSet(StateSet other) {
		this.setSpecies(new HashMap<String, Double>(other.getSpecies()));
		this.setTime(other.getTime());
	}
	
	public StateSet(Map<String, Double> species, double time, Reaction reaction) {
		this.setSpecies(new HashMap<String, Double>(species));
		this.setTime(time);
		
		//If a reaction was selected update the state populations.
		if (reaction != null) {
			for (ReactionPair elem : reaction.prey) {
				double value = this.getSpecies().get(elem.species) - elem.multiplier;
				this.getSpecies().put(elem.species, value);
			}
			
			for (ReactionPair elem : reaction.predator) {
				double value = this.getSpecies().get(elem.species) + elem.multiplier;
				this.getSpecies().put(elem.species, value);
			}
		} 
	}
}
