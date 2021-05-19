package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import GillespieSSA.MeanGraph;
import GillespieSSA.StateSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MeanTest {
	//public List<StateSet> list;
	public MeanGraph meanTool = new MeanGraph();
	
	public List<StateSet> createTestList(int j, int k, int stateSets) {
		
		List<StateSet> list = new ArrayList<StateSet>();
		
		for(int i = 1 ; i <= stateSets ; i++) {
			Map<String, Double> species = new HashMap<String, Double>();
			species.put("a", 1.0*i*j); 
			species.put("b", 2.0*i*j); 
			species.put("c", 3.0*i*j); 
			species.put("d", 4.0*i*j); 
			StateSet ss = new StateSet(species, 1.0*i*k);
			list.add(ss);
		}
		return list;
		
	}
	
	
	@Test
	void test1() {
		
		List<StateSet> list = createTestList(1,1, this.meanTool.amountOfPlots);
		MeanGraph mean = new MeanGraph(list);
		mean.createMeanList(list);
		
		assertEquals(this.meanTool.amountOfPlots, list.size()); //list should have 30 stateSets
		assertEquals(4, mean.gd.size()); //should a GraphData for a, b, c and d
		assertEquals(this.meanTool.amountOfPlots, mean.gd.get(0).Plots.size());
		
		//each state has their own plot space. making the set its own mean
		assertEquals(list.get(0).species.get("a") , mean.gd.get(0).Plots.get(1.0));
		assertEquals(list.get(2).species.get("a") , mean.gd.get(0).Plots.get(3.0));
		assertEquals(list.get(5).species.get("a") , mean.gd.get(0).Plots.get(6.0));
		assertEquals(list.get(20).species.get("a") , mean.gd.get(0).Plots.get(21.0));
		assertEquals(list.get(0).species.get("c") , mean.gd.get(2).Plots.get(1.0));
		assertEquals(list.get(2).species.get("c") , mean.gd.get(2).Plots.get(3.0));
		assertEquals(list.get(5).species.get("c") , mean.gd.get(2).Plots.get(6.0));
		assertEquals(list.get(20).species.get("c") , mean.gd.get(2).Plots.get(21.0));
	}
	
	@Test
	void test2() {
		
		List<StateSet> list = createTestList(1,1,100);
		MeanGraph mean = new MeanGraph(list);
		mean.createMeanList(list);
		
		assertEquals(100, list.size()); //list should have 30 stateSets
		assertEquals(4, mean.gd.size()); //should a GraphData for a, b, c and d
		assertEquals(this.meanTool.amountOfPlots + 1, mean.gd.get(0).Plots.size());
		assertEquals(mean.plotSpace, 3.3333333333333335);
		assertEquals(mean.maxTime, 100);
		//assertEquals(mean.plotSpace/mean.maxTime, mean.plotSpace);
		
		//each state has their own plot space. making the set its own mean
		assertEquals(40.0 , mean.gd.get(0).Plots.get(40.0));
		assertEquals(80.0 , mean.gd.get(1).Plots.get(40.0));
		assertEquals(120.0 , mean.gd.get(2).Plots.get(40.0));
		assertEquals(160.0 , mean.gd.get(3).Plots.get(40.0));
		assertEquals(96.5 , mean.gd.get(0).Plots.get(96.66666666666667));
		assertEquals(193.0 , mean.gd.get(1).Plots.get(96.66666666666667));
		assertEquals(289.5 , mean.gd.get(2).Plots.get(96.66666666666667));
		assertEquals(386.0 , mean.gd.get(3).Plots.get(96.66666666666667));
	}

}
