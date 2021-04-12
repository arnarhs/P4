package models.expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Statement;
import models.declarations.VariableDeclaration;

/*visitor pattern is a better choice to evaluate our data*/
public class ExpressionProcessor {
	List<Statement> list;
	public Map<String, Expression> values;
	
	public ExpressionProcessor(List<Statement> list) {
		this.list = list;
		values = new HashMap<>();
	}
	
	public List<String> getEvaluationResults() {
		List<String> evaluations = new ArrayList<>();
		
		for(Statement e : list) {
			if(e instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration) e;
				values.put(decl.id, decl.value);
			}
			else {
				String input = e.toString();
				int result = getEvalResult(e);
				evaluations.add(input + " = " + result);
			}
		}
		
		return evaluations;
	}
	
	private int getEvalResult(Statement e) {
		int result = 0;
		
		if(e instanceof Number) {
			Number num = (Number) e;
			result = num.num;
		} 
		else if (e instanceof Variable) {
			Variable var = (Variable) e;
			result = getEvalResult(values.get(var.ID));
		}
		else if (e instanceof Addition) {
			Addition add = (Addition) e;
			int left = getEvalResult(add.left);
			int right = getEvalResult(add.right);
			result = left + right;
		}
		else if (e instanceof Multiplication) {
			Multiplication add = (Multiplication) e;
			int left = getEvalResult(add.left);
			int right = getEvalResult(add.right);
			result = left * right;
		}
		
		return result;
	}
	
	public Integer parseIntOrNull(String value) {
	    try {
	        return Integer.parseInt(value);
	    } catch (NumberFormatException e) {
	        return null;
	    }
	}
}
