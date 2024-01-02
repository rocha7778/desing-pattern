package desing.pattern.behavioral.observer.v4.solution;

public class ObserverImpl implements Observer {

	private  Publisher topic;

	public ObserverImpl(Publisher topic) {
		super();
		this.topic = topic;
	}

	@Override
	public void update() {

		System.out.println("Recibiendo notificacion del servidor" + topic.getStatus());

	}

	@Override
	public void setSubject(Publisher sub) {
		topic=sub;

	}

}
