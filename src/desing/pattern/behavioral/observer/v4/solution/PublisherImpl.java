package desing.pattern.behavioral.observer.v4.solution;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher {
	
	private List<Observer> subscribers = new ArrayList<>();
	private String status = "";
	
	

	@Override
	public void subscribe(Observer observer) {
		subscribers.add(observer);
		
	}

	@Override
	public void unSubscribe(Observer observer) {
		subscribers.remove(observer);
	}


	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		subscribers.forEach(s -> s.update());
		
	}

	public String getUpdatedStatus() {
		return status;
	}

	public void setStatus(String status) {
		System.out.println("Publishing new updates");
		this.status = status;
		notifyObservers();
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setSatus() {
		// TODO Auto-generated method stub
		
	}
	
	

}
