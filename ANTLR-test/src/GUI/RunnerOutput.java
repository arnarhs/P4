package GUI;

import java.util.ArrayList;

import GUI.GraphData;

public class RunnerOutput {
	public ArrayList<GraphData> Graphs;
	public String Output;
	public String GraphName;
	public String HorizontalName;
	public String VerticalName;
	
	public RunnerOutput() {
		Graphs = new ArrayList<GraphData>();
		GraphName = "Results";
		HorizontalName = "Time";
		VerticalName = "Concentration";
	}
}
