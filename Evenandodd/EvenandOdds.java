package Evenandodd;

public class EvenandOdds {
    public static void main(String[] args) {
        //generate 25 random integers between 0 and 99
        int[] numbers = new int[25];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }
        //display evens and odds on 2 different lines
        System.out.print("The evens are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { //even
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.print("The odds are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) { //odd
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        
}
}
