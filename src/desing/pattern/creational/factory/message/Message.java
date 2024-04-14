package desing.pattern.creational.factory.message;

public abstract class Message {
	
	public void addDefaultHeaders() {}
	public void encrypt() {}
	public abstract String getContent();
	
	

}
