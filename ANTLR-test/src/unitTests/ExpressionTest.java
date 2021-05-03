package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.jupiter.api.Test;

import antlr.expressionLexer;
import antlr.expressionParser;
import app.SyntaxErrorListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.expressions.Addition;
import models.expressions.Expression;

class ExpressionTest {
	
    public List<Token> getTokensFromText(String txt) {
        List<Token> tokens= new ArrayList<>();
		try {
			CharStream input = CharStreams.fromString(txt);
			
			expressionLexer lexer = new expressionLexer(input);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
	        tokenStream.fill();
	        tokens = tokenStream.getTokens();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tokens;
    }
    
    
    public List<Token> getTokensFromFile(String filename) {
        List<Token> tokens= new ArrayList<>();
		try {
			CharStream input = CharStreams.fromFileName(filename);
			
			expressionLexer lexer = new expressionLexer(input);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
	        tokenStream.fill();
	        tokens = tokenStream.getTokens();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tokens;
    }
    
	@Test
	public void test() {
		List<Token> tokens = getTokensFromText("species a : 5");
		
	    assertEquals(5, tokens.size()); // includes EOF
	    assertEquals(expressionLexer.NUMT, tokens.get(0).getType());
	    assertEquals(expressionLexer.ID, tokens.get(1).getType());
	    assertEquals(3, tokens.get(2).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(3).getType());
	}

}
