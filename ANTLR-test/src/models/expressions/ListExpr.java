package models.expressions;

import java.util.ArrayList;
import java.util.List;

public class ListExpr extends Expression{
	public List<Expression> list = new ArrayList<>();
	
	public ListExpr(List<Expression> list) {
		this.list = list;
	}
	
	public ListExpr() {
		this.list = new ArrayList();
	}
	
	@Override
	public String toString() {
		String str = "List: ";
		
		for(Expression elem : list) {
			str = str + elem.toString() + ", ";
		}
		
		return str;
	}
	
	public void Combine(ListExpr otherList) {
		this.list.addAll(otherList.list);
	}
}