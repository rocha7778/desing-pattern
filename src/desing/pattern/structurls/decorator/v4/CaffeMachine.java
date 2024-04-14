package desing.pattern.structurls.decorator.v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaffeMachine {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		Caffe sc = new SimpleCoffe();
		
		String continueChoice = "Y";
		
		FactoryMethod fm = new FactoryMethod(sc);
		
		while (continueChoice.equalsIgnoreCase("Y")) {
			System.out.println("Please, select a product:");
			System.out.println("1 - AGREGAR LECHE");
			System.out.println("2 - AGREGAR COCOA");
			System.out.println("3 - CHOCOLATE");
			System.out.println("4 - AGREGAR ESPUMA AMERICANA");
			System.out.println("5 - DELIVERED");
			int choice = Integer.parseInt(reader.readLine());
			
			
			sc = fm.getChair(choice);
		
			
			System.out.println("Do you wish to continue selecting products? Y/N :" + "\n");
			continueChoice = reader.readLine();
			
		}
		
		System.out.println("The product " + sc.getDetail() + " will be delivered");
		
	}

}
