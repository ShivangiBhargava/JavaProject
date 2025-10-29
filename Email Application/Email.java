package emailapp;

import java.util.Scanner;

public class Email {
	// since using encapsulation we dont want people to access outside we will use
	// private and access using class api
	// variable setup
	private String firstName; // instead of defining variable out, defining through 'this'api
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail; // instead of defining or interacting with this properties directly, will do through getter, setter method that's called encapsulation.
	private int defaultPasswordLength = 10;
	private String companySuffix = "company.com";

	// constructor to receive the first name and last name
	// public ClassName(parameters){this.classVariable = localVariable}
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		// call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);

		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// combine elements to generate email
		email = firstName.toLowerCase() +"." + lastName.toLowerCase() +"@" + department +"." +companySuffix;
		//System.out.println("Your email is: " +email);
	}

	// ask for the department
	// private return_type methodName() { asking for the department }
	private String setDepartment() {
		//System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
		System.out.println("New worker: " +firstName+ ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");

		// to read objects/ to get user input from console
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1){ return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "acct"; }
		else { return ""; }
	}
       // generate a random password
		// have length so if requirement changes we can change
       private String randomPassword(int length) {
    	   // look at this array & find value at any given random number
    	   String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    	   // array of characters = new sequence of characters of the size of length
    	   // syntax - data_type[] array_name = new data_typpe[];
    	   char[] password = new char[length];
    	   // iterate through value of the length
    	   for(int i=0; i<length; i++) {
    		   // random method generate value b/w 0 & 1 then caste into int and then multiply by length
    		   int ran = (int) (Math.random() * passwordSet.length());
    		   // using array password at the position i
    		   password[i] = passwordSet.charAt(ran);
    	   }
    	   return new String(password);
    			
       }
       // set the mailbox capacity
       // it's encapsulation, we're making this public so we can set some properties and hiding actual properties
       public void setMailboxCapacity(int capacity) {
    	   this.mailboxCapacity = capacity;
       }
       
       // set the alternate email
       public void setAlternateEmail(String altEmail) {
    	   this.alternateEmail = altEmail;
       }
       
       // change the password
       public void changePassword(String password) {
    	   this.password = password;
       }
 // setting is defining properties, getting is actually retrieving them
       // implementing get methods
       public int getMailboxCapacity() { return mailboxCapacity; }
       public String getAlternateEmail() { return alternateEmail; }
       public String getPassword() { return password; }
       
       public String showInfo() {
    	   return "DISPLAY NAME: " + firstName + " " + lastName +
    			   "\nCOMPANY EMAIL: " + email +
    			   "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
       }
	}
