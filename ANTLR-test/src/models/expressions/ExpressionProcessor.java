package models.expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.declarations.VariableDeclaration;

/*visitor pattern is a better choice to evalutae our data*/
public class ExpressionProcessor {
	List<Expression> list;
	public Map<String, String> values;
	
	public ExpressionProcessor(List<Expression> list) {
		this.list = list;
		values = new HashMap<>();
	}
	
	public List<String> getEvaluationResults() {
		List<String> evaluations = new ArrayList<>();
		
		for(Expression e : list) {
			if(e instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration) e;
				values.put(decl.id, decl.value);
			}
			else {
				String input = e.toString();
				int result = getEvalResult(e);
				evaluations.add(input + " is " + result);
			}
		}
		
		return evaluations;
	}

	/*Part 5 30 min to fix it*/
	private int getEvalResult(Expression e) {
		// TODO Auto-generated method stub
		return 0;
	}
}
