package desing.pattern.structurls.decorator.v3;

public class CocoaDecorator  extends CaffeDecorador{

	CocoaDecorator(Caffe caffe) {
		super(caffe);
		
	}

	@Override
	public double getPrice() {
		// 
		return super.getPrice() + 1.5;
	}

	@Override
	public String getDetail() {
		return super.getDetail() + "+ Cocoa";
	}

}
