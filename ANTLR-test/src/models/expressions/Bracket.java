package models.expressions;

public class Bracket extends Expression {
	 public Expression bracket;

	 public Bracket(Expression bracket) {
	     this.bracket = bracket;
	 }

	 @Override
	 public String toString() {
	     return "(" + bracket.toString() + ")";
	 }
}
