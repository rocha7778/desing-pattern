package desing.pattern.behavioral.visitor.v1;

import desing.pattern.behavioral.visitor.v1.third.part.Book;
import desing.pattern.behavioral.visitor.v1.third.part.Movie;

public class PriceVisitor implements Visitor {

	@Override
	public void visit(Book book) {
		System.out.println("Book price: $" + book.getPrice());

	}

	@Override
	public void visit(Movie movie) {
		System.out.println("Movie price: $" + movie.getPrice());

	}


}
