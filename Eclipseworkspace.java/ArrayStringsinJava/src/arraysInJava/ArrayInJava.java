package arraysInJava;

import java.util.Scanner;

public class ArrayInJava {

	public static void main(String[] args) {
		/*
		 * Arrays in JAVA: If we want to store a multiple value of the same datatypewe use array
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
		
		System.out.println("Array in Java");
		int[] arr = new int[5];
//		arr[0]=30;
//		arr[1]=20;
//		arr[2]=40;
//		arr[3]=35;
//		arr[4]=36;
		//arr[5] =100; => array index out of bound exception
		
		for(int i=0; i<=4; i++) {
			arr[i] =10;
		}
		System.out.println(arr);
		
		for(var i:  arr) {
			System.out.println(i+" ");
		}
		//assignment
		/*write a program to take the user input values and store inside array and just print it*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int [] array = new int[size];
		
		System.out.println("Enter the values for array:");
		for(int i=0; i<array.length; i++) {
			System.out.println("Enter" +i+ "th element:");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are: ");
		for(int j=0; j<array.length; j++) {
			System.out.println(array[j]+" ");
		}sc.close();
		
		/*write a program to take the user input char values and store inside array and just print it*/
		}

}
