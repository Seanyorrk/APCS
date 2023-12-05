package Manacala;

import java.util.Scanner;

public class Manacala {
    public static void printBoard(int[] board) {
        System.out.print("  ");
        for (int i = 0; i < board.length; i++) {
            if (i == 6) {
                System.out.println("");
            }
            
            System.out.print(board[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create a board using simple characters and use letters as pits
        // create a board array
        int[] board = new int[14];
        // fill the board array with 4 stones in each pit
        for (int i = 0; i < board.length; i++) {
            if (i != 6 && i != 13) {
                board[i] = 3;
            }
        }
        do { // print the board
            printBoard(board);
            // prompt the user to enter a pit number
            System.out.print("Enter a pit number: ");
            int pit = input.nextInt();
            // check if the pit is valid
            while (pit < 0 || pit > 5) {
                System.out.println("Invalid pit number. Try again.");
                System.out.print("Enter a pit number: ");
                pit = input.nextInt();
            }
            // check if the pit is empty
            while (board[pit] == 0) {
                System.out.println("Pit is empty. Try again.");
                System.out.print("Enter a pit number: ");
                pit = input.nextInt();
            }
            // move the stones
            int stones = board[pit];
            board[pit] = 0;
            while (stones > 0) {
                pit++;
                if (pit == 14) {
                    pit = 0;
                }
                board[pit]++;
                stones--;
            }
            printBoard(board);
        } while (true);
        // print the board

    }
}
