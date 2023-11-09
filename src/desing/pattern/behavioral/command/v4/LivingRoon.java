package desing.pattern.behavioral.command.v4;

public class LivingRoon extends Room {

	public LivingRoon(Light light) {
		super(light);
	}
	
	@Override
	public void turnSwithTheLigh() {
		System.out.println("Turn on/off the living room lights");
		super.turnSwithTheLigh();
	}

}
