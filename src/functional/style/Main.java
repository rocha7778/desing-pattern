package functional.style;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainJourney medellin = new TrainJourney(50000, "medellin", null);
		TrainJourney barranquilla = new TrainJourney(50000, "barranquilla", null);
		TrainJourney cartagena = new TrainJourney(50000, "cartagena", null);
		
		
		
		TrainJourney path2 = TrainJourney.append(cartagena, barranquilla);
		path2 = TrainJourney.append(path2, medellin);
		
		while(path2 != null) {
			System.out.println(path2.destination);
			path2 = path2.onward;
		}
		
		
		
		
		
	
	
		
		
	
	
	
		

	}

}
