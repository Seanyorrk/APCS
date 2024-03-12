package Sorts;

import java.util.Arrays;

public class Searches {
    public static int binarySearch(int[] items, int start, int end, int goal) {
        if (start > end) {
            return (-1);
        } else {
            int mid = (start + end) / 2;
            if (goal == items[mid]) {
                return (mid);
            } else if (goal < items[mid]) {
                return (binarySearch(items, start, mid - 1, goal));
            } else {
                return (binarySearch(items, mid + 1, end, goal));
            }
        }
    }

    public static void main(String[] args) {
        String[] array = { "apple", "banana", "cherry", "date", "elderberry" };
        Arrays.sort(array);
        String target = "cherry";
        int index = Arrays.binarySearch(array, target);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
