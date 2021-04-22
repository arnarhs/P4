package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Statement;
import models.declarations.ListDeclaration;
import models.declarations.VariableDeclaration;
import models.expressions.Addition;
import models.expressions.Assign;
import models.expressions.Bracket;
import models.expressions.Division;
import models.expressions.ElseIfStatement;
import models.expressions.ElseStatement;
import models.expressions.Expression;
import models.expressions.IfStatement;
import models.expressions.Multiplication;
import models.expressions.Number;
import models.expressions.Subtraction;
import models.expressions.Variable;

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
		
		for (Statement e : list) {
			if(e instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration) e;
				values.put(decl.id, decl.value);
			}
			else if(e instanceof ListDeclaration) {
				ListDeclaration listDecl = (ListDeclaration) e;
				for(int i = 0; i < listDecl.Length(); i++) {
					values.put(listDecl.id, listDecl.Get(i));
				}
			}
			else if(e instanceof Assign) {
				Assign assign = (Assign) e;
				values.put(assign.id, assign.value); // Assume we are only dealing with numbers at the moment
			}
			else {
				String input = e.toString();
				double result = getEvalResult(e);
				evaluations.add(input + " = " + result);
			}
		}
		
		return evaluations;
	}
	
	private double getEvalResult(Statement e) {
		double result = 0;
		
		if(e instanceof Number) {
			Number num = (Number) e;
			result = Double.parseDouble(num.num);
		} 
		else if (e instanceof Variable) {
			Variable var = (Variable) e;
			result = getEvalResult(values.get(var.ID));
		}
		else if (e instanceof Bracket) {
			result = getEvalResult(((Bracket) e).expr);
		}
		else if (e instanceof Addition) {
			Addition add = (Addition) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			result = left + right;
		}
		else if (e instanceof Multiplication) {
			Multiplication add = (Multiplication) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			result = left * right;
		}
		else if (e instanceof Division) {
			Division add = (Division) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			result = left / right;
		}
		else if (e instanceof Subtraction) {
			Subtraction add = (Subtraction) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			result = left - right;
		}
		/*
		else if (e instanceof IfStatement) {
			
		}
		else if (e instanceof ElseIfStatement) {
			
		}
		else if (e instanceof ElseStatement) {
	
		}
		*/
		return result;
	}
}
