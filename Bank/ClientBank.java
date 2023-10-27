package Bank;
import java.util.Scanner;
import java.text.NumberFormat;
public class ClientBank {
    public static void main(String[] args) {
        Account munozAccount = new Account(250, "Maria", "Munoz", "1234 Main St", "Miami", "FL", "33445");
        Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		String street, city, state, zip;
		
		System.out.println(munozAccount);
		
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
		//modify the code to have the user enter the street, city, state, and zip code
		System.out.println("Enter street: ");
		street = input.next();
		System.out.println("Enter city: ");
		city = input.next();
		System.out.println("Enter state: ");
		state = input.next();
		System.out.println("Enter zip code: ");
		zip = input.next();
		munozAccount.setAddress(street, city, state, zip);
		System.out.println(munozAccount);

		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));	input.close();	
    }   
}
