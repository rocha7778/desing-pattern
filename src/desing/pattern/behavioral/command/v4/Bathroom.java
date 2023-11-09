package desing.pattern.behavioral.command.v4;

public class Bathroom  extends Room{

	public Bathroom(Light light) {
		super(light);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void turnSwithTheLigh() {
		System.out.println("Turn on/off the badroom lights");
		super.turnSwithTheLigh();
	}

}
