package models.expressions;

import java.util.ArrayList;
import java.util.List;

import models.Statement;

public class ListExpr extends Expression{
		public List<Expression> list = new ArrayList<>();
		
		public ListExpr(List<Expression> list) {
				this.list = list;
		}
		
		@Override
		public String toString() {
			String str = "List: ";
			
			for(Expression elem : list) {
				str = str + elem.toString() + ", ";
			}
			
			return str;
		}
}
