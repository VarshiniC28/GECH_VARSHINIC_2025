package arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		/*
		 * Arrays in JAVA: If we want to store a multiple value of the same data type we use array
		 * 
		 * How to declare the array:
		 * <datatype> [] array_name= new <datatype>[size];
		 * int [] array1 = new int[4];
		 * =====================
		 * 
		 * How to declare and initialize the array:
		 * int [] arr = {1,2,3,4,5};
		 *========================
		 *
		 * TYPES:
		 * 
		 * 1. 1D -> single row.
		 * int [] array1 = new int[4];
		 * 
		 * 2. 2D -> in the form of table.
		 * int [][] array1 = new int[4][3]; --> 4*3-->12
		 * */
		
		int[] a = new int[5]; //now for this object created in heap has 5 partitions and will by default give 0 before initializing this with variable.
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
		a[3] = 6;
		a[4] = 7;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of 0th person:");
		a[0] = sc.nextInt();
		
		//a.length - length of the array
		for (int i=0; i<a.length; i++) {
			System.out.println("Enter " +i+1 +" th " +"students age: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("The age of students are: ");
		for(int i: a) {
			System.out.print(a[i]+ " ");
		}
		
	}
	
	

}
