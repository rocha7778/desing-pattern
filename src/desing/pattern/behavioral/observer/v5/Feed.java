package desing.pattern.behavioral.observer.v5;

import java.util.ArrayList;
import java.util.List;

public class Feed  implements Subject{

    List<Observer> subsCriptores = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        subsCriptores.add(obj);
    }

    @Override
    public void notifyObservers(String tweet) {
        subsCriptores.forEach(s -> s.nofityObserver(tweet));
    }
}
