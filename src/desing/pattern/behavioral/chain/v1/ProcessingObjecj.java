package desing.pattern.behavioral.chain.v1;

public abstract class ProcessingObjecj<T> {

    protected ProcessingObjecj<T> succesor;

    public void setSucessor(ProcessingObjecj<T> succesor) {
        this.succesor = succesor;
    }

    public T handle(T input) {

        T r = handlerWork(input);
        if (succesor != null) {
            return succesor.handle(r);
        }
        return r;
    }

    protected abstract T handlerWork(T input);
}
