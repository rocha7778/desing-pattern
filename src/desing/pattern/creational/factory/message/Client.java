package desing.pattern.creational.factory.message;

public class Client {
	

	public static void main(String[] args) {
		
		printMessage(new JsonMessageCreator());
		printMessage(new TextMessageCreator());

		
	}
	
	
	public static void printMessage(MessageCreator creator) {
		System.out.println(creator.getMessage().getContent());
	}

}
