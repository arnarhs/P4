package GillespieSSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GUI.GraphData;

public class MeanGraph {
	public HashMap<Integer, Integer> points = new HashMap<Integer, Integer>(); 
	public HashMap<Integer, Double> meanList = new HashMap<Integer, Double>(); 
	//public List<StateSet> meanList;
	public List<GraphData> gd;

	
	public MeanGraph(List<StateSet> ss) {
		//this.ss = ss;
		this.gd = declareMeanGraphs(ss.get(0));
	}
	
	public int roundedTime (double d) {
		int i = (int) Math.round(d);
		return i;
	}

	public void addToMean(double amountD, double timeD, int species) {
		int timeI = roundedTime(timeD);
		timeD = roundedTime(timeD);
		int amountI = roundedTime(amountD);
		int currentPoints;
		double currentValue;
		
		if(this.points.get(timeI) == null) {
			currentPoints = 0;
		}else {
			currentPoints = this.points.get(timeI);
		}
		
		if(this.gd.get(species).Plots.get(timeD) == null) {
			currentValue = 0;
		}else {
			currentValue = this.gd.get(species).Plots.get(timeD);
		}
		
		
		this.points.put(timeI, currentPoints + 1);
		
		currentPoints = this.points.get(timeI);
		
		this.gd.get(species).Plots.put(timeD, ((currentValue * (currentPoints-1)) + amountI) / currentPoints);
		//System.out.println("mean: " + this.gd.get(species).Name + " " + this.gd.get(species).Plots.get(timeD));

System.out.println(this.gd.get(species).Name + " {t= " + timeD + ", molecules= " + gd.get(species).Plots.get(timeD) + " }");

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
		
		for(StateSet elem : ss) {
			Set<String> keys = elem.species.keySet();
			double time = elem.time;
			//System.out.println(elem.species.keySet());
			int i = 0;
			for(String elems : keys) {
				addToMean(elem.species.get(elems), time, i);
				i++;
			}
		}
		
		
	}
	

}
