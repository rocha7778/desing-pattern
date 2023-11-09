package desing.pattern.behavioral.command.v4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	public static void main(String arg []) {
		
		Light light = new Light();
		Kitchen kitchen = new Kitchen(light);
		LivingRoon livingRoom = new LivingRoon(light);
		Bathroom badroom = new Bathroom(light);
		
		
		List<Room> listRoom = new ArrayList<>();
		
		listRoom.add(kitchen);
		listRoom.add(livingRoom);
		listRoom.add(badroom);
		
		
		listRoom.forEach(r -> r.turnSwithTheLigh());
		
		
		
		
		
		
		
	}

}
