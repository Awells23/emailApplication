package EmailApp;

import java.util.Scanner;

public class email {

	private String firstName;
	private String lastName;
	private String password; 
	private String department; 
	private String email; 
	private int mailboxCapacity = 500; 
	private int defaultPasswordLength = 10;
	private String suffix = "anycompany.com"; 
	private String alternateEmail; 
	
	//Constructor to recieve the first name and last name
	public email(String firstName, String lastName) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		System.out.print("Email created " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department
		this.department = setDepartment();
		System.out.println("Department: " + department);
		
		//Call a method that returns a random password 
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + suffix; 
		System.out.print("Your email is " + email); 
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("\nEnter department code: \n1 for Sales \n2 for Development \n3 for Accounting \n4 for none ");
		Scanner kb = new Scanner(System.in);
		int depnum = kb.nextInt();
		if(depnum ==1) { return "Sales";}
		else if (depnum==2) {return "Development";}
		else if (depnum==3) {return "Accounting";}
		else {return "";} 
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char[] password = new char[length]; 
		for(int i = 1; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand); 
		}
		return new String(password); 
	}
	
	//Set the mailbox capacity 
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = mailboxCapacity; 
	}
	
	//Set the alternate email
	public void setAlternateEmail(String alt) {
		this.alternateEmail = alt; 
	}
	
	//Change the password 
	public void changePassword(String password) {
		this.password = password; 
	}
	
	//get Mailbox capacity 
	public int getCapacity() {
		return mailboxCapacity; 
	}
	
	public String getAlternateEmail() {
		return alternateEmail; 
	}
	
	public String getPassword() {
		return password; 
	}
	public String showContents() {
		return "\nDisplay Name: " + firstName + " " + lastName + 
			   "\nCompany email: " + email + 
			   "\nMailbox capacity: " + mailboxCapacity + "mb"; 
	}
}
