package desing.pattern.behavioral.observer.v5;

public class Guardian implements Observer {

    @Override
    public void nofityObserver(String tweet) {
        if(tweet.contains("queen")){
            System.out.println("Yet Another New in London" + tweet);
        }
    }
    
}
