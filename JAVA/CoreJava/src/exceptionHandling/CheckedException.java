package exceptionHandling;

import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		
		//Types of exception:
		//1. Checked : compile time , why: called method is ducking an exception.
		//2. Unchecked : run time , why : faulty input 
		
		//------------------Checked---------------------------------

		for(int i=65; i<=69; i++) {
			System.out.println((char)i); //prints A B C D E
			
			//This below will cause checked exception
			//Thread.sleep(3000); //Class Thread has static sleep ( long milliseconds) method which throws exception , or which is ducking an exception.
			
			try {
				
//				Thread.sleep(3000); //Class Thread has static sleep ( long milliseconds) method which throws exception , or which is ducking an exception.
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		//----------------------Unchecked-----------------------------------
		
		Scanner sc= new Scanner(System.in);
		System.out.println(sc.nextInt()/sc.nextInt()); //lets say we give 0 in denominator which will be given during run time, which will cause run time/unchecked exception
		
		
		//----------------------------------------------------------------------------
		
//		Scanner sc= new Scanner(System.in);
		System.out.println(sc.nextFloat()/sc.nextFloat());  //100.0/0.0 will not give ArithmeticException , but here it gives Infinity
		
	}

}
