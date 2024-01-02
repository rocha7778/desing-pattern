package desing.pattern.behavioral.observer.v2;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NotificationService notificationService = new NotificationService();
		
		EmailMsgListener sub1 = new EmailMsgListener("rocha1@hotmail.com");
		EmailMsgListener sub2 = new EmailMsgListener("rocha2@hotmail.com");
		EmailMsgListener sub3 = new EmailMsgListener("rocha3@hotmail.com");
		
		
		notificationService.addSubcriber(sub1);
		notificationService.addSubcriber(sub2);
		notificationService.addSubcriber(sub3);
		
		
		notificationService.nofify();
		
		
		
		
		
		
		
		
		
		
		

	}

}
