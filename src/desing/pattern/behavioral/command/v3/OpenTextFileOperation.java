package desing.pattern.behavioral.command.v3;

public class OpenTextFileOperation implements TextFileOperation {

	private final TextFile textFile;

	public OpenTextFileOperation(TextFile textFile) {
		super();
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.open();
	}

}
