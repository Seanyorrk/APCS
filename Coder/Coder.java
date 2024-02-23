package Coder;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Coder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        char[] textLetters;

        System.out.print("Enter a string: ");
        text = input.nextLine();

        textLetters = text.toCharArray();    //convert to an array of characters

        /* encode text */
        for (int i = 0; i < textLetters.length; i++) {
            if ((textLetters[i] >= 'a' && textLetters[i] <= 'z')         //alphabetic characters only get encoded
                    || (textLetters[i] >= 'A' && textLetters[i] <= 'Z')) {
                if (textLetters[i] == 'y') {
                    textLetters[i] = 'a';
                } else if (textLetters[i] == 'Y') {
                    textLetters[i] = 'A';
                } else if (textLetters[i] == 'z') {
                    textLetters[i] = 'b';
                } else if (textLetters[i] == 'Z') {
                    textLetters[i] = 'B';
                } else {
                    textLetters[i] = (char)(textLetters[i] + 2);
                }
            }
        }

        /* write encoded message to a file */
        try {
            File file = new File("encoded_message.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(textLetters);
            writer.close();
            System.out.println("Encoded message has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
