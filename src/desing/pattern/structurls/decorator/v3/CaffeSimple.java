package desing.pattern.structurls.decorator.v3;

public class CaffeSimple implements Caffe{

	@Override
	public double getPrice() {
		return 1.0;
	}

	@Override
	public String getDetail() {
		return "Simple Caffe";
	}

}
