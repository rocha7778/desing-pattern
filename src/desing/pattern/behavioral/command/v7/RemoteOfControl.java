package desing.pattern.behavioral.command.v7;


public class RemoteOfControl {
	
	private Command command;
	
	
	public void setCommand(Command turnOn) {
		this.command = turnOn;
	}

	public void pressButton() {
		command.execute();
		
	}

}
