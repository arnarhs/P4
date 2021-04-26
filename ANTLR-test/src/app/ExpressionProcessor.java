package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Statement;
import models.declarations.ListDeclaration;
import models.declarations.VariableDeclaration;
import models.expressions.Addition;
import models.expressions.Bracket;
import models.expressions.Division;
import models.expressions.ElseIfStatement;
import models.expressions.ElseStatement;
import models.expressions.Expression;
import models.expressions.IfStatement;
import models.expressions.LogicalOperator;
import models.expressions.Multiplication;
import models.expressions.Number;
import models.expressions.RelationalOperator;
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
			if (e instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration) e;
				values.put(decl.id, decl);
			}
			else if (e instanceof ListDeclaration) {
				ListDeclaration listDecl = (ListDeclaration) e;
				values.put(listDecl.id, listDecl);
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
		
		if (e instanceof Number) {
			Number num = (Number) e;
			return Double.parseDouble(num.num);
		} 
		else if (e instanceof Variable) {
			Variable var = (Variable) e;
			Expression varDecl = values.get(var.ID);
			
			if (varDecl instanceof VariableDeclaration) {
				return getEvalResult(((VariableDeclaration) varDecl).value);
			} else {
				return 0;
			}
		}
		else if (e instanceof Bracket) {
			return getEvalResult(((Bracket) e).expr);
		}
		else if (e instanceof Addition) {
			Addition add = (Addition) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			return left + right;
		}
		else if (e instanceof Multiplication) {
			Multiplication add = (Multiplication) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			return left * right;
		}
		else if (e instanceof Division) {
			Division add = (Division) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			return left / right;
		}
		else if (e instanceof Subtraction) {
			Subtraction add = (Subtraction) e;
			double left = getEvalResult(add.left);
			double right = getEvalResult(add.right);
			return left - right;
		}
		else if (e instanceof LogicalOperator) {
			LogicalOperator log = (LogicalOperator) e;
			boolean left = BoolCheck(log.left);
			boolean right = BoolCheck(log.right);
			
			switch(log.operator) {
				case "||" : 
					return (left || right) ? 1 : 0;
				case "&&" : 
					return (left && right) ? 1 : 0;
			}
		}
		else if (e instanceof RelationalOperator) {
			RelationalOperator rel = (RelationalOperator) e;
			double left = getEvalResult(rel.left);
			double right = getEvalResult(rel.right);
			
			switch(rel.operator) {
				case "<" : 
					return (left < right) ? 1 : 0;
				case "<=" : 
					return (left <= right) ? 1 : 0;
				case ">" : 
					return (left > right) ? 1 : 0;
				case ">=" : 
					return (left >= right) ? 1 : 0;
				case "==" : 
					return (left == right) ? 1 : 0;
				case "!=" : 
					return (left != right) ? 1 : 0;
			}
		}

		return 0;
	}
	
	public boolean BoolCheck(Expression e) {
		if (e.toString().equals("true")) return true;
		if (e.toString().equals("false")) return false;
		return (getEvalResult(e) != 0) ? true : false;
	}
}
