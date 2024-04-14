package desing.pattern.structurls.bridge.solution;

public class Circle extends AbstractShape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Dibujando círculo");
        color.applyColor();
	}

}
