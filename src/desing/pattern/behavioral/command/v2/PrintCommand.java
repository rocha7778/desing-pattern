package desing.pattern.behavioral.command.v2;

public class PrintCommand implements Command {
	
	private final Document document;
	
	public PrintCommand(Document document) {
		super();
		this.document = document;
	}



	@Override
	public void execute() {
		document.print();

	}

}
