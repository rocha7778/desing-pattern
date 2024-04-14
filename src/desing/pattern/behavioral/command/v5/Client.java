package desing.pattern.behavioral.command.v5;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EWSService service = new EWSService();
		
		Command c1 = new AddMemberCommand("a@a.com", "spam", service);
		
		MailTasksRunner.getInstance().addCommand(c1);
		
		
		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();

	}

}
