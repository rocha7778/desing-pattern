package desing.pattern.behavioral.observer.v1;

public class Youtubbe {
	
	public static void main(String[] args) {
		
		Publisher p = new Publisher();
		
		Subscriber sbs1 = new Subscriber(p);
		sbs1.setName(" Rocha");
		
		Subscriber sbs2 = new Subscriber(p);
		sbs2.setName(" Paola");
		
		
		p.addSubcriber(sbs1);
		p.addSubcriber(sbs2);
		
		p.updateNews("New movie is already available ");
	}

}
