package desing.pattern.behavioral.observer.v7;

public interface Subject {
	
	public void register(Observer observer);
	public void nonifyObservers(String feed);

}
