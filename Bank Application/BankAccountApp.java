package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		/*This was just for unit testing
		 * 
		Checking chkacc1 = new Checking("shivi bhargv","123456789",1500);
		Savings savacc1 = new Savings("Rich john","987654321",2000);
		savacc1.showInfo();
		System.out.println("************************");
		chkacc1.showInfo();
		//savacc1.deposit(500);
		//savacc1.withdraw(500);
		//savacc1.transfer("Brokerage", 100);
		//savacc1.compound();
	*/
		
		// read a csv file then create new accounts based on that data
		String file = "C:\\NewBankAccounts.csv";

		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			//System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType  = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			// System.out.println(name+" "+sSN+" "+accountType+" $"+initDeposit);
			if(accountType.equals("Savings")) {
				//System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				//System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		//accounts.get(5).showInfo();
		for(Account acc : accounts) {
			System.out.println("\n***************");
			acc.showInfo();
		}
		//can do any kind of operations with data structures
		 //accounts.get((int) Math.random() * accounts.size()).deposit(10000);
	}

}
