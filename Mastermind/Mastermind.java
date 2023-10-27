package Mastermind;

import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //get user input for the number of pegs and colors
        System.out.print("Enter the number of pegs: ");
        int pegs = input.nextInt();
        System.out.print("Enter the number of colors: ");
        int colors = input.nextInt();

        //create a mastermindGame object with the user input
        MastermindGame game = new MastermindGame(pegs, colors);

        //play the game until the user guess the code
            boolean guessed =  false;
              while(!guessed) {
                // Get user input for the game
                System.out.println("Enter your guess(Seperated by spaces)");
                int[] guess =  new int[pegs];
                for (int i =  0; i < pegs; i++) {
                    guess[i] = input.nextInt();
                }

                // Check the users guess and display the results

                int[] result = game.checkGuess(guess);
                System.out.println("Correct color and correct position"  + result[0]);
                System.out.println("Correct color but incorrect position"  + result[1]);

                //check if user guessed code
                if (result[0] == pegs) {
                    System.out.println("You guessed the code!");
                    guessed = true;
                }
                

              }


        }

    }

