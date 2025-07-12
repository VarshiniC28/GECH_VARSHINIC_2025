package arrays;

import java.util.Scanner;

public class JaggedArrayExercise1 {

	public static void main(String[] args) {
		
		//Create an array to store the ages of students belonging to 2 classrooms where first classroom has 3 students 
		//and second classroom has 5 students.
		  Scanner sc = new Scanner(System.in);

	        // Ask for number of classrooms
	        System.out.print("Enter number of classrooms: ");
	        int rows = sc.nextInt();

	        int[][] arr = new int[rows][]; // jagged array

	        // For each classroom, ask number of students and initialize sub-array
	        for (int i = 0; i < rows; i++) {
	            System.out.print("Enter number of students in Classroom " + (i + 1) + ": ");
	            int cols = sc.nextInt();
	            arr[i] = new int[cols];

	            // Input student ages
	            System.out.println("Enter ages for Classroom " + (i + 1) + ":");
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Student " + (j + 1) + ": ");
	                arr[i][j] = sc.nextInt();
	            }
	        }

	        // Print the array
	        System.out.println("\nAges of Students:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print("Classroom " + (i + 1) + ": ");
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	}

}
