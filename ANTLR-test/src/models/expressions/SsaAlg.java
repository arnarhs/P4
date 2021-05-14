package models.expressions;

public class SsaAlg extends Expression {
	
	public String solution;
	public String reacList;
	public Expression loops;
	
	public SsaAlg(String solution, String reacList, Expression loops) {
		this.solution = solution;
		this.reacList = reacList;
		this.loops = loops;	
	}
	
	@Override
	public String toString() {
		return solution + reacList + loops.toString();
	}
}
