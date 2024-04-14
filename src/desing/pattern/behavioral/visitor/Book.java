package desing.pattern.behavioral.visitor;

public class Book implements Element {
	private double price;

	public Book(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
