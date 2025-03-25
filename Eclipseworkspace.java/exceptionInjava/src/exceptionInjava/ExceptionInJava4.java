package exceptionInjava;

public class ExceptionInJava4 {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid Age"); //to throw exception by default 
		}else {
			System.out.println("Your age is: "+age);
		}
	}

	public static void main(String[] args) {
		/*
		 * finaly block:
		 * => This will execute even if the exception occurs or not
		 * => Where we have to write the closing code like db connection, file close
		 * */

//		try {
//			System.out.println(10/0);
//		}finally {
//			System.out.println("This is finally block");
//		}
		
//		try {
//			System.out.println(10/10);//even if theres no exception here since 10/10 = 1 finally block that is after catch block is executing
//		} catch (Exception e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("This is finally block 2");
//		}
		
		/*
		 * throw :
		 * =>It is used to throw exception.
		 * -can be done by defo=ault in method
		 * - in class
		 * */
		
		try {
			validate(1);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
