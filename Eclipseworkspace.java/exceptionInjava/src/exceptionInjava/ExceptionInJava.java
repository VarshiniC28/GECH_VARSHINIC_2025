package exceptionInjava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionInJava {

	// recursion.- function calling itslef as below
	public static void Display() {
		Display();
	}

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Exception in Java: =>When there is a unwanted or un-expected event occur in
		 * the program. =>Whenever there is execption the normal flow will stop. 
		 * 1. IOExecption 
		 * 2. FileNotFoundException - When the file we are trying to write
		 * or print doesnt exist to avoid the error we create a execption that creates
		 * andthan write the content as we give 
		 * 3. Exception - parent of all exception
		 * 
		 * 2 TYPES: 1. checked exception(compile time) - FileNotFoundException(2 ways)
		 * 2. unchecked exception(run time) - arrayIndexOutOfBound Exception(1 way)
		 */

		/*
		 * ERROR: => Its a problem where the programmer cant handle it EX:
		 * 
		 */

		// ERROR:
//		ExceptionInJava.Display();

//		results in StackOverflowError - as function is calling by itself

		// checked execption
		// 1.try catch
		// 2. throws

//		PrintWriter  -  A class in java 
		//2. throws
		PrintWriter printWriter = new PrintWriter("abc.txt");
		printWriter.println("Hello WORLD");
		System.out.println("Varsha");
		printWriter.close();		
		
		//1. try and catch
//		try {
//			printWriter = new PrintWriter("abc.txt");
//			printWriter.println("Hello World");
//			System.out.println("Hello World");
//			printWriter.close();
//		} catch (FileNotFoundException e) {
////		} catch(IOException e) {
////		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

	}

}
