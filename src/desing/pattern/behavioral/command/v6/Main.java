package desing.pattern.behavioral.command.v6;

public class Main {
	
	public static void main(String[] args) {
        // Receiver
        Light light = new Light();

        // Commands
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        // Press the turn on button
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        // Press the turn off button
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }

}
