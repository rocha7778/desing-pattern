package desing.pattern.behavioral.observer.v2;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
	
	private final List<EmailMsgListener> customers;
	
	public NotificationService() {
		customers = new ArrayList<>();
	}
	
	public void addSubcriber (EmailMsgListener e) {
		customers.add(e);
	}
	
	public void unSubcribe (EmailMsgListener e) {
		customers.remove(e);
	}
	
	public void nofify() {
		customers.forEach(sub -> sub.update());
	}
}
