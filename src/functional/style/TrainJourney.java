package functional.style;

class TrainJourney {

	public int price;
	public String destination;
	public TrainJourney onward;

	public TrainJourney(int p, String destination, TrainJourney t) {
		price = p;
		onward = t;
		this.destination = destination;
	}

	static TrainJourney link(TrainJourney a, TrainJourney b) {

		if (a == null)
			return b;
		TrainJourney t = a;
		while (t.onward != null) {
			t = t.onward;
		}

		t.onward = b;
		return a;

	}

	static TrainJourney append(TrainJourney a, TrainJourney b) {
		
		if (a == null) {
			return b;
		} else {
			return new TrainJourney(a.price, a.destination, append(a.onward, b));
		}

	}

}
