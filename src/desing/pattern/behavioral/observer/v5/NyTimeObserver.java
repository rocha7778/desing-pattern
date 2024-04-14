package desing.pattern.behavioral.observer.v5;

public class NyTimeObserver  implements Observer{

    @Override
    public void nofityObserver(String tweet) {

        if(tweet.contains("money")){
            System.out.println("Breaking New in New York Time " + tweet);
        }
        
    }
    
}
