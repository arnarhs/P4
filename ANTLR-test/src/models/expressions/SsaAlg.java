package models.expressions;

public class SsaAlg extends Expression {
	
	public Expression solution;
	public Expression reacList;
	public Expression loops;
	
	public SsaAlg(Expression solution, Expression reacList, Expression loops) {
			this.solution = solution;
			this.reacList = reacList;
			this.loops = loops;	
	}
	
	@Override
	public String toString() {
		return solution.toString() + reacList.toString() + loops.toString();
	}
}
