package desing.pattern.structurls.decorator.v4;

public class MilkCoffe extends CaffeDecorator {

	MilkCoffe(Caffe cafe) {
		super(cafe);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 0.5;
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion() + " Milk";
	}

}
