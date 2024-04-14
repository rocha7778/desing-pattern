package desing.pattern.behavioral.observer.v5;

public class YouTubbeLambda {

    public static void main(String arg []){

        Feed feed = new Feed();

        feed.register( (String tweet) -> {

            if(tweet.contains("money")){
                System.out.println("Breaking New in New York Time " + tweet);
            }
        });

        feed.register((String tweet) -> {

            if(tweet.contains("queen")){
                System.out.println("Yet Another New in London" + tweet);
            }
        });

        feed.register( (String tweet) -> {

            if(tweet.contains("wine")){
                System.out.println("Yet Another New in London" + tweet);
            }
        });

        feed.notifyObservers(" The queen has been in the hospital for three months");

    }

    
}