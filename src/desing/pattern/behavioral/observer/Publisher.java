package desing.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Publisher {
	private List<Subscriber> subs = new ArrayList<>();
	private String title;

	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}

	public void notitySubscriber() {
		subs.stream().forEach(sub -> sub.update());
	}

	public void createNewProduct(String title) {
		this.title = title;
		notitySubscriber();
	}
}
