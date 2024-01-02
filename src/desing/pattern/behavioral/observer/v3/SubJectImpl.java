package desing.pattern.behavioral.observer.v3;

import java.util.ArrayList;
import java.util.List;

public class SubJectImpl implements Subject {

	private final List<Observer> observers = new ArrayList<>();
	private String message;

	@Override
	public void register(Observer obj) {
			observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);

	}

	@Override
	public void notifyObservers() {
		observers.forEach(obj -> obj.update());
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		notifyObservers();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Observer> getObservers() {
		return observers;
	}

}
