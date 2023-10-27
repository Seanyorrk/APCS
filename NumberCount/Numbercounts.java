import java.util.Scanner;
public class Numbercounts {
    public static void main(String[] args) {
       //prompt user for a number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        //count the number of occurrences of each digit in the number
        int[] counts = new int[10];
        while (number > 0) {
            int digit = number % 10;
            counts[digit]++;
            number = number / 10;
        }
        //display the counts
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s: " + counts[i]);
        }
        input.close();

    }
}
