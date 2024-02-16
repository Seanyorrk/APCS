package ApplicationDoc;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class ApplicationDocs {
    public static void main(String[] args) {
       File base = new File("I:\\APCS\\ApplicationDoc\\Coder.txt");
       Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the name of the file you want to create: ");
            String fileName = scanner.nextLine();

            File commentFile = new File("I:\\APCS\\ApplicationDoc\\" + fileName + ".txt");

            if (commentFile.exists()) {
                try{
                    Scanner fileScanner = new Scanner(commentFile);

                    String contents = "";

                    boolean isInJavaDoc = false;

                    while (fileScanner.hasNextLine()) {
                        String line = fileScanner.nextLine();

                        if(line.contains("/*") ){
                            isInJavaDoc = true;
                            line = line.replace("/**", "");
                            line = line.replace("/*", "");
                        }

                        boolean isEnd = false;

                        if(line.contains("*/")){
                            isEnd = true;
                            line = line.replace("*/", "");
                        }

                        if (isInJavaDoc) {
                            String other = line.trim().replace("*", "");

                            if(other.length() > 0){
                                contents += other + "\n";
                            }  
                        }
                        
                    }

                            if (isEnd) {
                                isInJavaDoc = false;
                            }
                        }

                        File outputFile = new File("I:\\APCS\\ApplicationDoc\\" + fileName + ".txt");

                        if (outputFile.createNewFile()) {
                            System.out.println("File created: " + outputFile.getName());
                        } else {
                            System.out.println("File already exists.");
                        }

                        FileWriter writer = new FileWriter(outputFile);

                        writer.write(contents); // Fixed: FileWriter.write(contents) -> writer.write(contents)

                        writer.close();

                        fileScanner.close();
                    } catch (Exception e) {
                        // Handle exception
                    }
                System.out.println("File not found");
            }else

    {
        System.out.println("File not found");
    }

    scanner.close();

}}
