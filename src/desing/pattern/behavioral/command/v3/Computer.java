package desing.pattern.behavioral.command.v3;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextFile textFile = new TextFile("PHD");
		
		OpenTextFileOperation openFile = new OpenTextFileOperation(textFile);
		SavinTextFileOperation saveFile = new SavinTextFileOperation(textFile);
		
		
		System.out.println(openFile.execute());
		System.out.println(saveFile.execute());
		
		
		

	}

}
