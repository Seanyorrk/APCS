package Sorts;

import java.util.ArrayList;

public class Sorts {

    /**
     * Sorts an array of data from low to high
     * pre: none
     * post: items has been sorted from low to high
     */
    public static void selectionSort(int[] items) {

        for (int index = 0; index < items.length; index++) {
            for (int subIndex = index; subIndex < items.length; subIndex++) {
                if (items[subIndex] < items[index]) {
                    int temp = items[index];
                    items[index] = items[subIndex];
                    items[subIndex] = temp;
                }
            }
        }
    }

    /**
     * Sorts an array of objects from low to high
     * pre: none
     * post: objects have been sorted from low to high
     */
    public static void selectionSort(Comparable[] items) {

        for (int index = 0; index < items.length; index++) {
            for (int subIndex = index; subIndex < items.length; subIndex++) {
                if (items[subIndex].compareTo(items[index]) < 0) {
                    Comparable temp = items[index];
                    items[index] = items[subIndex];
                    items[subIndex] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] items) {

        int temp, previousIndex;

        for (int index = 1; index < items.length; index++) {
            temp = items[index];
            previousIndex = index - 1;

            while ((items[previousIndex] > temp) && (previousIndex > 0)) {
                items[previousIndex + 1] = items[previousIndex];
                previousIndex -= 1;
            }

            if (items[previousIndex] > temp) {
                items[previousIndex + 1] = items[previousIndex];
                items[previousIndex] = temp;
            } else {
                items[previousIndex + 1] = temp;
            }
        }
    }

    public static void ArrayListSort(ArrayList<Comparable> items) {

        
    }

}
