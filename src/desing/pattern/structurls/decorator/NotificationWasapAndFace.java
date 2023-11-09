package desing.pattern.structurls.decorator;

public class NotificationWasapAndFace implements NotificationService{
	
	private final NotificationService faceNotification;
	private final NotificationService wasapNotification;
	
	public NotificationWasapAndFace(NotificationService faceNotification, NotificationService wasapNotification) {
		super();
		this.faceNotification = faceNotification;
		this.wasapNotification = wasapNotification;
	}
	

	@Override
	public void sendNotify(String message) {
		faceNotification.sendNotify(message);
		wasapNotification.sendNotify(message);
	}
	

}
