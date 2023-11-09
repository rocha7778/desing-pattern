package desing.pattern.behavioral.command.v4.command;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Light ligth = new Light();
		Command turnOffLight = new TurnOffLight(ligth);
		Command turnOnLight = new TurnOnLight(ligth);
		
		
		
		Bathroom bathroom = new Bathroom(turnOnLight);
		bathroom.execute();
		
		System.out.println("Is light on?" + ligth.isSwitchedOn());
		
		bathroom.setCommand(turnOffLight);
		bathroom.execute();
		
		System.out.println("Is light on?" + ligth.isSwitchedOn());
		
		
		

	}

}
