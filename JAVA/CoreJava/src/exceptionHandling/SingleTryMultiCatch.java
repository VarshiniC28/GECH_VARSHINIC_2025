package exceptionHandling;

import java.util.Scanner;

public class SingleTryMultiCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Connection established.");
		
		try {
			System.out.print("Enter the size of the array: ");
			int size = sc.nextInt(); //-3 - NegativeArraySizeException
			int [] arr = new int[size];
			
			System.out.println("Enter the data: ");
			int data = sc.nextInt(); //Varsha - InputMismatchException
			
			System.out.println("Enter the index where data shouldbe inserted : ");
		 	int index = sc.nextInt();
		 	
		 	arr[index] = data; //Lets say we give index 7 which is out of bound - ArrayIndexOutOfBoundsException
		 	System.out.println(arr[index]);
		 	
		 	for(int i=0; i<arr.length; i++) {
		 		System.out.print(arr[i]+" ");
		 	}
		 	
		}
		catch(Exception e){
		 	
		 	System.out.println("Some problem."); // generated message by us
		 	System.out.println(e.getMessage()); //message of exact problem
		}
		System.out.println("Connection terminated");
	}

}
