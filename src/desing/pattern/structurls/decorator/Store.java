package desing.pattern.structurls.decorator;

import java.util.ArrayList;
import java.util.List;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		NotificationService wasapNotification = new WasapNotification(userService);
		NotificationService facebookNotification = new FaceBookNotification(userService);
		NotificationService textNotification = new TextNotification(userService);
		NotificationService wasapAndFace =  new NotificationWasapAndFace(facebookNotification, wasapNotification);
		
		
//		List<NotificationService> notifications = new ArrayList<>();
//		
//		notifications.add(textNotification);
//		notifications.add(facebookNotification);
//		notifications.add(wasapNotification);
//		
//		notifications.forEach(n -> n.sendNotify(" Your order is ready "));
		
		wasapAndFace.sendNotify(" Your order is ready ");
		
		
		
		

	}

}
