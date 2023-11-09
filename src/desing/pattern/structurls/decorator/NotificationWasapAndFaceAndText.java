package desing.pattern.structurls.decorator;

public class NotificationWasapAndFaceAndText implements NotificationService{
	
	private final NotificationService faceNotification;
	private final NotificationService wasapNotification;
	private final NotificationService textNotification;
	
	public NotificationWasapAndFaceAndText(NotificationService faceNotification, NotificationService wasapNotification , NotificationService textNotification) {
		super();
		this.faceNotification = faceNotification;
		this.wasapNotification = wasapNotification;
		this.textNotification = textNotification;
	}
	

	@Override
	public void sendNotify(String message) {
		faceNotification.sendNotify(message);
		wasapNotification.sendNotify(message);
		textNotification.sendNotify(message);
	}

}
