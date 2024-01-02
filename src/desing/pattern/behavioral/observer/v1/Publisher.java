package desing.pattern.behavioral.observer.v1;

import java.util.ArrayList;
import java.util.List;



public class Publisher {
	
	public String news;
	public List<Subscriber> subcribers = new ArrayList<>();
	
	
	public void addSubcriber(Subscriber subscriber) {
		subcribers.add(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber) {
		subcribers.remove(subscriber);
	}
	
	public void updateNews(String news) {
		this.news = news;
		subcribers.forEach(s -> s.update(this.news));
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	
	
	

}
