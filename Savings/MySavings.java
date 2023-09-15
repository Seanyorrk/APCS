package Savings;

import java.util.Scanner;

public class MySavings {
   // Create a mySavings object that displays a menu of choices for entering
   // pennies, nickels, dimes, quarters, and dollars into a piggy bank. The user
   // should be able to enter coins and bills until they choose to quit. The
   // program should display the total amount of money in the piggy bank after each
   // deposit. The program should also display the total amount of money in the
   // piggy bank when the user chooses to quit.
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      PiggyBank mySavings = new PiggyBank();
      int choice = 0;
      while (choice != 7) {
         System.out.println("1. Enter pennies");
         System.out.println("2. Enter nickels");
         System.out.println("3. Enter dimes");
         System.out.println("4. Enter quarters");
         System.out.println("5. Show total");
         System.out.println("6. Take money out");
         System.out.println("7. Quit");
         System.out.print("Enter your choice: ");
         choice = input.nextInt();
         if (choice == 1) {
            System.out.print("Enter the number of pennies: ");
            int pennies = input.nextInt();
            mySavings.addPennies(pennies);
            System.out.println("You have " + mySavings.getPennies() + " pennies in your piggy bank.");
         } else if (choice == 2) {
            System.out.print("Enter the number of nickels: ");
            int nickels = input.nextInt();
            mySavings.addNickels(nickels);
            System.out.println("You have " + mySavings.getNickels() + " nickels in your piggy bank.");
         } else if (choice == 3) {
            System.out.print("Enter the number of dimes: ");
            int dimes = input.nextInt();
            mySavings.addDimes(dimes);
            System.out.println("You have " + mySavings.getDimes() + " dimes in your piggy bank.");
         } else if (choice == 4) { 
            System.out.print("Enter the number of quarters: ");
            int quarters = input.nextInt();
            mySavings.addQuarters(quarters);
            System.out.println("You have " + mySavings.getQuarters() + " quarters in your piggy bank.");
         } else if (choice == 5) {
            System.out.println("You have " + mySavings.getTotal() + " dollars in your piggy bank.");
         } else if (choice == 6) {
            System.out.println("Enter the amount you want to take out:");
            double amount = input.nextDouble();
            mySavings.takeMoneyOut(amount);
         } else if (choice == 7) {
            System.out.println("Goodbye.");
            input.close();
         } else {
            System.out.println("Invalid choice.");
         }
      }
   }
}
