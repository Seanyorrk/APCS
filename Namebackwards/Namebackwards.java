

package Namebackwards;
import java.util.Scanner;
public class Namebackwards {
    public static void main(String[] args) {
        //ask user for his or her name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        //store the name in a character array
        char[] nameLetters = name.toCharArray();
        //display the name in reverse order
        for (int i = nameLetters.length - 1; i >= 0; i--) {
            System.out.print(nameLetters[i]);
        }
        
    }
}
