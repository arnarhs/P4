package expressions;

public class VariableDeclaration extends Expression {
	public String id;
	public String type;
	public Integer value;
	
	public VariableDeclaration(String id, String type, int value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return type + " " + id + " : " + value.toString();
	}
}
