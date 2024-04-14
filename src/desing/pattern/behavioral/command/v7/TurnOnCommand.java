package desing.pattern.behavioral.command.v7;

public class TurnOnCommand implements Command {

	Light light;

	public TurnOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}

}
