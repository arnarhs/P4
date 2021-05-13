package GUI;

import java.util.Hashtable;
import java.util.Map;

public class GraphData {
	public int Iteration;
	public String Name;
	public Hashtable<Double, Double> Plots;
	
	public GraphData(String name) {
		Name = name;
		Plots = new Hashtable<Double, Double>();
	}
	
	public GraphData(String name, int iteration) {
		Name = name;
		Plots = new Hashtable<Double, Double>();
		Iteration = iteration;
	}
	
	public void add(Double x, Double y) {
		Plots.put(x, y);
	}
	
	@Override
	public String toString() {
		String result = Name + " " + "Iteration" + " " + Iteration + "\n";
		
		for(Map.Entry<Double, Double> entry : Plots.entrySet()) {
			result += "\t" + "p: " + entry.getKey() + ", " + "t: " + entry.getValue() + "\n";
		}
		
		return result;
	}
	
}
