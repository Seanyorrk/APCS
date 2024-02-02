package Bank2;


    /**
 * Bank class.
 */

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Bank {
	
	private ArrayList<Account> accounts;
	private int numAccts;
	
		
	/**
	 * constructor
	 * pre: none
	 * post: accounts have been loaded from acctFile.
	 */
	public Bank(File acctsFile) {
		accounts = new ArrayList<Account>();
		Account acct;
		
		/* Create a new file for accounts if one does not exist */
		if (!acctsFile.exists()) {
			try {
				acctsFile.createNewFile();
				System.out.println("There are no existing accounts.");
			} catch (IOException e) {
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
    		numAccts = 0;
    		
    	} else {	/* load existing accounts */
			try {
				FileInputStream in = new FileInputStream(acctsFile);
				ObjectInputStream readAccts = new ObjectInputStream(in);
				numAccts = (int)readAccts.readInt();
				
				if (numAccts == 0) {
					System.out.println("There are no existing accounts.");
				} else {
					
					for (int i = 0; i < numAccts; i++) {
						acct = (Account)readAccts.readObject();
						accounts.add(acct);
					}
				}
				readAccts.close();
			} catch (FileNotFoundException e) {
				System.out.println("File could not be found.");
    			System.err.println("FileNotFoundException: " + e.getMessage());
    		} catch (IOException e) {
				System.out.println("Problem with input/output.");
    			System.err.println("IOException: " + e.getMessage());
    		} catch (ClassNotFoundException e) {
				System.out.println("Class  could not be used to cast object.");
    			System.err.println("ClassNotFoundException: " + e.getMessage());
    		}
    	}
	}


	/** 
	 * Adds a new account to the bank accounts.
	 * pre: none
	 * post: An account has been added to the bank's accounts.
	 */
	public void addAccount() {
		Account newAcct;
		double bal;
		String fName, lName;
		Scanner input = new Scanner(System.in);
		
		System.out.print("First name: ");
		fName = input.nextLine();
		System.out.print("Last name: ");
		lName = input.nextLine();
		System.out.print("Beginning balance: ");
		bal = input.nextDouble();
		
		newAcct = new Account(bal, fName, lName);	//create account object
		accounts.add(newAcct);						//add account to bank accounts
		numAccts += 1;								//increment number of accounts
		
		
		System.out.println("Account created. Account ID is: " + newAcct.getID());
	}

	
	/** 
	 * Deletes an existing account.
	 * pre: none
	 * post: An existing account has been deleted.
	 */
	public void deleteAccount(String acctID) {
		int acctIndex;
		
		
	 	Account acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	
	 	if (acctIndex > -1) {
	 		accounts.remove(acctIndex);					//remove account
	 		System.out.println("Account removed.");
	 		numAccts -= 1;								//decrement number of accounts
	 		
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}
	
	
	/** 
	 * Performs a transaction on an existing account. A transCode of 1 is for deposits 
	 * and a transCode of 2 is for withdrawals.
	 * pre: transCode is 1 or 2.
	 * post: A transaction has occurred for an existing account.
	 */
public void transaction(int transCode, String acctID, double amt) {
    int acctIndex;
    Account acctToMatch, acct;

    acctToMatch = new Account(acctID);
    acctIndex = accounts.indexOf(acctToMatch);        //retrieve location of account
    if (acctIndex > -1) {
        acct = accounts.get(acctIndex);                //retrieve object to modify
        if (transCode == 1) {
            acct.deposit(amt);
            accounts.set(acctIndex, acct);            //replace object with updated object
            System.out.println(acct);
        } else if (transCode == 2) {
            if (acct.getBalance() >= amt) {
                acct.withdrawal(amt);
                accounts.set(acctIndex, acct);        //replace object with updated object
                System.out.println(acct);
            } else {
                System.out.println("Insufficient funds. Cannot withdraw amount.");
            }
        }
    } else {
        System.out.println("Account does not exist.");
    }
}


	/** 
	 * Displays the account information, including the current balance, 
	 * for an existing account.
	 * pre: none
	 * post: Account information, including balance, has been displayed.
	 */
	public void checkBalance(String acctID) {
		int acctIndex;
		Account acctToMatch, acct;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	if (acctIndex > -1) {
	 		acct = accounts.get(acctIndex);				//retrieve object to display
	 		System.out.println(acct);
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}
	
	
	/**
	 * Accounts are written to a file for storage.
	 * pre: none
	 * post: accounts have been written to acctFile.
	 */
	public void updateAccounts(File acctsFile) {
		
		try {
			FileOutputStream out = new FileOutputStream(acctsFile);
			ObjectOutputStream writeAccts = new ObjectOutputStream(out);
			writeAccts.writeInt(numAccts);
			
			for (Account acct : accounts){
				writeAccts.writeObject(acct);
			}
			writeAccts.close();
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) {
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} 
	}
}

