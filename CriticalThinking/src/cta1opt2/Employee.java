package src.cta1opt2;

public class Employee {
	// Fields
	public String firstName;
	public String lastName;
	public int employeeID;
	public double salary;

	// Default Constructor
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.employeeID = 0;
		this.salary = 0;
	}

	// Constructor with employee fields and salary set to 0, per assignment instructions
	Employee(String firstName, String lastName, int employeeID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.salary = 0;
	}

	// Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	// Method
	public void employeeSummary() {
		System.out.println("\nEmployee ID: " + getEmployeeID());
		System.out.println("First name: " + getFirstName());
		System.out.println("Last name: " + getLastName());
		System.out.println("Salary: $" + salary);
	}

}
