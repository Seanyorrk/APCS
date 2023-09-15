package Coin;

public class CoinClient {
    public static void main(String[] args) {
        Coin myCoin = new Coin();
        System.out.println("Initial: " + myCoin);
        for (int i = 0; i < 10; i++) {
            myCoin.flip();
            System.out.println("After flip: " + myCoin);
        }

        System.out.println("Done!");
    }
}
