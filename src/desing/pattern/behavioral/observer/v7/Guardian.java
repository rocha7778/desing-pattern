package desing.pattern.behavioral.observer.v7;

public class Guardian implements Observer {
	@Override
	public void nofity(String feed) {
		if (feed.contains("queen")) {
			System.out.println("Yet Another New in London" + feed);
		}
	}

}
