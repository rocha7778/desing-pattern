package desing.pattern.creational.factory.message;

public class JsonMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}

}
