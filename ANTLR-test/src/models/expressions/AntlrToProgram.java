package models.expressions;

import java.util.ArrayList;
import java.util.List;

import antlr.expressionBaseVisitor;
import antlr.expressionParser.ProgramContext;
import models.Program;

public class AntlrToProgram extends expressionBaseVisitor<Program>{

	public List<String> semanticErrors;
	
	@Override
	public Program visitProgram(ProgramContext ctx) {
		Program prog = new Program();
		
		semanticErrors = new ArrayList<>();
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
		
		for (int i = 0; i < ctx.getChildCount() - 1; i++) {
			prog.AddExpression(exprVisitor.visit(ctx.getChild(i)));
		}
		
		return prog;
	}

}
