package Stats;

import java.io.*;
import java.util.Scanner;
public class Stats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file to create: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter the number of student grades: ");
        int numGrades = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (int i = 0; i < numGrades; i++) {
                System.out.print("Enter the name of student " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter the grade of student " + (i + 1) + ": ");
                double grade = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                
                bufferedWriter.write(name + "," + grade);
                bufferedWriter.newLine();
            }
            
            bufferedWriter.close();
            fileWriter.close();
            
            File dataFile = new File(fileName);
            FileReader fileReader = new FileReader(dataFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            double totalScores = 0;
            int numScores = 0;
            double highestScore = Double.MIN_VALUE;
            double lowestScore = Double.MAX_VALUE;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                double score = Double.parseDouble(parts[1]);
                
                numScores++;
                totalScores += score;
                
                if (score > highestScore) {
                    highestScore = score;
                }
                
                if (score < lowestScore) {
                    lowestScore = score;
                }
            }
            
            double avgScore = totalScores / numScores;
            
            System.out.println("Average = " + avgScore);
            System.out.println("Highest = " + highestScore);
            System.out.println("Lowest = " + lowestScore);
            
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Problem reading or writing file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
