package desing.pattern.behavioral.observer.v4.solution;

public class YoutubeAppStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublisherImpl youtube = new PublisherImpl();
		
		Observer subs1 = new ObserverImpl(youtube);
		Observer subs2 = new ObserverImpl(youtube);
		Observer subs3 = new ObserverImpl(youtube);
		
		
		youtube.subscribe(subs1);
		youtube.subscribe(subs2);
		youtube.subscribe(subs3);
		
		
		youtube.setStatus("New movie comming soon");

	}

}
