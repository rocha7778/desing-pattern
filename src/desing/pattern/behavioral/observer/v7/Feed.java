package desing.pattern.behavioral.observer.v7;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject{
	
	private List<Observer> list = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		list.add(observer);
		
	}

	@Override
	public void nonifyObservers(String feed) {
		list.stream().forEach(o -> o.nofity(feed));
		
	}

}
