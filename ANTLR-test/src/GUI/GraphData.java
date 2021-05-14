package GUI;

import java.util.HashMap;
import java.util.Hashtable;

public class GraphData {
	public String Name;
	public Hashtable<Double, Double> Plots;
	public HashMap<Double, Integer> points = new HashMap<Double, Integer>(); 
	
	public GraphData(String name) {
		Name = name;
		Plots = new Hashtable<Double, Double>();
	}
	
	public void add(Double x, Double y) {
		Plots.put(x, y);
	}
}
