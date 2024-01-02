package desing.pattern.behavioral.observer;

public class Subscriber {
	
	private String name;
	private Publisher channel;
	
	public void update() {
		System.out.println(" the consumer " + name +" I have recieved the notification");
	}
	
	public void subribeTo(Publisher channel) {
		this.channel = channel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publisher getChannel() {
		return channel;
	}

	public void setChannel(Publisher channel) {
		this.channel = channel;
	}
	
	
	
}
