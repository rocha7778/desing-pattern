package desing.pattern.structurls.decorator.v2;

class MilkDecorator extends CoffeeDecorator {
	
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // Add cost of milk
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with milk";
    }
}