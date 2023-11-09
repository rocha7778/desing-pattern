package desing.pattern.behavioral.memento.v1;

public class Memento {

	private int state;

	public Memento(int state) {
		super();
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
