package inbuiltClasses;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the integer a:");
		int a = scan.nextInt();
		
		System.out.println("Enter the integer b: ");
		float b = scan.nextFloat();
		
		System.out.println(a + b);// Prints the sum as float (int + float → result is float)
	}

}
