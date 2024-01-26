package MyFiles;

import java.io.File;
import java.util.Scanner;

public class MyFiles {
    public static void main(String[] args) {
        File file = new File("I:\\Downloads\\zzz.txt");
        // ask user for file name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to read");
        String fileName = input.next();
        file = new File(fileName);
        input.close();
        // check if file exists
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            try {
                file.createNewFile();
                System.out.println("File created");
            } catch (Exception e) {
                System.out.println("File not created");
                System.err.println("Exception:" + e.getMessage());
            }
        }

    }

}
