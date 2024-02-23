package ApplicationDoc;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ApplicationDocs {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ApplicationDoc! Input the file name: ");
        String fileName = scanner.next();

        File inputFile = new File("I:\\APCS\\" + fileName + ".txt");
        
        if (inputFile.exists()) {
            try {
                Scanner fileScanner = new Scanner(inputFile);

                String documentations = "";

                boolean isInJavadoc = false;

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();

                    if (line.contains("/*")) {
                        isInJavadoc = true;
                        line = line.replace("/**", "");
                        line = line.replace("/*", "");
                    }

                    boolean shouldClose = false;

                    if (line.contains("*/")) {
                        shouldClose = true;
                        line = line.replace("*/", "");
                    }

                    if (isInJavadoc) {
                        String content = line.trim().replace("* ", "");

                        if (content.length() > 0) {
                            documentations += content + "\n";
                        }
                    }

                    if (shouldClose) {
                        isInJavadoc = false;
                    }
                }

                File outputFile = new File("I:\\APCS\\ApplicationDoc\\" + fileName + "2.txt");

                if (outputFile.createNewFile()) {
                    System.out.println("File created: " + outputFile.getName());
                } else {
                    System.out.println("File already exists.");
                }

                FileWriter fileWriter = new FileWriter(outputFile);
                
                fileWriter.write(documentations);
                fileWriter.close();

                fileScanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File not found.");
        }

        scanner.close();
    }
}
