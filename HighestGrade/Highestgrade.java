package HighestGrade;
import java.util.Scanner;
public class Highestgrade {
    //create application that asks user for 5 grades between 0 and 100 and store them in an array list
    //display highest grade with a message

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[5];
        int highest = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }
        System.out.println("Highest grade is " + highest);input.close();
    }
    
}
