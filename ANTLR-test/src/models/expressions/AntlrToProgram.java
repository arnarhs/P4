package models.expressions;

import antlr.expressionBaseVisitor;
import antlr.expressionParser.ProgramContext;
import models.Program;

public class AntlrToProgram extends expressionBaseVisitor<Program>{

	@Override
	public Program visitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProgram(ctx);
	}

}
