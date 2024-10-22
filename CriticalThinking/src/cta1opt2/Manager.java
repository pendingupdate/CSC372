package src.cta1opt2;

public class Manager extends Employee {

	// New field
	public String department;

	// Subclass constructor
	public Manager(String firstName, String lastName, int employeeID, String department) {
		super(firstName, lastName, employeeID);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void employeeSummary() {
		// prints all Employee superclass attributes
		super.employeeSummary();
		// prints Manager subclass attribute
		System.out.println("Department: " + getDepartment());
	}

}
