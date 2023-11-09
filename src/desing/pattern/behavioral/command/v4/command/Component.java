package desing.pattern.behavioral.command.v4.command;

public abstract class Component {
	
	protected Command command;
	

	public Component(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
	

}
