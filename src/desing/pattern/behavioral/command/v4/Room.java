package desing.pattern.behavioral.command.v4;

public class Room {

	private final Light light;

	public Room(Light light) {
		super();
		this.light = light;
	}
	
	public void turnSwithTheLigh() {
		light.setSwitchedOn(true);
	}

}
