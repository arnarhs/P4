package GillespieSSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import GUI.GraphData;

public class MeanGraph {
	public HashMap<Integer, Integer> points = new HashMap<Integer, Integer>(); 
	//public List<StateSet> meanList;
	public List<GraphData> gd;
	
	public double maxTime = 0.0; //time when the simulation stops
	public int amountOfPlots = 50; //amount of points we want to create the mean set from
	public double plotSpace = -1; // space between each point
	
	public MeanGraph() {}
	
	public MeanGraph(List<StateSet> ss) {
		//this.ss = ss;
		this.gd = declareMeanGraphs(ss.get(0));
		
		for(StateSet state : ss) {
			if (state.getTime() > this.maxTime) {
                this.maxTime = state.getTime();
            }
		}
		this.plotSpace = this.maxTime / this.amountOfPlots;
	}
		
	public double roundedTime (double d) {
		//double returnVal = 0;
		
		return Math.round(d/this.plotSpace) * this.plotSpace;
		
		/*
		for(int i = 0 ; i < this.amountOfPlots; i++) {
			if(d > this.plotSpace * i - this.plotSpace/2 && d < this.plotSpace * i + this.plotSpace/2) {
				returnVal = this.plotSpace*i;
			}
		}
		return returnVal;
		*/
	}

	public void addToMean(double amount, double time, int species) {
		//if later simulations have a higher max time amountOfPlots will be incremented
		if (time > this.maxTime) {
            while (this.amountOfPlots * this.plotSpace < time) {
            	amountOfPlots++;
            }
        }
		
		time = roundedTime(time);
		int currentPoints;
		double currentValue;
		
		if (this.gd.get(species).points.get(time) == null) {
			currentPoints = 0;
		} else {
			currentPoints = this.gd.get(species).points.get(time);
		}
		
		if (this.gd.get(species).Plots.get(time) == null) {
			currentValue = 0;
		} else {
			currentValue = this.gd.get(species).Plots.get(time);
		}
		
		
		this.gd.get(species).points.put(time, currentPoints + 1);
		
		currentPoints = this.gd.get(species).points.get(time);
		
		this.gd.get(species).Plots.put(time, 
				((currentValue * (currentPoints-1)) + amount) / currentPoints);
	}

	public List<GraphData> declareMeanGraphs(StateSet s) {
		Set<String> species = s.getSpecies().keySet();
		List<GraphData> gd = new ArrayList<GraphData>();
		for(String elem : species) {
			GraphData Mean = new GraphData(elem);
			gd.add(Mean);
		}
		return gd;
	}
	
	public void createMeanList(List<StateSet> ss) {
		if (this.plotSpace == -1) {
			this.gd = declareMeanGraphs(ss.get(0));
			
			for(StateSet state : ss) {
				if (state.getTime() > this.maxTime) {
	                this.maxTime = state.getTime();
	            }
			}
			this.plotSpace = this.maxTime / this.amountOfPlots;
		}
		
		for (StateSet elem : ss) {
			Set<String> keys = elem.getSpecies().keySet();
			double time = elem.getTime();
			int species = 0;
			
			for(String elems : keys) {
				addToMean(elem.getSpecies().get(elems), time, species);
				species++;
			}
		}
	}
}
