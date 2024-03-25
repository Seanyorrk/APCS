package Sorts;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorts {

    public static void main(String[] args) {
        int[] items = {5, 2, 7, 1, 3};
        System.out.println("Unsorted items: " + Arrays.toString(items));

        // Call any of the sorting methods here
        // selectionSort(items);
        // insertionSort(items);
        // mergesort(items, 0, items.length - 1);

        System.out.println("Sorted items: " + Arrays.toString(items));
    }

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

    public static void selectionSort(ArrayList<Double> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
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

    public static <T extends Comparable<T>> void insertionSort(T[] items) {
        T temp;
        int previousIndex;

        for (int index = 1; index < items.length; index++) {
            temp = items[index];
            previousIndex = index - 1;

            while (previousIndex >= 0 && items[previousIndex].compareTo(temp) > 0) {
                items[previousIndex + 1] = items[previousIndex];
                previousIndex--;
            }

            items[previousIndex + 1] = temp;
        }
    }

    // Sorts an array of integers using Merge Sort
    private static void merge(int[] items, int start, int mid, int end) {
        int[] temp = new int[items.length];
        int pos1 = start;
        int pos2 = mid + 1;
        int spot = start;

        while (!(pos1 > mid && pos2 > end)) {
            if ((pos1 > mid) || ((pos2 <= end) && (items[pos2] < items[pos1]))) {
                temp[spot] = items[pos2];
                pos2 += 1;
            } else {
                temp[spot] = items[pos1];
                pos1 += 1;
            }
            spot += 1;
        }
        /* copy values from temp back to items */
        for (int i = start; i <= end; i++) {
            items[i] = temp[i];
        }
    }

    // Sorts an array of integers using Merge Sort
    public static void mergesort(int[] items, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(items, start, mid);
            mergesort(items, mid + 1, end);
            merge(items, start, mid, end);
        }
    }

    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(String[] arr, int left, int mid, int right) {
        String[] temp = new String[arr.length];
        int pos1 = left;
        int pos2 = mid + 1;
        int spot = left;

        while (!(pos1 > mid && pos2 > right)) {
            if ((pos1 > mid) || ((pos2 <= right) && (arr[pos2].compareTo(arr[pos1]) < 0))) {
                temp[spot] = arr[pos2];
                pos2 += 1;
            } else {
                temp[spot] = arr[pos1];
                pos1 += 1;
            }
            spot += 1;
        }
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    

}
