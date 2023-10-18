package Mastermind;

import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        int pegs;
        int colors;

        Scanner input = new Scanner(System.in);
        System.out.println("How many pegs would you like to play with? (1-10)");
        pegs = input.nextInt();
        System.out.println("How many colors would you like to play with? (1-9)");
        colors = input.nextInt();
        MastermindGame game = new MastermindGame(pegs, colors);
        game.start();

    }
}
