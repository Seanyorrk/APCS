package Sorts;

public class Example {
    public static void main(String[] args) {
        int items[] = {5, 3, 7, 6, 2, 8, 1, 9, 4, 0};

        Sorts.selectionSort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }

        Sorts.insertionSort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }

        
    }
}
