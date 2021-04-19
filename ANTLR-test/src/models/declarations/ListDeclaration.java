package models.declarations;

import java.util.ArrayList;
import java.util.List;

import models.expressions.Expression;

public class ListDeclaration extends Expression {

	public String id;
	public String type;
	public List<Expression> list = new ArrayList<>();
	
	public ListDeclaration(String id, String type, List<Expression> list) {
		this.id = id;
		this.type = type;
		this.list = list;
	}
	
	@Override
	public String toString() {
		Integer listSize = list.size();
		String str = "Decl: " + type + " " + id + " : { ";
		
		for (int i = 0; i < list.size(); i++) {
			str += list.get(i).toString();
			if (i < listSize - 1) {
				str += ", ";
			}
		}		
		return str + " }";
	}
	
	public int Length() {
		return this.list.size();
	}
	
	public Expression Get(int i) {
		return this.list.get(i);
	}
}