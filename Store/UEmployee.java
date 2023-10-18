package Store;

public class UEmployee {

    //instance variables
    private String firstName;
    private String lastName;
    private int idNumber;
    private String jobTitle;
    private double salary;

    //constructor

    public UEmployee(String firstName, String lastName, int idNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.salary = salary;
    }

    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //toString method

    public String toString() {
        return "Employee Name: " + firstName + " " + lastName + "\n" +
                "ID Number: " + idNumber + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Salary: " + salary + "\n";
    }

    
}