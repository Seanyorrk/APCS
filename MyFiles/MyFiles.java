package MyFiles;

import java.io.File;
import java.util.Scanner;

public class MyFiles {
    public static void main(String[] args) {
        // File file = new File("I:\\Downloads\\zzz.txt");
        // ask user for file name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to read");
        String fileName = input.next();
        File file = new File(fileName);
    
        // check if file exists
        if (file.exists()) {
        } else {
            System.out.println("File already exists.");
        }

        try {
            file.createNewFile();
            System.out.println("File created");
            System.out.println("Do you want to delete the file? (Y/N)");
            String deleteOption = input.next();
            if (deleteOption.equalsIgnoreCase("Y")) {
                if (file.delete()) {
                    System.out.println("File deleted");
                } else {
                    System.out.println("Failed to delete the file");
                } 
            } else {
                System.out.println("File kept");
            }
        } catch (Exception e) {
            System.out.println("File not created");
            System.err.println("Exception:" + e.getMessage());
        }
    }
}