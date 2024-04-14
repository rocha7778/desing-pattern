package desing.pattern.behavioral.visitor.v1;


public class VisitorExample {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new BookDecoratorExtended(20.0));
        cart.addItem(new MovieDecoratorExtended(15.0));
        
        
        Visitor visitor = new PriceVisitor();
        
        cart.accept(visitor);

	}

}
