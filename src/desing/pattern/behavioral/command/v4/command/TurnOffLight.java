package desing.pattern.behavioral.command.v4.command;

public class TurnOffLight implements Command {
	
	private final Light receiver;
	
	public TurnOffLight(Light receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		receiver.setSwitchedOff();
	}

}
