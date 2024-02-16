package TestProcessor;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import javax.annotation.processing.Filer;

import HighestGrade.Highestgrade;

import java.io.IOException;
public class TestProcessor {
    public static void main(String[] args) {
        int score = 0, total = 0;
        double highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;
        
        File file = new File("I:\\APCS\\TestProcess.txt");
        //The first line in the file is the correct answer
        
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String correctAnswer = bufferedReader.readLine();
            String studentName;
            String studentAnswer;
            while ((studentName = bufferedReader.readLine()) != null) {
                studentAnswer = bufferedReader.readLine();
                
                score = 0;
                for (int i = 0; i < min(correctAnswer.length(), studentAnswer.length()); i++) {
                    if (correctAnswer.charAt(i) == studentAnswer.charAt(i)) {
                        score++;
                    }
                }
                total++;
                if (score > highest) {
                    highest = score;
                }
                if (score < lowest) {
                    lowest = score;
                }
                System.out.println("Student: " + studentName + ", Correct Answers: " + score + " out of " + correctAnswer.length() + " or " + (score / (double)correctAnswer.length() * 100) + "%");
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        }

    public static int min(int a, int b) {
       if (a < b) {
           return a;
       } else {
           return b;
       }
    }
}

