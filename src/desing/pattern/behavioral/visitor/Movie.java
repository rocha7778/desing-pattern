package desing.pattern.behavioral.visitor;

public class Movie  implements Element{

	private double price;

    public Movie(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}

}
