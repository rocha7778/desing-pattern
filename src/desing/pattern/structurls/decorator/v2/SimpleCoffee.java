package desing.pattern.structurls.decorator.v2;

class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.0; // Base cost of simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
