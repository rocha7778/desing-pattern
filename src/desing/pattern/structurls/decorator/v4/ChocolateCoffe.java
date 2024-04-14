package desing.pattern.structurls.decorator.v4;

public class ChocolateCoffe extends CaffeDecorator {

	ChocolateCoffe(Caffe cafe) {
		super(cafe);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 1.7;
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion() + " Chocolate";
	}
	
	


}
