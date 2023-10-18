package GameofLight;

import java.util.Scanner;

public class GameofLight {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Game of Light! A grid size of your choosing will being by being populated with all 'O's (off). You will choose a cell based on the row and column. That cell and the surrounding cells (up, down, left, right) will switch from 'O' to 'L' of vice versa. YOu win the game when all the cells are 'L' (lit) Good luck!");
        //ask player to enter size of the grid
        int size = 0;
        while (size < 3 || size > 9) {
            System.out.print("Enter the size of the grid (3-9): ");
            size = input.nextInt();
            if (size < 3 || size > 9) {
                System.out.println("Invalid size. Try again.");
            }
        }

        //populate the grid with 'O'
        char[][] grid = new char[size][size];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <grid[i].length; j++) {
                grid[i][j] = 'O';
            }
        }

        //play the game
        boolean won = false;
        while (!won) {
            //print the grid
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j <grid[i].length; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }

            //ask the player to choose a cell to click
            int row = 0;
            int col = 0;
            while (row < 1 || row > size || col < 1 || col > size) {
                System.out.print("Enter the row and column to click (1-" + size + "): ");
                row = input.nextInt();
                col = input.nextInt();
                if (row < 1 || row > size || col < 1 || col > size) {
                    System.out.println("Invalid row or column. Try again.");
                }
            }

            //change the clicked cell and surrounding cells
            row--;
            col--;
            if (grid[row][col] == 'O') {
                grid[row][col] = 'X';
                if (row > 0) {
                    if (grid[row - 1][col] == 'O') {
                        grid[row - 1][col] = 'X';
                    } else {
                        grid[row - 1][col] = 'O';
                    }
                }
                if (row < grid.length - 1) {
                    if (grid[row + 1][col] == 'O') {
                        grid[row + 1][col] = 'X';
                    } else {
                        grid[row + 1][col] = 'O';
                    }
                }
                if (col > 0) {
                    if (grid[row][col - 1] == 'O') {
                        grid[row][col - 1] = 'X';
                    } else {
                        grid[row][col - 1] = 'O';
                    }
                }
                if (col < grid[row].length - 1) {
                    if (grid[row][col + 1] == 'O') {
                        grid[row][col + 1] = 'X';
                    } else {
                        grid[row][col + 1] = 'O';
                    }
                }
            }

            //check if all cells are 'L'
            won = true;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j <grid[i].length; j++) {
                    if (grid[i][j] == 'O') {
                        won = false;
                    }
                }
                if (!won) {
                    break;
                }
            } 
            if (won) {
                System.out.println("You won!");
            }
        }
        input.close();
    }
}
