package desing.pattern.creational.builder;

public class UsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var a = User.getBuilder().withFirstName("Rocha").build().toString();
		
		User u = new User();
		
		
		
		System.out.println(a);
	}

}
