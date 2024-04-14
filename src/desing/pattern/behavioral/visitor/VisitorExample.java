package desing.pattern.behavioral.visitor;

public class VisitorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Book(20.0));
        cart.addItem(new Movie(15.0));
        
        Visitor visitor = new PriceVisitor();
        
        
        cart.accept(visitor);
        
        visitor = new ISBNVisitor();
        
        
        cart.accept(visitor);

	}

}
