package desing.pattern.structurls;

public class Boxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleProduct product1 = new SimpleProduct(10);
        SimpleProduct product2 = new SimpleProduct(20);
        SimpleProduct product3 = new SimpleProduct(30);
        
        Box box1 = new Box();
        box1.addProduct(product1);
        box1.addProduct(product2);
        
        Box box2 = new Box();
        box2.addProduct(product3);
        
        box1.addProduct(box2);
        
        System.out.println("Total price: " + box1.getPrice());

	}

}
