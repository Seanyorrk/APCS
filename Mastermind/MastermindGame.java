


package Mastermind;
import java.util.Random;

public class MastermindGame extends Mastermind {
    private int numPegs;
    private int numColors;
    private int[] secretCode;

    public MastermindGame(int numPegs, int numColors) {
        this.numPegs = numPegs;
        this.numColors = numColors;
        this.secretCode = generateSecretCode();
    }

    private int[] generateSecretCode() {
        int[] code = new int[numPegs];
        Random rand = new Random();
        for (int i = 0; i < numPegs; i++) {
            code[i] = rand.nextInt(numColors) + 1;
        }
        return code;
    }

    public void start() {
        MastermindGame game = new MastermindGame(4, 6);
        int[] secretCode = game.secretCode;
        System.out.println("Secret code: ");
        for (int i = 0; i < secretCode.length; i++) {
            System.out.print(secretCode[i] + " ");
        }
    }
}
