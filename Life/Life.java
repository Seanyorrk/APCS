package Life;

import java.util.Scanner;

public class Life {
    public static void printWorld(int[][] world) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[1].length; j++) {
                if (world[i][j] == 1) {
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // create 20x20 grid
        int[][] world = new int[20][20];
        // fill the grid with 0
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[1].length; j++) {
                world[i][j] = 0;
            }
        }
        // prompt user for the coordinates of live cells on the first day
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of live cells on the first day: ");
        System.out.println("Enter a negative number to end input");
        int x = 0;
        int y = 0;

        do {
            System.out.print("Enter x coordinate: ");
            x = input.nextInt() - 1;
            System.out.print("Enter y coordinate: ");
            y = input.nextInt() - 1;
            if (x >= 0 && y >= 0) {
                world[x][y] = 1;
            }
            // print the grid
            printWorld(world);
        } while (x >= 0 && y >= 0);

        // generate each days world as long as the user wants to continue or until there
        // are no more cells
        boolean continueGame = true;

        while (continueGame) {
            printWorld(world);
            System.out.println("Do you want to continue? (y/n)");
            String answer = input.next();
            if (answer.equals("n")) {
                continueGame = false;
            } else {
                // create a new world
                int[][] newWorld = new int[20][20];
                // check each cell in the world
                for (int i = 0; i < world.length; i++) {
                    for (int j = 0; j < world[1].length; j++) {
                        // check the number of live neighbors
                        int liveNeighbors = 0;
                        // check the cell above
                        if (i > 0 && world[i - 1][j] == 1) {
                            liveNeighbors++;
                        }
                        // check the cell below
                        if (i < world.length - 1 && world[i + 1][j] == 1) {
                            liveNeighbors++;
                        }
                        // check the cell to the left
                        if (j > 0 && world[i][j - 1] == 1) {
                            liveNeighbors++;
                        }
                        // check the cell to the right
                        if (j < world[1].length - 1 && world[i][j + 1] == 1) {
                            liveNeighbors++;
                        }
                        // check the cell above and to the left
                        if (i > 0 && j > 0 && world[i - 1][j - 1] == 1) {
                            liveNeighbors++;
                        }
                        // check the cell above and to the right
                        if (i > 0 && j < world[1].length - 1 && world[i - 1][j + 1] == 1) {
                            liveNeighbors++;
                        }
                        // check the cell below and to the left
                        if (i < world.length - 1 && j > 0 && world[i + 1][j - 1] == 1) {
                            liveNeighbors++;
                        }
                        // check the cell below and to the right
                        if (i < world.length - 1 && j < world[1].length - 1 && world[i + 1][j + 1] == 1) {
                            liveNeighbors++;
                        }

                        System.out.println("Cell (" + i + ", " + j + ") has " + liveNeighbors
                                + " live neighbors, and is currently " + world[i][j]);
                        // apply the rules of the game to the cell
                        if (world[i][j] == 1) {
                            if (liveNeighbors == 2 || liveNeighbors == 3) {
                                newWorld[i][j] = 1;
                            }
                        } else {
                            if (liveNeighbors == 3) {
                                newWorld[i][j] = 1;
                            }
                        }
                    }
                }

                // update the world
                for (int k = 0; k < world.length; k++) {
                    for (int l = 0; l < world[1].length; l++) {
                        world[k][l] = newWorld[k][l];
                    }
                }
                // print the world
                printWorld(world);
            }
        }
    }
}