package desing.pattern.behavioral.observer.v5;

public class YouTubbe {

    public static void main(String arg []){

        Feed feed = new Feed();

        feed.register( new NyTimeObserver());
        feed.register( new Guardian());
        feed.register( new LeMonde());

        feed.notifyObservers(" The queen has been in the hospital for three months");

    }

    
}