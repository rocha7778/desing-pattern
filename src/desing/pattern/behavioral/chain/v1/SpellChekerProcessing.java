package desing.pattern.behavioral.chain.v1;

public class SpellChekerProcessing extends ProcessingObjecj<String> {

    @Override
    protected String handlerWork(String input) {
        return input.replace("labdas", "lambdas");
    }
}
