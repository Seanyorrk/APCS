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

    public static int ternarySearch(int[] items, int start, int end, int goal) {
        if (start > end) {
            return -1;
        } else {
            int partitionSize = (end - start + 1) / 3;
            int mid1 = start + partitionSize;
            int mid2 = end - partitionSize;

            if (goal == items[mid1]) {
                return mid1;
            } else if (goal == items[mid2]) {
                return mid2;
            } else if (goal < items[mid1]) {
                return ternarySearch(items, start, mid1 - 1, goal);
            } else if (goal > items[mid2]) {
                return ternarySearch(items, mid2 + 1, end, goal);
            } else {
                return ternarySearch(items, mid1 + 1, mid2 - 1, goal);
            }
        }
    }

    public static int interpolationSearch(int[] items, int start, int end, int goal) {
       int mid;
       
       mid = (int)((double)(goal - items[start]) / (items[end] - items[start]) * (end - start) + start);

       if (start > end) {
           return -1;
         } else if (goal == items[mid]) {
             return mid;
         } else if (goal < items[mid]) {
             return interpolationSearch(items, start, mid - 1, goal);
         } else {
             return interpolationSearch(items, mid + 1, end, goal);
        }
    }

}
