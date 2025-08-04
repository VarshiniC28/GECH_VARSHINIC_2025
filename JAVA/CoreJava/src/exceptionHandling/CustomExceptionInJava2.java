package exceptionHandling; // declaring the package

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	//2 ways of creating custom getMessage(), if used both overriding and constructor chaining, the message from overriding getMessage will be displayed.
	
//	@Override
//	public String getMessage() {
//		return "Not eligible to vote if age is under 18!!";
//	}
	
	//super(message) calls the parent class (Exception) constructor and stores the message.
	public InvalidAgeException(String message) {  // Constructor of the custom exception class that accepts a message
		super(message); // Call the parent Exception class constructor to store the error message (this enables getMessage())
	}

}


class Age{
	
	int age;
	
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		sc.close();
	} 
	
	void validate() throws InvalidAgeException {
		if(age>=18) {
			System.out.println("vote");
		}
		else {
			throw new InvalidAgeException("Age is below 18!");
		}
	}
}


public class CustomExceptionInJava2 {

	public static void main(String[] args) {

		Age a = new Age();
		try {
			a.acceptInput();
			a.validate();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
