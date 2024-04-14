package desing.pattern.structurls.bridge.solution;

public class BridgeSolution {

	public static void main(String[] args) {
		
		Color color = new RedColor();
		AbstractShape circle = new Circle(color);
		circle.draw();
		
		
		color = new YellowColor();
		circle = new Circle(color);
		
		circle.draw();

	}

}
