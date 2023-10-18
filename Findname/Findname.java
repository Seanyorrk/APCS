package Findname;

import java.util.Scanner;

public class Findname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = input.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }
        System.out.print("Enter the name to find: ");
        String nameToFind = input.next();
        int index = linear(names, nameToFind);
        if (index == -1) {
            System.out.println(nameToFind + " not found.");
        } else {
            System.out.println(nameToFind + " found at index " + index + ".");
        }
    }

    public static int linear(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
