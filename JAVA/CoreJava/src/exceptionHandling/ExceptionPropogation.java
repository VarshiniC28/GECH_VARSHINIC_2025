package exceptionHandling;
import java.util.*;

class E1{
	
	void fun1() {
		System.out.println("Connection established");
//		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator: ");
			int a = sc.nextInt();
			
			System.out.println("Enter the denominator: ");
			int b = sc.nextInt();
			
			int c = a/b; //from here only the control goes to fun2 hence there will be no connection terminated4
			System.out.println(c); 
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println("Connection terminated4");
	}
}

class E2{
	
	void fun2() {
		System.out.println("Connection established");
		try {
			E1 e = new E1();
			e.fun1();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Connection terminated3  ");
	}
}

class E3{
	
	void fun3() {
		System.out.println("Connection established");
		E2 e = new E2();
		e.fun2();
		System.out.println("Connection terminated2");
	}
}

public class ExceptionPropogation {

	public static void main(String[] args) {
		
		//Stack tracing happens and RTS checks for tryCatcj in fun1 then fun2 then fun3 then main method, if even main method doesnt have the UDEH it gives to UDH
		
		System.out.println("Connection established");
		E3 e = new E3();
		e.fun3();
		System.out.println("Connection Terminated1");
	}

}
