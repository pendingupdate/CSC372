package cta1opt2;

public class Test {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Jen", "Johnson", 1);
		
		employee1.salary = 65000;

		Manager manager1 = new Manager("Ellie", "Smythe", 2, "Accounting");

		employee1.employeeSummary();
		manager1.employeeSummary();

	}

}
