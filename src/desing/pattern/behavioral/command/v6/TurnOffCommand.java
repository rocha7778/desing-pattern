package desing.pattern.behavioral.command.v6;

public class TurnOffCommand implements Command {

	private Light light;

	public TurnOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOff();
	}

}
