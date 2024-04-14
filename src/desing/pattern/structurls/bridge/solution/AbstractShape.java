package desing.pattern.structurls.bridge.solution;

public abstract class AbstractShape implements Shape {

	protected Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

}
