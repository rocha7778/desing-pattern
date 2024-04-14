package desing.pattern.behavioral.command.v7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Light light = new Light();
		
		Command turnOn = new TurnOnCommand(light);
		Command turnOff = new TurnOffCommand(light);
		
		RemoteOfControl rm  = new RemoteOfControl();
		rm.setCommand(turnOn);
		rm.pressButton();
		
		rm.setCommand(turnOff);
		rm.pressButton();
		
		

	}

}
