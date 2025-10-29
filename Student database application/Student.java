package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	// using encapsulation so will define private variables
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null ;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000; // static means value or property is not specific to an object but is something that is true for all objects
	// static is more belongs to class and not instance or obj.
	// constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		//System.out.println(firstName +" "+ lastName +" "+ gradeYear +" "+ studentID);
		
	}
	
	// generate an ID
	// will make private bcoz dont want this accessible to outside
	private void setStudentID() {
		// Grade level + ID, "" this argument will make entire to string
		id++;
		this.studentID = gradeYear +""+ id;
		
	}
	
	// enroll in courses
	public void enroll() {
		// get inside a loop, user hits 0 
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses	= courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { 
				//System.out.println("Break!");
				break; }
		} while (1 != 0); // forever
		//System.out.println("ENROLLED IN: " + courses);
		//System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	// view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" +tuitionBalance);
	}
	
	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" +payment);
		viewBalance();
		
	}
	
	// show status // can use showInfo
	// toString is a part of object class or the parent class of this
	public String toString() {
		return "Name: " + firstName  + " " + lastName+
				"\nGrade Level: " +gradeYear +
				"\nStudent ID: " +studentID+
				"\nCourses Enrolled: " +courses +
				"\nBalance: $" +tuitionBalance;
	}
	

}
