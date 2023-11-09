package desing.pattern.behavioral.command.v2;

public class SaveCommand implements Command {
	
	private final Document document;

	public SaveCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		document.save();

	}

}
