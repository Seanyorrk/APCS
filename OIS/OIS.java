package OIS;

public class OIS {
    public static void main(String[] args) {
        int items[] = {5, 3, 7, 6, 2, 8, 1, 9, 4, 0};

       insertionSort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
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
}
