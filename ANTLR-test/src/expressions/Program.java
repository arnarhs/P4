package expressions;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public List<Expression> expressions;
	
	public Program() {
		this.expressions = new ArrayList<>();
	}
	
	public void AddExpression(Expression expr) {
		expressions.add(expr);
	}

}
