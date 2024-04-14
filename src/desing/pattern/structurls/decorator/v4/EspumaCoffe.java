package desing.pattern.structurls.decorator.v4;

public class EspumaCoffe extends CaffeDecorator {

	EspumaCoffe(Caffe cafe) {
		super(cafe);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 0.3;
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion() + " Espuma";
	}
	
	


}
