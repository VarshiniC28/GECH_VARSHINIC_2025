package arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		//2D Array:
		
//		int[][] a = new int [2][5]; // 2 rows - each row has 5 columns
//		a[1][0] = 23; // accessing 2nd rows' first column
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt(); //Taking input from user for no of rows
		
		System.out.println("Enter the number of cols: ");
		int cols = sc.nextInt();
		int [][] a = new int[row][cols];
		
		// To give the input to array:
		System.out.println("Enter the array elements now: ");
		for (int i=0; i<row; i++) {
			for(int j=0; j<cols; j++) {
				System.out.println("Enter the ["+i+"]["+j+"] th element of the array: ");
				a[i][j] = sc.nextInt();
			}
		}
		
		// To print the elements of array:
		System.out.println("Array elements are: ");
		for (int i=0; i<row; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
