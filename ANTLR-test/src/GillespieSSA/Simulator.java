package GillespieSSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulator {
	
	private double runTime; //running time for the individual simulation
	private List<Reaction> reactions = new ArrayList<Reaction>();
	private List<StateSet> states = new ArrayList<StateSet>(); 
	
	public Simulator(double runTime, StateSet initialState, List<Reaction> reactions) {
		states.add(initialState);
		this.runTime = runTime;
		this.reactions = reactions;
	}

	public List<StateSet> Simulate() {
		states.add(states.get(0));
		
		for (double i = 0; i < runTime;) {
			StateSet nextState = Step(currentState());
			
			if (nextState == null) {
				break;
			}
			
			i += nextState.getTime();
			nextState.setTime(i);
			states.add(nextState);
		}
		
		return states;
	}
	
	private StateSet Step(StateSet currentState) {
		Random r = new Random();	
		List<Double> propensities = ComputePropensities(currentState);
		double a0 = ComputeA0(propensities);
		double dt = PickTime(a0, r.nextFloat());
		
		if (Double.isInfinite(dt)) {
			return null;
		}
		
		Reaction reaction = PickReaction(propensities, a0, r.nextFloat());			
		return new StateSet(currentState.getSpecies(), dt, reaction);
	}
	
	private Reaction PickReaction(List<Double> propensities, double a0, double r2) {
		double cumulativeProbability = 0.0;
		
		for (int i = 0; i < propensities.size(); i++) {
			cumulativeProbability += (propensities.get(i)/a0);
			
		    if (r2 <= cumulativeProbability) {
		        return reactions.get(i);
		    }
		}
		return null;
	}
	
	private List<Double> ComputePropensities(StateSet state) {
		List<Double> propensities = new ArrayList<Double>();
		for (Reaction reac : reactions) {
			propensities.add(reac.CalculatePropensity(new StateSet(state)));
		}
		return propensities;
	}
	
	private double ComputeA0(List<Double> propensities) {
		double a0 = 0; 
		for (double prop : propensities) {
			a0 += prop;
		}
		return a0;
	}
	
	private double PickTime(double a0, double r1) {
		return (1/a0) * Math.log(1/r1);
	}
	
	private StateSet currentState() {
		return states.get(states.size() - 1);
	}
}
