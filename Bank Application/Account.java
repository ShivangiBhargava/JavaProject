// account is parent or super class  for sharing common properties of savings and checking
package bankaccountapp;

public abstract class Account implements IBaseRate {
	// list common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	// making protected so that can be accessible in inherited classes
	protected String accountNumber;
	protected double rate;
	
	// constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
	// instead of writing in both checking and savings we can manage with 1 account class 
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		//System.out.println("Name: "+name+ " SSN: "+sSN+ " Balance: $" +balance);
		
		// set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	// we dont want to access it from outside so putting separate from constructor in private method
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		//random() geneartes b/w 0 and 1 * 1000 then cast into int
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" +accruedInterest);
		printBalance();
	}
	
	// list common methods - transactions
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" +amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" +amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" +amount+ " to " +toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now: $" +balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " +name+
				"\nACCOUNT NUMBER: " +accountNumber+
				"\nBALANCE: " +balance+
				"\nRate: " +rate+ "%"
				);
	}

}
