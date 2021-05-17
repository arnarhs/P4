package GUI;

import java.util.ArrayList;
import java.util.List;

import GUI.GraphData;

public class RunnerOutput {
	public List<GraphData> Graphs;
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
	
	public void AddGraphs(RunnerOutput output) {
		Graphs.addAll(output.Graphs);
	}
}
