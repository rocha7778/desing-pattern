package desing.pattern.behavioral.command.v4.command;

public class TurnOnLight implements Command {
	
	private final Light receiver;
	
	public TurnOnLight(Light receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		receiver.setSwitchedOn();
	}

}
