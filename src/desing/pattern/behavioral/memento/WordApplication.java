package desing.pattern.behavioral.memento;

public class WordApplication {

	private static TextDocument textDocument = new TextDocument();

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			textDocument.write("hello");
		    textDocument.print();
		    textDocument.save();
		    textDocument.write(" world");
		    textDocument.print();
		    textDocument.undo();
		    textDocument.print();

	}

}
