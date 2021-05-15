package TypeChecker;

public class TypeDescriptor <T> {
	T type;
	
	public TypeDescriptor() {}
	
	public TypeDescriptor(T type) {
		this.type = type;
	}
	
	public T GetType() {
		return type;
	}
}
