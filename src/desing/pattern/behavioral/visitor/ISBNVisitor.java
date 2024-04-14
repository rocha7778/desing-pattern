package desing.pattern.behavioral.visitor;

public class ISBNVisitor implements Visitor {

	@Override
	public void visit(Book book) {
		System.out.println("Book ISBN: $" + book.getPrice());

	}

	@Override
	public void visit(Movie movie) {
		System.out.println("Movie ISBN: $" + movie.getPrice());

	}

}
