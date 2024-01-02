package desing.pattern.behavioral.observer.v2;

public class EmailMsgListener {
	
	private final String email;

	public EmailMsgListener(String email) {
		super();
		this.email = email;
	}
	
	public void update() {
		System.out.println("Notifying to emails -->" + email);
	}

}
