package MadLib;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class MadLib {
    public static void main(String[] args) {
        try {
            // Open the story text file
            File file = new File("story.txt");
            Scanner scanner = new Scanner(file);

            // Call the getNoun and getVerb methods to use them
            String noun = getNoun();
            String verb = getVerb();

            //randomly select a noun and verb from the file

            

            // Replace the # with the noun and % with the verb
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] word = line.split(" ");
               for (String words : word) {
                    if (words.contains("#")) {
                        line = line.replace("#", noun);
                    }
                    if (words.contains("%")) {
                        line = line.replace("%", verb);
                    }
               }
                System.out.println(line);
            }

            //randomly select a noun and verb from the file



            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
   

    public static String getNoun() {
        //randomly select a noun from the file
        ArrayList<String> nouns = new ArrayList<String>();

        try {
            File file = new File("nouns.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                nouns.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return nouns.get((int) (Math.random() * nouns.size()));

    }

    public static String getVerb() {
        //randomly select a verb from the file
        ArrayList<String> verbs = new ArrayList<String>();

        try {
            File file = new File("verbs.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                verbs.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return verbs.get((int) (Math.random() * verbs.size()));
    }
}



