package desing.pattern.behavioral.memento.v2;

import java.util.Stack;

public class Memento {
	
	private Stack<String> state;

	public Memento(String state) {
		this.state = new Stack<String>();
	}

	public String getState() {
		return this.state.pop();
	}

	public void setState(String state) {
		this.state.add(state);
	}
	
	
	

}
