package GUI;

import java.awt.List;
import java.util.Hashtable;

import org.jfree.data.xy.XYSeries;

public class ExampleRunner implements Runner {

	@Override
	public RunnerOutput Run(String code) {
		RunnerOutput output = new RunnerOutput();
		Parse(output);
		return output;
	}

	public void Parse(RunnerOutput output) {
		GraphData series1 = new GraphData("Species A");
		GraphData series2 = new GraphData("Species B");
		GraphData series3 = new GraphData("Species C");
	    
	    series1.add(1.0, 2.0);
	    series1.add(2.0, 3.0);
	    series1.add(3.0, 2.5);
	    series1.add(3.5, 2.8);
	    series1.add(4.2, 6.0);
	    
	    series2.add(2.0, 1.0);
	    series2.add(2.5, 2.4);
	    series2.add(3.2, 1.2);
	    series2.add(3.9, 2.8);
	    series2.add(4.6, 3.0);
	    
	    series3.add(1.2, 4.0);
	    series3.add(2.5, 4.4);
	    series3.add(3.8, 4.2);
	    series3.add(4.3, 3.8);
	    series3.add(4.5, 4.0);

	    output.Graphs.add(series1);
	    output.Graphs.add(series2);
	    output.Graphs.add(series3);
	    		
		//output.Coordinates = someCoordinates;
		output.Output = "Seeking Tanis. Runner available.";
	}
}

