package GUI;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

@SuppressWarnings("serial")
public class GraphPanel extends JPanel {
	
	private ChartPanel chartPanel;
	private JFreeChart jfreeChart;
	
	public GraphPanel() {
		super(new GridLayout());
	  	RunnerOutput seeker = new RunnerOutput();
	  	UpdateGraph(seeker);
	}

	private XYDataset createDataset(List<GraphData> graphData, XYLineAndShapeRenderer renderer) {
	    XYSeriesCollection collection = new XYSeriesCollection();
		
	    graphData.forEach((set) -> {
	    	XYSeries series = new XYSeries(set.Name + " " + set.Iteration);
    	    int seriesNumb = 0;
	    	set.Plots.forEach((x,y) -> {
	    		series.add(x, y);
	    	});
	    	collection.addSeries(series);
    		renderer.setSeriesPaint(seriesNumb, set.Color);
    		seriesNumb++;
	    });

	    return collection;
	}

	public void UpdateGraph(RunnerOutput output) {
		if (chartPanel != null) {
			this.remove(chartPanel);
			chartPanel = null;
		}
		
		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(true, false);
		
		jfreeChart = ChartFactory.createXYLineChart(output.GraphName, 
	    		output.HorizontalName,output.VerticalName,
	    		createDataset(output.Graphs, renderer),
	  	        PlotOrientation.VERTICAL,
	  	        true,true,false);

		XYPlot plot = (XYPlot)jfreeChart.getPlot();
    	plot.setRenderer(renderer);
		
		chartPanel = new ChartPanel(jfreeChart);
		chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
		chartPanel.setVisible(true);
		this.add(chartPanel);
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public JFreeChart getChart() {
		return jfreeChart;
	}
}