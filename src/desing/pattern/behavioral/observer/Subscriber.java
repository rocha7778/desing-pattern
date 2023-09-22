package desing.pattern.behavioral.observer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Subscriber {
	
	private String name;
	private Publisher channel;
	
	public void update() {
		System.out.println(" the consumer " + name +" I have recieved the notification");
	}
	
	public void subribeTo(Publisher channel) {
		this.channel = channel;
	}
	
}
