package Coder;
import java.util.Scanner;
public class Coder {
    //ask for string
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        //encode the string
        //encoding should add 2 to the unicode value of each character to create a new letter
        //keep all spaces and the letters x and y should be changed to a and b
        //print the encoded string
        String encodedStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'x') {
                encodedStr += 'a';
            } else if (ch == 'y') {
                encodedStr += 'b';
            } else if (ch == ' ') {
                encodedStr += ' ';
            } else {
                encodedStr += (char)(ch + 2);
            }
        }
        System.out.println("Encoded string: " + encodedStr);
        



    }
    
}
