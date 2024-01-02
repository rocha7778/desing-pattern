package desing.pattern.behavioral.observer.v3;

public class ObserverImpl implements Observer {
	
	private final String observerName;
	
	private Subject topic;
	

	public ObserverImpl(String observerName, Subject topic) {
		super();
		this.observerName = observerName;
		this.topic = topic;
	}

	public ObserverImpl(String observerName) {
		super();
		this.observerName = observerName;
	}

	@Override
	public void update() {
		
		System.out.println("Obser " + this.observerName + " has been notifyed");
		

	}

	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;
	}

}
