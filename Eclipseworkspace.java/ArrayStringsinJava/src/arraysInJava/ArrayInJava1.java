package arraysInJava;

import java.util.Scanner;

public class ArrayInJava1 {

	public static void main(String[] args) {
		/*
		 * 2D ARRAY:
		 * */
		
		int [][] arr = new int [2][2];
		arr [0][0]= 10;
		arr [0][1]= 20;
		arr [1][0]= 30;
		arr [1][1]= 40;
		
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<2; j++) {
////				System.out.println(arr[i][j]+" "); // it prints continuously in column
//				System.out.print(arr[i][j]+" "); // it prints continuously in a row , so break the rows and coloumns
//			}
//			System.out.println(); // breaks the 1st and 2nd row
			
			//now by taking user input 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of row and coloumn");
			int sizeRow = sc.nextInt();
			int sizeCol = sc.nextInt();
			int [][] array = new int [sizeRow][sizeCol];
			

			System.out.println("Enter the values for array:");
			for(int i=0; i<sizeRow; i++) {
				for(int j=0; j<sizeCol; j++) {
					System.out.println("enter the " + i+ " th rows " +j+"th element: ");
					array[i][j] = sc.nextInt();					
					
				}
			}
				
			System.out.println("array is");
			for(int i=0; i<sizeRow; i++) {
				for(int j=0; j<sizeCol; j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println();
				
		}
			
			//Assignment character input
		System.out.println("Enter the number of rows and columns:");
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        sc.nextLine();

        char[][] Array = new char[Row][Col];

        System.out.println("Enter the characters for the array:");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                System.out.print("Enter character for position [" + i + "][" + j + "]: ");
                Array[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("Character array is:");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(); 
        }

			
			
	}
}


