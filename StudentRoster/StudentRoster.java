package StudentRoster;

 import java.util.Scanner;
public class StudentRoster {
    public static void main(String[] args) {
        //prompt user for number of students
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("How many students are in the class?");
            int numStudents = input.nextInt();
            //prompt the user to list the students name and store them in an array
            String[] studentNames =  new String[numStudents];
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter the name of student " + (i+1));
                studentNames[i] = input.next();
            }
            //after names are entered, applictation will display title "Student Roster" and list the names of the students in the array
            System.out.println("Student Roster");
            for (int i = 0; i < numStudents; i++) {
                System.out.println(studentNames[i]);
            }
        } finally {
            input.close();
        }
        


    }
}
