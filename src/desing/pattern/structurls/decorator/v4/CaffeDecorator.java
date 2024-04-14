package desing.pattern.structurls.decorator.v4;

public abstract class CaffeDecorator extends Caffe {

	private Caffe cafe;

	CaffeDecorator(Caffe cafe) {
		super();
		this.cafe = cafe;
	}

	@Override
	public double getPrice() {
		return cafe.getPrice();
	}

	@Override
	public String getDescripcion() {
		return cafe.getDescripcion();
	}
}
