package desing.pattern.behavioral;

public class ConcreteObserver implements Observer{

	private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received the message: " + message);
    }

}
