package Store;

public class Staff extends UEmployee{
    //The Staff class should include members for storing and returning the job title.

    private String jobTitle;

    public Staff(String firstName, String lastName, int idNumber, double salary, String jobTitle) {
        super(firstName, lastName, idNumber, salary);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return "Employee Name: " + getFirstName() + " " + getLastName() + "\n" +
                "ID Number: " + getIdNumber() + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Salary: " + getSalary() + "\n";
    }

    






}
