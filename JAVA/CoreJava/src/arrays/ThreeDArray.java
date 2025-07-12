package arrays;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {

		//3D Array:
		
		//For eg : consider the following situation:
		// Create an array to store the ages of students belonging to 2 schools having 3 classrooms with 5 students each.
//		int [][][] a = new int[2][3][5];
		// 2 blocks - has 3 rows with each row having 5 cols.
		
//		a[1][0][2] = 21; //To access the 2nd block 1st row and 3rd col
//		a[0][0][2] = 21; //To access the 1st block 1st row's 2rd col
		
		// Create an array to store the ages of students belonging to 2 schools having 3 classrooms with 5 students each.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of schools: ");
		int block = sc.nextInt();
		
		System.out.println("Enter the number of classes: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of schools: ");
		int cols = sc.nextInt();
		
		int [][][] a = new int[block][rows][cols];
		
		System.out.println();
		
		//Take input of students from block 0 and class 0
		System.out.println("Enter the elements of array: ");
		System.out.println();
		
		for(int i=0; i<block; i++) {
			for(int j=0; j<rows; j++) {
				for(int k=0; k<cols; k++) {
					System.out.println("Enter the Student " +(k+1)+"'s age from class "+(j+1)+" of school " + (i+1)+": ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		//Print the elements of array
		System.out.println("The elements of array are: ");
		for(int i=0; i<block; i++) {
			for(int j=0; j<rows; j++) {
				for(int k=0; k<cols; k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
