package desing.pattern.behavioral.observer.v4;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create objects for testing
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

		// Pass the displays to Cricket data
		CricketData cricketData = new CricketData(currentScoreDisplay, averageScoreDisplay);

		// In real app you would have some logic to call this
		// function when data changes
		cricketData.dataChanged();

	}

}
