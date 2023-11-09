package desing.pattern.structurls.decorator;

public class WasapNotification implements NotificationService {
	
	private  final UserService userService;
	
	
	public WasapNotification(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void sendNotify(String message) {
		System.out.println("Notifying using wasap" + message + "using the phone" + userService.getPhone());

	}

}
