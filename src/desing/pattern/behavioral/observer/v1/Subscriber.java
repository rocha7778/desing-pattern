package desing.pattern.behavioral.observer.v1;

public class Subscriber {

	private String name;
	private final Publisher channel;

	public Subscriber(Publisher p) {
		this.channel = p;
		
	}

	public void update(String news) {
		System.out.println("The consumer" + name + " has received the notification" + channel.getNews());
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
	
	

	

}
