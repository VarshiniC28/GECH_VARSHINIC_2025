package exceptionHandling;
import java.util.*;

class E11{
	
	void fun1() {
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
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Connection terminated2");
	}
}


public class DiffWaysOfHandlingException1 {

	public static void main(String[] args) {
		
		//First RTS goes to fun1 in class E11 then checks for try catch in main method.
		System.out.println("Connection established");
		E11 e = new E11();
		e.fun1();
		System.out.println("Connection Terminated1");
	}

}
