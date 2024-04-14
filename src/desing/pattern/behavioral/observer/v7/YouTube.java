package desing.pattern.behavioral.observer.v7;

public class YouTube {
	
	 public static void main(String arg []){
		 
		 Feed feed = new Feed();
		 
		 Guardian g = new Guardian();
		 LeMonde l = new LeMonde();
		 
		 
		 feed.register(l);
		 feed.register(g);
		 
		 feed.nonifyObservers("wine");
		 
		 
	 }

}
