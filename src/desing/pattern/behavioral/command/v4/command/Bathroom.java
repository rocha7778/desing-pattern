package desing.pattern.behavioral.command.v4.command;

public class Bathroom extends Component {

	public Bathroom(Command command) {
		super(command);
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	@Override
	public void execute() {
		System.out.println("Turn on/off the badroom lights");
		super.execute();
	}
	
	
}
