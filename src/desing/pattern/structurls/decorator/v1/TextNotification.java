package desing.pattern.structurls.decorator.v1;

public class TextNotification extends NotificationDecorator {

	private UserService userService = new UserService();;

	public TextNotification(NotificationService notificationService) {
		super(notificationService);
	}

	@Override
	public void sendNotify(String message) {
		super.sendNotify(message);
		sendNotificationByTexting(message);
	}
	
	private void sendNotificationByTexting(String message) {
		System.out.println("Notifying using text" + message + "using the phone: " + userService.getPhone());
	}

}
