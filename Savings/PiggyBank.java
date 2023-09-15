package Savings;

public class PiggyBank {
    // add coins, remove coins and check balance
    private int pennies, nickels, dimes, quarters;
    private double total;

    public PiggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
        total = 0;

    }

    public void addPennies(int p) {
        pennies += p;
        total += p * 0.01;
    }

    public void addNickels(int n) {
        nickels += n;
        total += n * 0.05;
    }

    public void addDimes(int d) {
        dimes += d;
        total += d * 0.10;
    }

    public void addQuarters(int q) {
        quarters += q;
        total += q * 0.25;
    }

    public void total() {
        total = pennies + nickels + dimes + quarters;
        System.out.println("You have " + total + " dollars in your piggy bank.");
    }

    public void takeMoneyOut(Double amount) {
        total -= amount;
        System.out.println("You have " + total + " dollars in your piggy bank.");
    }

    public int getPennies() {
        return pennies;
    }

    public int getNickels() {
        return nickels;
    }

    public int getDimes() {
        return dimes;
    }

    public int getQuarters() {
        return quarters;
    }

    public double getTotal() {
        return total;
    }

    public double getBalance() {
        return total;
    }

}
