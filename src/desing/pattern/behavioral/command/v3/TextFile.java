package desing.pattern.behavioral.command.v3;

public class TextFile {

	private final String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	public String open() {
		return "Opening file " + name;
	}

	public String save() {
		return "Saving file " + name;
	}

}
