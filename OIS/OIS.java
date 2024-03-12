package OIS;

public class OIS {
    public static void main(String[] args) {
        Integer items[] = {5, 3, 7, 6, 2, 8, 1, 9, 4, 0};

       insertionSort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
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
}
