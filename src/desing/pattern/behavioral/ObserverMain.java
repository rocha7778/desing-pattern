package desing.pattern.behavioral;

public class ObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        subject.setMessage("Hello, observers!");

	}

}
