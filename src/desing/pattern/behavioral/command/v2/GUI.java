package desing.pattern.behavioral.command.v2;

public class GUI {
	
	private static Document document = new Document();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button saveButton = new Button("Save");
		Button printButton = new Button("Print");

		saveButton.click(new SaveCommand(document));
		printButton.click(new PrintCommand(document));

	}

}
