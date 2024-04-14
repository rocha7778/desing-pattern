package desing.pattern.structurls.decorator.v4;

public class CocoaCoffe extends CaffeDecorator {

	CocoaCoffe(Caffe cafe) {
		super(cafe);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 1.5;
	}

	@Override
	public String getDescripcion() {
		return  super.getDescripcion() + " Cocoa";
	}

}
