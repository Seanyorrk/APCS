package ReadFile;

import java.util.Scanner;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File textFile = new File("ArthurMorgan.txt");
        FileReader in;
        BufferedReader readFile;
        String lineOfText;
        try {
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null) {
                System.out.println(lineOfText);
            }
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
