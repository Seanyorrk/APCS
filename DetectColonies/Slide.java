package DetectColonies;

/**
 * Slide class.
 */

import java.io.*;
//import arraylist

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Slide {
    private char NON_COLONY = '0';
    private char[][] slideData;

    /**
     * constructor
     * pre: Slide file contains valid slide data in the format:
     * first line: lenght of slide
     * second line: width of slide
     * remaining lines: slide data
     * post: Slide data has been loaded from slide file.
     */
    public Slide(String s) {

        try {
            File slideFile = new File(s);
            FileReader in = new FileReader(slideFile);
            BufferedReader readSlide = new BufferedReader(in);
            int length = Integer.parseInt(readSlide.readLine());
            int width = Integer.parseInt(readSlide.readLine());
            slideData = new char[length][width];
            for (int row = 0; row < length; row++) {
                for (int col = 0; col < width; col++) {
                    slideData[row][col] = (char) readSlide.read();
                }
                readSlide.readLine(); // read past end-of-line characters
            }
            readSlide.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }

    /**
     * Determines a colony size
     * pre: none
     * post: All colony cells adjoining and including cell (Row, Col) have
     * been changed to NON_COLONY, and count of these cells is returned.
     */
    private int collectCells(int row, int col, char color) {

        if ((row < 0) || (row >= slideData.length) || (col < 0) || (col >= slideData[0].length)
                || (slideData[row][col] != NON_COLONY)) {
            return (0);
        } else {
            slideData[row][col] = NON_COLONY;
            color = slideData[row][col];
            return (1 + collectCells(row + 1, col, color) + collectCells(row - 1, col, color)
                    + collectCells(row, col + 1, color) + collectCells(row, col - 1, color));
        }
    }

    /**
     * Analyzes a slide for colonies and displays colony data
     * pre: none
     * post: Colony data has been displayed.
     */
    public void displayColonies() {
        int count;
        List<Integer> colonySizes = new ArrayList<>();

        for (int row = 0; row < slideData.length; row++) {
            for (int col = 0; col < slideData[0].length; col++) {
                if (slideData[row][col] == NON_COLONY) {
                    char color = slideData[row][col];
                    count = collectCells(row, col, color);
                    for (int size : colonySizes) {
                        Collections.sort(colonySizes, Collections.reverseOrder());
                        System.out.println("Colony with size " + size + " at location " + row + ", " + col
                                + "with color " + color);
                    }

                }
            }
        }

        // Sort the colony sizes in descending order
        

        // Display the colonies from largest to smallest

    }

    /**
     * Displays a slide.
     * pre: none
     * post: Slide data has been displayed.
     */
    public void displaySlide() {

        for (int row = 0; row < slideData.length; row++) {
            int col; // Declare the variable col outside of the inner loop
            for (col = 0; col < slideData[0].length; col++) {
                System.out.print(slideData[row][col]);
            }
            System.out.println();
        }
    }
}

/*
 * When trying to detect diagonal colonies, you would need to add the following
 * to the collectCells method:
 * collectCells(row+1, col+1) + collectCells(row-1, col-1) + collectCells(row+1,
 * col-1) + collectCells(row-1, col+1);
 * This would allow the method to check the cells diagonally adjacent to the
 * current cell.
 * The colonies that would be displayed are:
 */
/*
 * The second display if it were to exist would display all non colony cells.
 * This is because the displaySlide method is displaying all the cells in the
 * slide and the displayColonies method is displaying all the cells that are not
 * colonies.
 * The displaySlide method would display all the cells in the slide, including
 * the colonies, and the displayColonies method would display all the cells that
 * are not colonies.
 */
