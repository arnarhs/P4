package GillespieSSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import GUI.GraphData;

public class MeanGraph {
	
	public HashMap<Integer, Integer> points = new HashMap<Integer, Integer>(); 
	public List<GraphData> gd;
	
	public double maxTime = 0.0; //time when the simulation stops
	public int amountOfPlots = 10; //amount of points we want to create the mean set from
	public double plotSpace = -1; // space between each point
	
	private boolean initialized = false;
	
	public boolean IsInitialized() {
		return initialized;
	}
	
	public void Initialize(List<StateSet> ss) {
		initialized = true;
		gd = declareMeanGraphs(ss.get(0));
		maxTime = ss.get(ss.size() - 1).getTime();
		plotSpace = maxTime / amountOfPlots;
	}
	
	public MeanGraph() {}
	
	public MeanGraph(List<StateSet> ss) {
		gd = declareMeanGraphs(ss.get(0));
		
		for(StateSet state : ss) {
			if (state.getTime() > maxTime) {
                maxTime = state.getTime();
            }
		}
		plotSpace = maxTime / amountOfPlots;
	}
		
	public void createMeanList(List<StateSet> ss) {
		for (StateSet elem : ss) {
			Set<String> keys = elem.getSpecies().keySet();
			double time = elem.getTime();
			int species = 0;
			
			for (String elems : keys) {
				addToMean(elem.getSpecies().get(elems), time, species);
				species++;
			}
		}
	}
	
	public List<GraphData> declareMeanGraphs(StateSet s) {
		Set<String> species = s.getSpecies().keySet();
		List<GraphData> gd = new ArrayList<GraphData>();
		for (String elem : species) {
			GraphData Mean = new GraphData(elem);
			gd.add(Mean);
		}
		return gd;
	}
	
	public void addToMean(double amount, double time, int species) {
		//if later simulations have a higher max time amountOfPlots will be incremented
		if (time > maxTime) {
            while (amountOfPlots * plotSpace < time) {
            	amountOfPlots++;
            }
        }
		
		time = roundedTime(time);
		int currentPoints;
		double currentValue;
		
		if (gd.get(species).points.get(time) == null) {
			currentPoints = 0;
		} else {
			currentPoints = gd.get(species).points.get(time);
		}
		
		if (gd.get(species).Plots.get(time) == null) {
			currentValue = 0;
		} else {
			currentValue = gd.get(species).Plots.get(time);
		}
		
		gd.get(species).points.put(time, currentPoints + 1);
		
		currentPoints = gd.get(species).points.get(time);
		
		gd.get(species).Plots.put(time, 
				((currentValue * (currentPoints-1)) + amount) / currentPoints);
	}

	public double roundedTime (double d) {	
		return Math.round(d/plotSpace) * plotSpace;
	}
}
