package GillespieSSA;

import java.util.ArrayList;
import java.util.List;

public class SSAResult {
	int iterationNr;
	public List<StateSet> stateSets;
	
	public SSAResult(int nr) {
		iterationNr = nr;
		stateSets = new ArrayList<StateSet>();
	}
	
}
