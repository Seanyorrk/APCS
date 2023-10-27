package Manacala;
import java.util.Scanner;
public class Manacala {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //create a board using simple characters and use letters as pits
        //create a board array
        int[] board = new int[14];
        //fill the board array with 4 stones in each pit
        for (int i = 0; i < board.length; i++) {
            if (i != 6 && i != 13) {
                board[i] = 4;
            }
        }
        
            
    }
}
