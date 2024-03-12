package OMS;
import java.util.Arrays;

public class OMS {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
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
