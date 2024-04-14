package desing.pattern.behavioral.chain.v2;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChainImplementation {

    public static void main(String args[]) {

        UnaryOperator<String> headerProcessing = text -> "From Raul, Mario and Alan: " + text;
        UnaryOperator<String> spellCheckerProcessing = text -> text.replace("labdas", "lambdas");

        Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);

        var result = pipeline.apply("Aren't labdas really sexy?!!!");
        System.out.println(result);


    }

}
