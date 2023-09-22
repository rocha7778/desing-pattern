package protectedtest.method;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import protectedtest.method.testanother.packagee.Chiwawa;

public class Veterinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> ingredients = new LinkedHashMap<>();
		ingredients.put("espresso", 0);
		 ingredients.put("water", 1);
		 ingredients.put("milk", 2);
		 ingredients.put("foam", 3);

//		Animal animal = new Animal();
//		animal.makeSound();
//
//		Dog dog = new Dog();
//		dog.makeSound();
//		
//		Pitbull pit = new Pitbull();
//		pit.makeSound();
		
		Chiwawa chi = new Chiwawa();
		
		chi.makeSound();
		
		String result = ingredients.entrySet().stream().map(e ->  " \"" + e.getKey() + "\": " + e.getValue() + "").collect(Collectors.joining(", "));
		String resuld = ingredients.entrySet().stream().map((e) -> "\"" + e.getKey() + "\": " + e.getValue()).collect(Collectors.joining(", ", "{ ", " }"));
		
		String espresso = "0";
		String water = "1";
		String milk= "2";
		String foam = "3";
		System.out.println("{ \"espresso\": " + espresso + ", \"water\": " + water + ", \"milk\": " + milk + ", \"foam\": " + foam + " }");
		System.out.println("{"+result+" }");
		System.out.println(resuld);
		
		

	}

}
