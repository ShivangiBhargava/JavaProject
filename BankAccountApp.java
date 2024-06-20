package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("shivi bhargv","123456789",1500);
		
		Savings savacc1 = new Savings("Rich john","987654321",2000);
		
		savacc1.showInfo();
		System.out.println("************************");
		chkacc1.showInfo();
	
		//savacc1.deposit(500);
		//savacc1.withdraw(500);
		//savacc1.transfer("Brokerage", 100);
		//savacc1.compound();
	
		
		// read a csv file then create new accounts based on that data

	}

}
