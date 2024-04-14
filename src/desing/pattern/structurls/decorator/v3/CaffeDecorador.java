package desing.pattern.structurls.decorator.v3;

public abstract class CaffeDecorador implements Caffe {

	protected Caffe caffe;
	

	CaffeDecorador(Caffe caffe) {
		super();
		this.caffe = caffe;
	}

	@Override
	public double getPrice() {
		return caffe.getPrice();
	}

	@Override
	public String getDetail() {
		return caffe.getDetail();
	}

}
