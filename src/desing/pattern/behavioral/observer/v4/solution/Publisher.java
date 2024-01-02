package desing.pattern.behavioral.observer.v4.solution;

public interface Publisher {
	
	public void subscribe(Observer observer);
	public void unSubscribe(Observer observer);
	public void notifyObservers();
	public String getStatus();
	public void setSatus();
	

}
