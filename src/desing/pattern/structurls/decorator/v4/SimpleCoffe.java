package desing.pattern.structurls.decorator.v4;

public class SimpleCoffe extends Caffe {

	@Override
	public double getPrice() {
		return 1;
	}

	@Override
	public String getDescripcion() {
		return "Caffe";
	}

}
