package desing.pattern.structurls.bridge.solution.v1.main;

import desing.pattern.structurls.bridge.solution.v1.abstractions.AmericanRestaurant;
import desing.pattern.structurls.bridge.solution.v1.abstractions.ItalianRestaurant;
import desing.pattern.structurls.bridge.solution.v1.implementations.PepperoniPizza;

public class BridGedMAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
		
		americanRestaurant.deliver();
		
		System.out.println("****************************");
		System.out.println("****Italian restaurant******");
		System.out.println("****************************");
		
		ItalianRestaurant italianRestaurant = new ItalianRestaurant(new PepperoniPizza());
		
		italianRestaurant.deliver();
		

	}

}
