package desing.pattern.structurls.decorator;

public class FaceBookNotification implements NotificationService{
	
	private  final UserService userService;
	
	public FaceBookNotification(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void sendNotify(String message) {
		System.out.println("Notifying using facebook" + message + "using the email" + userService.getEmail());
	}

}
