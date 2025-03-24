package exceptionInjava;

public class ExceptionInJava2 {
	/*
	 * Unchecked Exception(run time)
	 * */
	
	public static void main(String[] args) {
		int a = 10;
		int b=0;
		//System.out.println("Result: "+a/b);//
		//this throws ArithmeticException since we cant ivide a number by 0 
		//So we use try and catch
		try {
			System.out.println("Result: "+a/b);
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage()); //gives the exception in message format 
			e.printStackTrace(); // another is ito print exception in the format of error as it
		}
		System.out.println("Hello World");
	}
}
