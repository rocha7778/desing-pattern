package desing.pattern.behavioral.visitor.v1;

import desing.pattern.behavioral.visitor.v1.third.part.Book;

public class BookDecoratorExtended extends Book implements Element{

	public BookDecoratorExtended(double price) {
		super(price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
