package desing.pattern.behavioral.observer.v3;

public class NotificationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubJectImpl subject = new SubJectImpl();
		
		Observer ob1 = new ObserverImpl("Rocha1", subject);
		Observer ob2 = new ObserverImpl("Rocha2", subject);
		Observer ob3 = new ObserverImpl("Rocha3", subject);
		
		
		subject.register(ob1);
		subject.register(ob2);
		subject.register(ob3);
		
		subject.setMessage("new movie is comming");
		
		
		
		subject.notifyObservers();
		
		
		
		
		
		
		
		

	}

}
