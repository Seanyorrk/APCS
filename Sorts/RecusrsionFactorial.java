package Sorts;

public class RecusrsionFactorial {

    public static int intPower(int num, int power) {
        int result;

        if (power == 0) {
            result = 1;
        } else {
            result = num * intPower(num, power - 1);
        }
        return result;
    }


    public static void main(String[] args) {
        int x = intPower(2, 5);
        System.out.println(x);

    }
}
