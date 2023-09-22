package desing.pattern.structurls;

public class SimpleProduct implements Product {

	private double price;

	public SimpleProduct(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
