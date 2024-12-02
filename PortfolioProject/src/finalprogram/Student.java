package finalprogram;

public class Student {

	// fields
	private double gpa;
	private String name;
	private String address;

	// constructor
	public Student(String name, String address, double gpa) {
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}

	// getters and setters since fields are private
	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// format string output	
	@Override
	public String toString() {
		return "Student: " + getName()  + "\nAddress: " + getAddress() + "\nGPA: " + getGPA() + "\n\n";
	}
	
}
