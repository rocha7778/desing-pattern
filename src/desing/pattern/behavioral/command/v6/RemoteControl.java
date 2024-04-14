package desing.pattern.behavioral.command.v6;

public class RemoteControl {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

}
