package GUI;

import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GraphData {
	public int Iteration;
	public String Name;
	public LinkedHashMap<Double, Double> Plots;
	public HashMap<Double, Integer> points = new HashMap<Double, Integer>();
	public Color Color;
	
	public GraphData(String name) {
		Name = name;
		Plots = new LinkedHashMap<Double, Double>();
	}
	
	public GraphData(String name, int iteration) {
		this(name);
		Iteration = iteration;
	}
	
	public GraphData(String name, int iteration, Color color) {
		this(name, iteration); 
		Color = color;
	}
	
	public void add(Double x, Double y) {
		Plots.put(x, y);
	}
	
	@Override
	public String toString() {
		String result = Name + " " + "Iteration" + " " + Iteration + "\n";
		
		for(Map.Entry<Double, Double> entry : Plots.entrySet()) {
			result += "\t" + "p: " + entry.getValue() + ", " + "t: " + entry.getKey() + "\n";
		}
		
		return result;
	}
}