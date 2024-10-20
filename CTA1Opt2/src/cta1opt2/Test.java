package cta1opt2;

public class Test {

	public static void main(String[] args) {
		// Instance of Employee
		Employee employee1 = new Employee("Jen", "Johnson", 1);

		// Instance of Manager subclass
		Manager manager1 = new Manager("Ellie", "Smythe", 2, "Accounting");

		// Print Employee summaries
		employee1.employeeSummary();
		manager1.employeeSummary();
		System.out.printf("");
	}
}
