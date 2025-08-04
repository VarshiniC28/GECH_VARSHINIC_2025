package exceptionHandling;
import java.util.*;

class E21{
	
	void fun1() throws Exception{ //this warns the main method that i am re-throwing the exception handle it
		System.out.println("Connection established");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator: ");
			int a = sc.nextInt();
			
			System.out.println("Enter the denominator: ");
			int b = sc.nextInt();
			
			int c = a/b; //from here only the control goes to fun2 hence there will be no connection terminated4
			System.out.println(c); 

		}
		catch(Exception e) { //caught the object with exception
			System.out.println(e.getMessage());
			throw e; //then this is re-throwing the object of exception to main stack frame where this fun1 was called and this main method is unaware of it so it exception will not be handled , so this method should give the warning when fun1 is declared using throws as above
		}
		//System.out.println("Connection terminated2"); //not executed as the exception object is thrown before the control comes to this line, so to make it execute no matter what we use finally block with finally keyword
		finally{
			System.out.println("Connection terminated2");
		}
	}
}


public class DiffWaysOfHandlingException2Rethrowing {

	public static void main(String[] args) {
		
		//First RTS goes to fun1 in class E11 then checks for try catch in main method.
		System.out.println("Connection established");
		E21 e = new E21();
		try { //handling the re-thrown exception 
			e.fun1();
		}catch(Exception ex) {
			System.out.println(ex.getMessage()+ " Handled");
		}
		System.out.println("Connection Terminated1");
	}

}
