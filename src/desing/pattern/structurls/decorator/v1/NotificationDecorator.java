package desing.pattern.structurls.decorator.v1;

public abstract class NotificationDecorator implements NotificationService {

	private final NotificationService notificationService;

	public NotificationDecorator(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Override
	public void sendNotify(String message) {
		notificationService.sendNotify(message);

	}

}
