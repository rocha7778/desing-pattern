package desing.pattern.structurls.decorator.v1;

import java.util.function.Function;

public class Store {
	
	public static void printInt(int n, String message, Function<Integer, Integer> func) {
		
		System.out.println(n + " " + message + " : " + func.apply(n));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		
		NotificationService notification = new EmailNotificationImpl(userService);
		
		NotificationDecorator textDecorator = new TextNotification(notification);
		NotificationDecorator WasapNotification = new WasapNotification(textDecorator);
		
		
		WasapNotification.sendNotify("_ Your order is ready_ ");
		
		Function<Integer, Integer> incrementByOne =  (e) -> e+1;
		
		printInt(10, "Increment" , incrementByOne);
		
		Function<Integer, Integer> doubled =  (e) -> e*2;
		
		printInt(10, "Doubled" , doubled);
		
		
		printInt(10, "Increment and Doubled" , incrementByOne.andThen(doubled));
		
		
		Function<Integer, Integer> tripple =  (e) -> e*3;
		
		printInt(10, "Increment and Doubled" , incrementByOne.andThen(doubled.andThen(tripple)));
		
		
		
		
		
		
		

	}

}
