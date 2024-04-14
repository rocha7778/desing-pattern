package desing.pattern.creational.factory.message;

public class JsonMessageCreator  extends MessageCreator{

	@Override
	public Message createMessage() {
		return new JsonMessage();
	}

}
