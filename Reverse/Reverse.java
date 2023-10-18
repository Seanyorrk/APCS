package Reverse;

public class Reverse {
    public static void main(String[] args) {
        //element in an integer array of 10 elements
        int[] reverse = new int[10];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = i + 1;
        }

        //application then displays the value of each element in the array in reverse order
        for (int i = 9; i <= reverse.length; i--) {
            System.out.println(reverse[i]);
        }

    }
}
