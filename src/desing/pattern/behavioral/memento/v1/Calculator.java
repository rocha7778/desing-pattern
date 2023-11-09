package desing.pattern.behavioral.memento.v1;

public class Calculator {

	private int result;
	private Memento memento;
	

	public Calculator() {
		this.result = 0;
		memento = new Memento(result);
	}

	public int add(int a, int b) {
		result = a + b;
		return result;
	}
	
	public void print() {
		System.out.println("Result: "+result );
	}
	
	public void save() {
		memento.setState(result);
	}
	
	public void undo() {
		result = memento.getState();
	}
}
