package desing.pattern.behavioral.observer.v2;

public class Store {
	
	private final NotificationService notificationService;
	
	public Store() {
		
		notificationService = new NotificationService();
		
	}
	
	public NotificationService getService() {
		return this.notificationService;
	}
	
	public void newItemPromotion() {
		notificationService.notify();
		
	}

}
