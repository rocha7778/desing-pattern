package desing.pattern.creational.factory.chair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class ChairStore {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Map<Integer, String> chairInventory = new HashMap<>();
	
	
	// database 
	static {

		chairInventory.put(1, "CLASICA");
		chairInventory.put(2, "MODERNA");
		chairInventory.put(3, "VINTAGE");
		chairInventory.put(4, "ROCKERA");
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		ChairFactory chairFactory = new ChairFactory();
		String continueChoice = "Y";
		
		while (continueChoice.equalsIgnoreCase("Y")) {
			System.out.println("Please, select a product:");
			System.out.println("1 - CLASICA");
			System.out.println("2 - MODERNA");
			System.out.println("3 - VINTAGE");
			System.out.println("4 - ROCKERA");
			int choice = Integer.parseInt(reader.readLine());
			
			// a chair is asked to the factory
			Optional<BaseChair> chair = chairFactory.getChair(chairInventory.get(choice));
			
			System.out.println("Do you wish to continue selecting products? Y/N :" + "\n");
			continueChoice = reader.readLine();
			
			BaseChair chairFrom = chair.orElse(new VintageChair(50,50,"Rock Brand", "Black/gray Color"));
			
			System.out.println("The product " + chairFrom.printInfo() + " will be delivered to your address");
		}
	}

}
