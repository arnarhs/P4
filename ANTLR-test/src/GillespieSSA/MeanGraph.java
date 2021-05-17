package GillespieSSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GUI.GraphData;

public class MeanGraph {
	public HashMap<Integer, Integer> points = new HashMap<Integer, Integer>(); 
	//public List<StateSet> meanList;
	public List<GraphData> gd;
	
	public double maxTime = 0.0; //time when the simulation stops
	public int amountOfPlots = 30; //amount of points we want to create the mean set from
	public double plotSpace; // space between each point
	
	public MeanGraph(List<StateSet> ss) {
		//this.ss = ss;
		this.gd = declareMeanGraphs(ss.get(0));
		
		for(StateSet state : ss) {
			if (state.time > this.maxTime) {
	                this.maxTime = state.time;
	            }
		}
		this.plotSpace = this.maxTime / this.amountOfPlots;
		
	}
	
	
	
	public double roundedTime (double d) {
		double returnVal = 0;
		
		for(int i = 0 ; i < this.amountOfPlots; i++) {
			if(d > this.plotSpace * i - this.plotSpace/2 && d < this.plotSpace * i + this.plotSpace/2) {
				returnVal = this.plotSpace*i;
			}
		}
		return returnVal;
	}

	public void addToMean(double amount, double time, int species) {
		time = roundedTime(time);
		int currentPoints;
		double currentValue;
		
		if(this.gd.get(species).points.get(time) == null) {
			currentPoints = 0;
		}else {
			currentPoints = this.gd.get(species).points.get(time);
		}
		
		if(this.gd.get(species).Plots.get(time) == null) {
			currentValue = 0;
		}else {
			currentValue = this.gd.get(species).Plots.get(time);
		}
		
		
		this.gd.get(species).points.put(time, currentPoints + 1);
		
		currentPoints = this.gd.get(species).points.get(time);
		
		this.gd.get(species).Plots.put(time, 
				((currentValue * (currentPoints-1)) + amount) / currentPoints);
		//System.out.println("mean: " + this.gd.get(species).Name + " " + this.gd.get(species).Plots.get(timeD));

System.out.println(this.gd.get(species).Name + " {t= " + time + ", molecules= " + gd.get(species).Plots.get(time) + " }");

	}

	public List<GraphData> declareMeanGraphs(StateSet s) {
		Set<String> species = s.species.keySet();
		List<GraphData> gd = new ArrayList<GraphData>();
		for(String elem : species) {
			GraphData Mean = new GraphData(elem);
			gd.add(Mean);
		}
		return gd;
	}
	//public void addToMean()
	
	public void createMeanList(List<StateSet> ss) {
		
		//if later simulations have a higher max time, 
		for(StateSet state : ss) {
			if (state.time > this.maxTime) {
				
	                while(this.amountOfPlots * this.plotSpace < state.time) {
	                	amountOfPlots++;
	                }
	            }
		}
		
		for(StateSet elem : ss) {
			Set<String> keys = elem.species.keySet();
			double time = elem.time;
			//System.out.println(elem.species.keySet());
			int species = 0;
			for(String elems : keys) {
				addToMean(elem.species.get(elems), time, species);
				species++;
			}
		}
		
		
	}
	

}
