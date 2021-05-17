package GillespieSSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulator {
	double runTime; //running time for the individual simulation
	int times = 1; //number of simulations
	List<stoichoReaction> reactionSet;
	StateSet initialState;
	
	public Simulator(double runTime, StateSet initialState, List<stoichoReaction> reactionset) {
		this.initialState = initialState;
		this.runTime = runTime;
		reactionSet = reactionset;
	}
	
	public Simulator(int nrtimes, double runTime, StateSet initialState, List<stoichoReaction> reactionset) {
		this(runTime, initialState, reactionset);
		times = nrtimes;
	}

	public List<SSAResult> Simulate() {
		Random random = new Random();
		List<SSAResult> simulationResult = new ArrayList<SSAResult>();
		
		for (int n = 0; n < times; n++) {
			ArrayList<StateSet> statesets = new ArrayList<StateSet>();
			statesets.add(initialState);
			SSAResult result = new SSAResult(n+1);
			int stateNum = 0; 
			for(double i = 0; i < runTime; ) {
				StateSet nextState = Step(random, statesets.get(stateNum));
				if(nextState == null) {
					nextState = new StateSet(statesets.get(statesets.size()-1).species, runTime);
					nextState.globalTime = runTime;
					statesets.add(nextState);
					i = runTime;
					break;
				}
				i += nextState.timeStep;
				nextState.globalTime = i;
				statesets.add(nextState);
				stateNum++;
			}
			
			result.stateSets = statesets;
			simulationResult.add(result);
		}
		
		
		
		
		return simulationResult;
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
		
		if(Double.isInfinite(dt)) {
			return null;
		}
		
		//Pick reaction
		stoichoReaction reaction = PickReaction(a0, r2, reactionSet);
		
		//Update state
		StateSet state = new StateSet(set, dt, reaction);
				
		return state;
	}
	
	private stoichoReaction PickReaction(double a0, double r2, List<stoichoReaction> reactions) {
		if(r2 > 0) {
			int i = 0;
			double propensity = reactions.get(i).currentPropensity;
			double currentReaction = propensity/a0;
			
			while(r2 > currentReaction && i < reactions.size()-1) {
				i++;
				propensity = propensity + reactions.get(i).currentPropensity;
				currentReaction = propensity/a0;
			}
			
			return reactions.get(i);
		}
		else {
			return null;
		}
	}
	
	private double PickTime(double r1, StateSet set) {
			return 1/ComputeA0(set)*Math.log(1/r1);
	}
	
	private List<stoichoReaction> ComputePropensities(List<stoichoReaction> reactionset, StateSet state) {
		for(stoichoReaction elem : reactionset) {
			elem.CalculatePropensity();
		}
		return reactionSet;
	}
	
	private double ComputeA0(StateSet set) {
		double val = 0; 
		
		for(stoichoReaction elem : reactionSet) {
			val = val + elem.currentPropensity;
		}
		
		return val;
	}
}
