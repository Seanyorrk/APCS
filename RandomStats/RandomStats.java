package RandomStats;

public class RandomStats {
    public static void main(String[] args) {
        //generate 500 random numbers between 0 and 9
        int[] numbers = new int[500];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10);
        }

        //display the number of occurrences of each number
        int[] counts = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
        
    }
}
