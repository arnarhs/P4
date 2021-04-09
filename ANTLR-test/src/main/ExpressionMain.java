package main;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import antlr.expressionParser;

public class ExpressionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static expressionParser getParser(String filename) {
		
		expressionParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(filename);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return parser;
	}

}
