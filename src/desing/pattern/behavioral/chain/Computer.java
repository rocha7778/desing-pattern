package desing.pattern.behavioral.chain;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DocumentHandler chain = new SlideshowHandler(new SpreadsheetHandler(new TextDocumentHandler(null)));
		chain.openDocument("ppt");
		chain.openDocument("txt");

	}

}
