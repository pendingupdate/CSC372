public class Employee {

    // Fields
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

    // Constructor
    Employee(String firstName, String lastName, int employeeID, double salary) {
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
    public void employeeSummary(int employeeID) {
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Salary: " + this.salary);
    }


}