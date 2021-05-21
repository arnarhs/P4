package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.antlr.v4.runtime.Token;
import org.junit.jupiter.api.Test;

import antlr.expressionLexer;

//import unitTests.TestMethods;

public class LexerTest {

	@Test
	public void simpleDeclarationTest() {
		List<Token> tokens = TestMethods.getTokensFromText("species a : 5"
				+ "int hejs4 : 5"
				+ "bool h_A : true || false " //fejl her: den kan ikke skille false og double ad(fjern sidste " ")
				+ "double chemTrails : 4.776");
		
		//species
	    assertEquals(19, tokens.size()); // includes EOF
	    assertEquals(expressionLexer.NUMT, tokens.get(0).getType());
	    assertEquals(expressionLexer.ID, tokens.get(1).getType());
	    assertEquals(expressionLexer.COLON, tokens.get(2).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(3).getType());
	    
	    //int
	    assertEquals(expressionLexer.NUMT, tokens.get(4).getType());
	    assertEquals(expressionLexer.ID, tokens.get(5).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(7).getType());
	    
	    //bool
	    assertEquals(expressionLexer.BOOLT, tokens.get(8).getType());
	    assertEquals(expressionLexer.ID, tokens.get(9).getType());
	    assertEquals(expressionLexer.BOOL, tokens.get(11).getType());
	    assertEquals(expressionLexer.BOOL, tokens.get(13).getType());
	    
	    //double
	    assertEquals(expressionLexer.NUMT, tokens.get(14).getType());
	    assertEquals(expressionLexer.ID, tokens.get(15).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(17).getType());
	}
	
	@Test
	public void speciesDeclSpaceTest() {
		List<Token> tokens = TestMethods.getTokensFromText("species a:5");
		
	    assertEquals(5, tokens.size());
	    assertEquals(expressionLexer.NUMT, tokens.get(0).getType());
	    assertEquals(expressionLexer.ID, tokens.get(1).getType());
	    assertEquals(expressionLexer.COLON, tokens.get(2).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(3).getType());
	}
	@Test
	public void speciesDeclNoParamTest() {
		List<Token> tokens = TestMethods.getTokensFromText("species a");
		
	    assertEquals(3, tokens.size()); 
	    assertEquals(expressionLexer.NUMT, tokens.get(0).getType());
	    assertEquals(expressionLexer.ID, tokens.get(1).getType());
	}
	
	@Test
	public void solutionTest() {
		List<Token> tokens = TestMethods.getTokensFromText("solution snask : { "
				+ "species a : b,"
				+ "int c: 3,"
				+ "double aN7t :5.6}");
		
	    assertEquals(20, tokens.size()); 
	    assertEquals(expressionLexer.SOLUTION, tokens.get(0).getType());
	    assertEquals(expressionLexer.ID, tokens.get(1).getType());
	    assertEquals(expressionLexer.COLON, tokens.get(2).getType());
	    assertEquals(expressionLexer.OPEN_BRAC, tokens.get(3).getType());
	    assertEquals(expressionLexer.NUMT, tokens.get(4).getType());
	    assertEquals(expressionLexer.ID, tokens.get(5).getType());
	    assertEquals(expressionLexer.COLON, tokens.get(6).getType());
	    assertEquals(expressionLexer.ID, tokens.get(7).getType());
	    assertEquals(expressionLexer.COMMA, tokens.get(8).getType());
	    assertEquals(expressionLexer.NUMT, tokens.get(9).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(12).getType());
	    assertEquals(expressionLexer.NUMT, tokens.get(14).getType());
	    assertEquals(expressionLexer.ID, tokens.get(15).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(17).getType());
	    assertEquals(expressionLexer.CLOSE_BRAC, tokens.get(18).getType());
	}
	
	@Test
	public void listAndReacDeclTest() {
		List<Token> tokens = TestMethods.getTokensFromText("list myList : "
				+ "{ a -> b (2) ,"
				+ " 2 + 3 -> 3 * a (g) }");
		
	    assertEquals(23, tokens.size());
	    assertEquals(expressionLexer.LIST, tokens.get(0).getType());
	    assertEquals(expressionLexer.ID, tokens.get(1).getType());
	    
	    assertEquals(expressionLexer.OPEN_BRAC, tokens.get(3).getType());
	    assertEquals(expressionLexer.ID, tokens.get(4).getType());
	    assertEquals(expressionLexer.RIGHT_ARROW, tokens.get(5).getType());
	    assertEquals(expressionLexer.OPEN_PAR, tokens.get(7).getType());
	    assertEquals(expressionLexer.CLOSE_PAR, tokens.get(9).getType());
	    
	    assertEquals(expressionLexer.ADD, tokens.get(12).getType());
	    assertEquals(expressionLexer.NUM, tokens.get(13).getType());
	    assertEquals(expressionLexer.MULT, tokens.get(16).getType());
	    assertEquals(expressionLexer.OPEN_PAR, tokens.get(18).getType());
	    assertEquals(expressionLexer.CLOSE_BRAC, tokens.get(21).getType());
	}
	
	@Test
	public void ifElseAndBoolTest() {
		List<Token> tokens = TestMethods.getTokensFromText("if(( 5 >= 5 || 5 != 4 )"
				+ " && (5 == 5 && 5 <= 4)"
				+ " || 4 > 3 && 3<4) "
				+ "{} else {}");
		
	    assertEquals(36, tokens.size());
	    assertEquals(expressionLexer.IF, tokens.get(0).getType());
	    assertEquals(expressionLexer.OPEN_PAR, tokens.get(2).getType());
	    assertEquals(expressionLexer.RELOP, tokens.get(4).getType());
	    assertEquals(expressionLexer.LOGOP, tokens.get(6).getType());
	    assertEquals(expressionLexer.RELOP, tokens.get(8).getType());
	    
	    assertEquals(expressionLexer.LOGOP, tokens.get(11).getType());
	    assertEquals(expressionLexer.RELOP, tokens.get(14).getType());
	    assertEquals(expressionLexer.RELOP, tokens.get(18).getType());
	    
	    assertEquals(expressionLexer.RELOP, tokens.get(23).getType());
	    assertEquals(expressionLexer.RELOP, tokens.get(27).getType());
	    assertEquals(expressionLexer.CLOSE_BRAC, tokens.get(31).getType());
	    assertEquals(expressionLexer.ELSE, tokens.get(32).getType());
	}
}
