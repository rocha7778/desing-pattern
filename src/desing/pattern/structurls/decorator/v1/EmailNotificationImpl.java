package desing.pattern.structurls.decorator.v1;

public class EmailNotificationImpl implements NotificationService{
	
	private  final UserService userService;
	
	public EmailNotificationImpl(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void sendNotify(String message) {
		System.out.println("Notifying using email" + message + "using the email" + userService.getEmail());
	}

}
