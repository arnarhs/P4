package GillespieSSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Simulator {
	int turns;
	List<StateSet> states;
	ReactionSet reactionSet;
	
	public Simulator(int nrturns, StateSet initialState, ReactionSet reactionset) {
		turns = nrturns;
		states = new ArrayList<StateSet>();
		states.add(initialState);
		reactionSet = reactionset;
	}
	
	public List<StateSet> Simulate() {
		Random random = new Random();
		StateSet nextState;
		
		for(int i = 0; i<turns; i++) {
			nextState = Step(random, states.get(i));
			states.add(nextState);
		}
		
		return states;
	}
	
	private StateSet Step(Random random, StateSet set) {
		//Select two random variables, uniformly distributed.
		double r1 = random.nextFloat();
		double r2 = random.nextFloat();
		
		//Compute propensities for all reactions given the state at time t (current state)
		reactionSet = ComputePropensities(reactionSet, set);
		
		//Compute a0
		double a0 = ComputeA0(set);
		
		//Pick time increment according to (1/a0) * ln[1/r1]
		double dt = PickTime(r1, set);
		
		//Pick reaction
		stoichoReaction reaction = PickReaction(a0, r2, reactionSet);
		
		//Update state
		StateSet state = new StateSet(set, dt, reaction);
		
		return state;
		
	}
	
	private stoichoReaction PickReaction(double a0, double r2, ReactionSet reactions) {
		stoichoReaction reaction;
		
		
		if(r2 > 0) {
			int i = 0;
			double propensity = reactions.set.get(i).currentPropensity;
			double currentReaction = propensity/a0;
			
			while(r2 < currentReaction && i < reactions.set.size()-1) {
				i++;
				propensity = propensity + reactions.set.get(i).currentPropensity;
				currentReaction = propensity/a0;
			}
			
			return reactions.set.get(i);
			
		}
		
		else {return null;}
		
	}
	
	private double PickTime(double r1, StateSet set) {
			return 1/ComputeA0(set)*Math.log(1/r1);
	}
	
	private ReactionSet ComputePropensities(ReactionSet reactionset, StateSet state) {
		ReactionSet set = reactionSet;
		for(stoichoReaction elem : reactionset.set) {
			elem.CalculatePropensity(state);
		}
		return reactionSet;
	}
	
	private double ComputeA0(StateSet set) {
		double val = 0; 
		
		for(stoichoReaction elem : reactionSet.set) {
			val = val + elem.currentPropensity;
		}
		
		return val;
	}
}
