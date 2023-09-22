package desing.pattern.behavioral.template;

public class ConsolaPSP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new FootBall();
		game.play();

	}

}
