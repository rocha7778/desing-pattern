package desing.pattern.structurls.bridge.problems;

public class BridgeProblem {
	
	public static void main(String arg[]) {
		
		Shape circleRed = new CirculoRojo();
		Shape circleYellow = new CirculoAmarillo();
		Shape cuadradoAzul = new CuadradoAzul();
		
		circleRed.draw();
		cuadradoAzul.draw();
		circleYellow.draw();
	}

}
