package desing.pattern.behavioral.observer.v5;

public class LeMonde implements Observer {

    @Override
    public void nofityObserver(String tweet) {
        if(tweet.contains("wine")){
            System.out.println("Yet Another New in London" + tweet);
        }
    }
    
}
