package desing.pattern.behavioral.command.v4;

public class Kitchen extends Room{

	public Kitchen(Light light) {
		super(light);
		
	}
	
	@Override
	public void turnSwithTheLigh() {
		System.out.println("Turn on/off the kitchen lights");
		super.turnSwithTheLigh();
	}

}
