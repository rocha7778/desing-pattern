package desing.pattern.structurls.composite;

public class CompositePatternExample {

	public static void main(String[] args) {
		
		Developer dev1 = new Developer("John", "Senior Developer");
        Developer dev2 = new Developer("Alice", "Junior Developer");
        dev1.showEmployeeDetails();
        dev2.showEmployeeDetails();
        
        
        Manager manager1 = new Manager("Bob");
        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);
        
        
        Developer dev3 = new Developer("Emma", "Intern Developer");
        Developer dev4 = new Developer("Chris", "Senior Developer");

        Manager manager2 = new Manager("Dave");
        manager2.addEmployee(dev3);
        manager2.addEmployee(dev4);
        
        
        
        Manager manager3 = new Manager("Eva");
        manager3.addEmployee(manager1);
        manager3.addEmployee(manager2);

        System.out.println("Managerial Hierarchy:");
        manager3.showEmployeeDetails();

	}

}
