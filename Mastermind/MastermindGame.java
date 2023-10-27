


package Mastermind;
import java.util.Random;

public class MastermindGame extends Mastermind {
   private int[] code;
   private int[] result;
    //new mastermind game method
    public MastermindGame(int pegs, int colors) {
        //create a random object
        Random rand = new Random();
        //create a code array
       code = new int[pegs];
        //fill the code array with random numbers
        for (int i = 0; i < pegs; i++) {
            code[i] = rand.nextInt(colors);
        }
    }

    //check guess method
    public int[] checkGuess(int[] guess) {
        //create a result array
        result = new int[2];
        //create a correct color and position counter
        int correctColorAndPosition = 0;
        //create a correct color but incorrect position counter
        int correctColorButIncorrectPosition = 0;
        //create a code copy array
        int[] codeCopy = code.clone();
        //create a guess copy array
        int[] guessCopy = guess.clone();
        //check for correct color and position
        for (int i = 0; i < code.length; i++) {
            if (codeCopy[i] == guessCopy[i]) {
                correctColorAndPosition++;
                codeCopy[i] = -1;
                guessCopy[i] = -2;
            }
        }
        //check for correct color but incorrect position
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (codeCopy[i] == guessCopy[j]) {
                    correctColorButIncorrectPosition++;
                    codeCopy[i] = -1;
                    guessCopy[j] = -2;
                }
            }
        }
        //set the result array
        result[0] = correctColorAndPosition;
        result[0] = correctColorAndPosition;
        result[1] = correctColorButIncorrectPosition;
        //return the result array
        //return the result array
        return result;
    }
}
