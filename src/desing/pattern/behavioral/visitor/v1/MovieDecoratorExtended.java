package desing.pattern.behavioral.visitor.v1;

import desing.pattern.behavioral.visitor.v1.third.part.Movie;

public class MovieDecoratorExtended extends Movie implements Element{

	public MovieDecoratorExtended(double price) {
		super(price);
	}

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}

}
