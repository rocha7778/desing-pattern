package desing.pattern.behavioral.visitor;

public interface Visitor {
	
	void visit(Book book);
    void visit(Movie movie);

}
