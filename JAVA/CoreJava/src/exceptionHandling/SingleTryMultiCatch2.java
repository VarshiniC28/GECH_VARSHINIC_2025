package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class SingleTryMultiCatch2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Connection established.");
		
		try {
			System.out.println("Enter the numerator: ");
			int a = sc.nextInt();
			
			System.out.println("Enter the denominator: ");
			int b = sc.nextInt();
			
			int c = a/b; //Here a Arithmetic Exception object is created which is a instance of inbuilt-class ArithmeticException from java.lang package which is caught by the catch block with reference a of type ArithmeticException a = (New ArithmeticException();(invisible) - for all exception the same happens.
			System.out.println(c); 
			
			System.out.print("Enter the size of the array: ");
			int size = sc.nextInt(); //-3 - NegativeArraySizeException
			int [] arr = new int[size];
			
			System.out.println("Enter the data: ");
			int data = sc.nextInt(); //Varsha - InputMismatchException
			
			System.out.println("Enter the index where data shouldbe inserted : ");
		 	int index = sc.nextInt();
		 	
		 	arr = null; //- NullPointerException
		 	
		 	arr[index] = data; //Lets say we give index 7 which is out of bound - ArrayIndexOutOfBoundsException
		 	System.out.println(arr[index]);
		 	
		 	for(int i=0; i<arr.length; i++) {
		 		System.out.print(arr[i]+" ");
		 	}
		 	
		}
		//if we give generic exception as the first catch block then others it will lead to error since other Exceptions will become unreachable code.
//		catch(Exception e) { //generic exception
//			System.out.println(e.getMessage()); 
//		} 
		catch(ArithmeticException a){ //ArithmetcException Object is caught and passed to the reference of the type inbuilt class ArithmeticException
		 	System.out.println("Give non zero denominator");
		}
		catch(NegativeArraySizeException n) {
			System.out.println("Be positive");
		}
		catch(InputMismatchException i) {
			System.out.println("Give integer input.");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());
			System.out.println("Be in length");
		}
		catch(Exception e) { //generic exception
			System.out.println(e.getMessage());
		} //if we give generic exception as the first catch block then others it will lead to error since other Exceptions will become unreachable code.
		
		System.out.println("Connection is terminated");
	}

}
