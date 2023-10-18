package CountLetter;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        final int LOW = 'A'; // smallest possible value
        final int HIGH = 'Z'; // highest possible value
        int[] letterCounts = new int[HIGH - LOW + 1];
        Scanner input = new Scanner(System.in);
        String word;
        char[] wordLetters;
        int offset; // array index
        /* prompt user for a phrase */
        System.out.print("Enter a phrase: ");
        word = input.nextLine();
        /* convert phrase to char array and count letter occurrences */
        word = word.toUpperCase();
        wordLetters = word.toCharArray();
        for (int letter = 0; letter < wordLetters.length; letter++) {
            offset = wordLetters[letter] - LOW;
            if (offset >= 0 && offset <= HIGH - LOW) {
                letterCounts[offset]++;
            }
        }
        /* show letter occurrences */
        for (int i = LOW; i <= HIGH; i++) {
            System.out.println((char) i + ": " + letterCounts[i - LOW]);

        }
    }
}
