package desing.pattern.behavioral.command.v6;

public class TurnOnCommand implements Command {

	private Light light;

	public TurnOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOn();
	}

}
