package desing.pattern.behavioral.memento.v1;

public class CalculatorWindosApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		calculator.add(3, 2);
		calculator.print();
		calculator.save();
		calculator.add(3, 3);
		calculator.print();
		calculator.undo();
		calculator.print();
		

	}

}
