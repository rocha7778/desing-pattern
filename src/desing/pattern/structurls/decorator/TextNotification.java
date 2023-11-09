package desing.pattern.structurls.decorator;

public class TextNotification implements NotificationService {
	
private  final UserService userService;
	
	
	public TextNotification(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void sendNotify(String message) {
		System.out.println("Notifying using text" + message + "using the phone" + userService.getPhone());

	}

}
