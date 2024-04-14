package desing.pattern.structurls.decorator.v4;

public abstract class Caffe {
	
	public abstract double getPrice();
	public abstract String getDescripcion();
	
	public String getDetail() {
		return getDescripcion() + " $" + getPrice();
	}

}
