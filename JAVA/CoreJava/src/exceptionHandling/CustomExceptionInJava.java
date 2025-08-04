package exceptionHandling; // declaring the package

import java.util.Scanner; // importing Scanner class for input

// Custom exception class extending Exception
class InvalidInputException extends Exception{ // user-defined exception, no body needed for simple use
	
	//Overriding the getMessag method to make it give us message we want 
	@Override
	public String getMessage() {
		return "Invalid pin!!!!";
	}
}

class Atm{
	int pin = 1234; // correct PIN known by the ATM
	int pCustomer; // PIN entered by the customer
	
	void acceptInput() {
		Scanner sc = new Scanner(System.in); // creating Scanner object
		System.out.print("Enter the PIN: "); // prompt to enter PIN
		pCustomer = sc.nextInt(); // storing entered PIN
	}
	
	void validate() throws Exception{ // this method may throw an exception
		if(pin==pCustomer) { // if entered pin matches ATM pin
			System.out.println("Collect your money"); // successful login
		}
		else { // if pin is incorrect
//			System.out.println("Invalid pin"); // message to user //no need since we create our own getMessage
			InvalidInputException iie = new InvalidInputException(); // create object of custom exception
			System.out.println(iie.getMessage());
			throw iie; // throw the exception to caller
			
			//The above 3 lines can be simplified and written as below
//			throw new InvalidInputException(" ");
		}
	}
}

class Bank {
	void init(){ // method to handle 3 attempts
		Atm a = new Atm(); // create object of ATM
		
		try { // first attempt
			a.acceptInput(); // take PIN input
			a.validate(); // validate it
		}
		catch(Exception e) { // if first attempt fails
			System.out.println("Re-enter the pin"); // prompt again
			try { // second attempt
				a.acceptInput(); // take input again
				a.validate(); // validate again
			}catch(Exception b) { // if second attempt fails
				try { // third attempt
					a.acceptInput(); // take input third time
					a.validate(); // validate third time
				}catch(Exception c) { // if third attempt fails
					System.out.println(c.getMessage());
					System.out.println("CARD IS BLOCKED!!!!!"); // block the card after 3 failed attempts
				}
			}
		}
	}
}

public class CustomExceptionInJava {

	public static void main(String[] args) {

		// Custom Exception in Java:
		// => A Custom Exception is a user-defined exception class in Java.
		
		Bank b = new Bank(); // create Bank object
		b.init(); // call init to start ATM PIN process
	}

}
