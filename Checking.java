package bankaccountapp;

public class Checking extends Account {
	// list properties specific to a Checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	// constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" +accountNumber;
		//System.out.println("ACCOUNT NUMBER: " +this.accountNumber);
		//System.out.println("NEW CHECKING ACCOUNT");
		
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	//	System.out.println("Implement rate for Checking");
	}
	
	// list any methods specific to checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		// using super showInfo so that it wont override that
		super.showInfo();
		System.out.println(" Your Checking Account Features: " +
				"\n Debit Card Number: " +debitCardNumber+
				"\n Debit Card PIN: " +debitCardPIN
				);
	}
	

}
