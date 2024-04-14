package desing.pattern.structurls.decorator.v3;

public class MainCaffe {

	public static void main(String[] args) {
		
		Caffe sc = new CaffeSimple();
		
		System.out.println(sc.getDetail() + " " +  "$"+sc.getPrice());
		
		Caffe cocoaDecorator = new CocoaDecorator(sc);
		
		System.out.println(cocoaDecorator.getDetail() + " " +  "$"+cocoaDecorator.getPrice());
		
		

	}

}
