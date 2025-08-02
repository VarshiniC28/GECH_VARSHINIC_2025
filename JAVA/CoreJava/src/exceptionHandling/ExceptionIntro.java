package exceptionHandling;
import java.util.*;

public class ExceptionIntro {

	public static void main(String[] args) {

		//Exceptions occur during the execution time and compilation/syntax error occur during compiling , that is as we write the code as Java compiles as we write the code.
		//An Exception is an abnormal condition or event that disrupts the normal flow of a program when user gives faulty input.

//		System.out.println(10/3); //3
		
		//If we give denominator as 0 it raises exception during Execution time. - ArithmeticException 
		//When there is try catch block it means there is User defined Exception Handling
		System.out.println("Connection Established");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator: ");
			int a = sc.nextInt();
			
			System.out.println("Enter the denominator: ");
			int b = sc.nextInt();
			
			int c = a/b;
			System.out.println(c); 
		}
		catch(Exception e){ //executes only when there is exception.
			System.out.println("Enter no zero denominator");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Connection terminated");
		
		
		
	}

}
