package desing.pattern.behavioral.chain.v1;

public class HeaderTextProcessor extends ProcessingObjecj<String> {

    @Override
    protected String handlerWork(String input) {
        return "From Raul, Mario and Alan " + input;
    }
}
