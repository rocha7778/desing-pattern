package desing.pattern.structurls.decorator.v2;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2; // Add cost of sugar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with sugar";
    }
}
