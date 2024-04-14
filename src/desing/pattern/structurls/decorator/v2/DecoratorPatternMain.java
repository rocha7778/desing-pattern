package desing.pattern.structurls.decorator.v2;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());
        
        // Decorating it with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: $" + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());
        
        
       // Decorating it with sugar
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost: $" + sugarCoffee.getCost() + ", Description: " + sugarCoffee.getDescription());

	}

}
