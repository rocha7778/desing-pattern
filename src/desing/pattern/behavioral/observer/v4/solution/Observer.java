package desing.pattern.behavioral.observer.v4.solution;

public interface Observer {

	// method to update the observer, used by subject
	public void update();

	public void setSubject(Publisher sub);

}
