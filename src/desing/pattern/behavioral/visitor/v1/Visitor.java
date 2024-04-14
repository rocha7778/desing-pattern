package desing.pattern.behavioral.visitor.v1;

import desing.pattern.behavioral.visitor.v1.third.part.Book;
import desing.pattern.behavioral.visitor.v1.third.part.Movie;

public interface Visitor {
	
	void visit(Book book);
    void visit(Movie movie);

}
