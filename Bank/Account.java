package Bank;
import java.text.NumberFormat;
public class Account {
    private double balance;
    private Customer cust;

    public Account(double bal, String firstName, String lastName, String street, String city, String state, String zip) {
        balance = bal;
        cust = new Customer(firstName, lastName, street, city, state, zip);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void setAddress(String street, String city, String state, String zip) {
        cust.setAddress(street, city, state, zip);
    }

    public void withdrawal(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }
    }

    public String toString() {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        String accountString;
        accountString = cust.toString();
        accountString += "Current balance is " + money.format(balance) + "\n";
        return accountString;
    }
}
