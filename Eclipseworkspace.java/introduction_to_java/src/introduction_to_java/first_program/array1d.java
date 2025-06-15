package introduction_to_java.first_program;

import java.util.Scanner;

public class array1d {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int []arr1d = new int[size];
		
		for(int i=0; i<arr1d.length; i++) {
			arr1d[i] = sc.nextInt();
		}
		
		for(int i = size-1; i>=0; i--) {
//			System.out.println(arr1d[i]+"");
			 if (i == 0) {
	                System.out.print(arr1d[i]+" "); // Last element should not have an extra newline
	            } else {
	                System.out.print(arr1d[i]+" "); // Print each number on a new line
	            }
		}
	}

}
