package bankaccountapp;

public class Savings extends Account {
	// list properties specific to the Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" +accountNumber;
		//System.out.println("ACCOUNT NUMBER: " +this.accountNumber);
		//System.out.println("NEW SAVINGS ACCOUNT");
		
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		//System.out.println("Implement rate for Savings");
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		
	}
	
	// list any methods specific to savings account
	
	public void showInfo() {
		//System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println(
				" Your Savings Account Features: " +
				"\n Safet Deposit Box ID: " +safetyDepositBoxID+
				"\n Safet Deposit Box Key: " +safetyDepositBoxKey
				);
	}

}
