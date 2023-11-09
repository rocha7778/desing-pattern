package desing.pattern.structurls.decorator.v1;

import desing.pattern.structurls.decorator.UserService;

public class WasapNotification extends NotificationDecorator {
	
	private  UserService userService = new UserService();;
	
	public WasapNotification(NotificationService notificationService) {
		super(notificationService);
		
	}

	@Override
	public void sendNotify(String message) {
		super.sendNotify(message);
		sendNotifyByWasap(message);
	}
	
	private void sendNotifyByWasap(String message) {
		System.out.println("Notifying using wasap" + message + "using the phone" + userService.getPhone());
    }

}
