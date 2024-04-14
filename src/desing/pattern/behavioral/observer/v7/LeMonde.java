package desing.pattern.behavioral.observer.v7;

public class LeMonde implements Observer {

	@Override
	public void nofity(String feed) {

		if (feed.contains("wine")) {
			System.out.println("Yet Another New in London" + feed);
		}

	}

}
