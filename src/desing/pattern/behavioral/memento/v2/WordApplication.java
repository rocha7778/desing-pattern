package desing.pattern.behavioral.memento.v2;

public class WordApplication {

	private static TextDocument textDocument = new TextDocument();

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			textDocument.write("hello");
		    textDocument.print();
		    textDocument.save();
		    textDocument.write(" world");
		    textDocument.print();
		    textDocument.save();
		    textDocument.write(" I am happy");
		    textDocument.save();
		    textDocument.write(" to be here");
		    textDocument.save();
		    textDocument.print();
		    
		  
		    System.out.println("undo actions");
		    textDocument.undo();
		    textDocument.undo();
		    textDocument.undo();
		    textDocument.undo();
		    textDocument.print();

	}

}
