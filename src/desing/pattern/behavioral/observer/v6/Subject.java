package desing.pattern.behavioral.observer.v6;

public interface Subject {

	// methods to register and unregister observers
	public void register(Observer obj);

	// method to notify observers of change
	public void notifyObservers(String tweet);

	

}
