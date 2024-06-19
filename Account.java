// account is parent or super class  for sharing common properties of savings and checking
package bankaccountapp;

public abstract class Account implements IBaseRate {
	// list common properties for savings and checking accounts
	
	// constructor to set base properties and initialize the account
	public Account(String name) {
		System.out.println("NAME: "+name);
		System.out.print("NEW ACCOUNT ");
	}
	
	// list common methods

}
