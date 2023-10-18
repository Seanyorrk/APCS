package Store;

public class Faculty extends UEmployee {
    //The Faculty class should include members for storing and returning the department name.

    private String departmentName;

    public Faculty(String firstName, String lastName, int idNumber, double salary, String departmentName) {
        super(firstName, lastName, idNumber, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String toString() {
        return "Employee Name: " + getFirstName() + " " + getLastName() + "\n" +
                "ID Number: " + getIdNumber() + "\n" +
                "Department Name: " + departmentName + "\n" +
                "Salary: " + getSalary() + "\n";
    }

    public boolean equals(Faculty other) {
        return this.getFirstName().equals(other.getFirstName()) &&
                this.getLastName().equals(other.getLastName()) &&
                this.getIdNumber() == other.getIdNumber() &&
                this.getSalary() == other.getSalary() &&
                this.departmentName.equals(other.departmentName);
    }

    

    



}
