package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import GillespieSSA.ReactionPair;
import GillespieSSA.StateSet;
import GillespieSSA.stoichoReaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SSATest {
	
	
	
	@Test
	void test() {
		// should return list of 2 statesets with {1, 2, 3, 4}, t=1 and {2, 4, 6, 8}, t=2
		List<StateSet> lss = TestMethods.createTestList(1, 1, 2); 
		
		assertEquals(1, lss.get(0).species.get("a"));
		assertEquals(3, lss.get(0).species.get("c"));
		assertEquals(4, lss.get(1).species.get("b"));
		assertEquals(8, lss.get(1).species.get("d"));
		
		assertEquals(2, lss.get(1).timeStep);
		
		//tests stoicho reaction
		//StateSet ss = lss.get(0);
		//Map<String, Double> species = new HashMap<String, Double>();
		List<ReactionPair> prey = new ArrayList<ReactionPair>();
		List<ReactionPair> predator = new ArrayList<ReactionPair>();
		
		ReactionPair rpA = new ReactionPair("a", 1);
		ReactionPair rpB = new ReactionPair("b", 2);
		ReactionPair rpC = new ReactionPair("c");
		ReactionPair rpD = new ReactionPair("d", 2);
		
		assertEquals(1, rpC.multiplier); // test if multiplier is automatically assigned
		
		prey.add(rpA);
		prey.add(rpB);
		predator.add(rpC);
		predator.add(rpD);
		
		//StateSet ss = new StateSet(lss.get(0));
		
		
		stoichoReaction sr1 = new stoichoReaction(prey, predator, 0.5, new StateSet(lss.get(0)));
		assertEquals(1, sr1.CalculatePropensity()); // should equal 1
		
		
		
		stoichoReaction sr2 = new stoichoReaction(prey, predator, 1.5, new StateSet(lss.get(0)));
		assertEquals(3, sr2.CalculatePropensity()); // should equal 3
	}

}
