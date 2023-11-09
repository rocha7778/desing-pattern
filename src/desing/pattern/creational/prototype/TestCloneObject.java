package desing.pattern.creational.prototype;

public class TestCloneObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employee = new Employee(1,"Rocha","Accountant",100.0,"Carrera 34#46-33");
		Employee employee2 = employee;
		
		employee2.setName("Rocha Modified");
		
		
		
		employee.showRecord();
		
		System.out.println("Original employee " + employee);
		System.out.println("Copy of employee" +employee2);
		
		
		
		Employee employeeOriginal = new Employee(1,"Rocha","Accountant",100.0,"Carrera 34#46-33");
		Employee employeeCopy = (Employee) employeeOriginal.getClone();
		
		
		
		System.out.println("Original employee " + employeeOriginal);
		System.out.println("Copy of employee" +employeeCopy);
		
		
		
		

	}

}
