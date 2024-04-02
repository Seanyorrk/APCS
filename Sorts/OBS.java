
package Sorts;

import java.util.Arrays;

public class OBS{

    public static void main(String[] args) {
        String[] array = { "apple", "banana", "cherry", "elderberry", "date" };
        Arrays.sort(array);
        String target = "elderberry";
        int index = Arrays.binarySearch(array, target);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

}



