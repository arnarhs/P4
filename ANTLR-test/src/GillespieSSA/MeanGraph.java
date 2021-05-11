package GillespieSSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MeanGraph {
	public HashMap<Integer, Integer> points = new HashMap<Integer, Integer>(); 
	public HashMap<Integer, Double> meanList = new HashMap<Integer, Double>(); 


	
	public MeanGraph() {
	}
	
	public int roundedTime (double d) {
		int i = (int) Math.round(d*100);
		return i;
	}

	public void addToMean(double amountD, double timeD) {
		int timeI = roundedTime(timeD);
		int amountI = roundedTime(amountD);
		int currentPoints;
		double currentValue;
		
		if(this.points.get(timeI) == null) {
			currentPoints = 0;
		}else {
			currentPoints = this.points.get(timeI);
		}
		
		if(this.meanList.get(timeI) == null) {
			currentValue = 0;
		}else {
			currentValue = this.meanList.get(timeI);
		}
		
		
		this.points.put(timeI, currentPoints + 1);
		
		currentPoints = this.points.get(timeI);
		
		this.meanList.put(timeI, ((currentValue * (currentPoints-1)) + amountI) / currentPoints);
	}

	
	//public void addToMean()
	
	public void createMeanList(List<StateSet> ss) {
		
		for(StateSet elem : ss) {
			Set<String> keys = elem.species.keySet();
			double time = elem.time;
			
			for(String elems : keys) {
				addToMean(elem.species.get(elems), time);
				
			}
		}
		
		
	}
	

}
