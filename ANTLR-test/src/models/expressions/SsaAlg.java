package models.expressions;

public class SsaAlg extends Expression {
	
	public String solution;
	public String reacList;
	public Expression loops;
	public Expression repeats;
	
	public SsaAlg(String solution, String reacList, Expression loops) {
		this.solution = solution;
		this.reacList = reacList;
		this.loops = loops;	
	}
	
	public SsaAlg(String solution, String reacList, Expression loops, Expression repeats) {
		this(solution, reacList, loops);
		this.repeats = repeats;
	}
	
	@Override
	public String toString() {
		return solution + reacList + loops.toString();
	}
}
