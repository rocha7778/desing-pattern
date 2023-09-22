package desing.pattern.behavioral.observer;

public class Youtube {

	public static void main(String[] args) {
		
		Publisher pub = new Publisher();
		
		Subscriber sub1 = new Subscriber();
		sub1.setName("Rocha");
		sub1.setChannel(pub);
		
		
		Subscriber sub2 = new Subscriber();
		sub2.setName("Paola");
		sub2.setChannel(pub);
		
		
		Subscriber sub3 = new Subscriber();
		sub3.setName("Carlos");
		sub3.setChannel(pub);
		
		
		pub.subscribe(sub3);
		pub.subscribe(sub2);
		pub.subscribe(sub1);
		
		
		pub.createNewProduct("New movie is already available");
		System.out.println("end of the streaming");
		
		
		
		
		

	}

}
