package desing.pattern.behavioral.command.v3;

public class SavinTextFileOperation implements TextFileOperation {
	
	private final TextFile receiver;
	
	public SavinTextFileOperation(TextFile receiver) {
		this.receiver = receiver;
	}


	@Override
	public String execute() {
		return receiver.save();
	}

}
