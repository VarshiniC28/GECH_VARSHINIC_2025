package patternProgramming;

import java.util.Scanner;

public class FirstPattern {

	public static void main(String[] args) {
		
//		***** - prints in row
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}

//		Prints in column i.e in next line
		for(int i=1; i<=5; i++) {
			System.out.println("*");
		}
		
//		5x5 * 
		for(int i=1; i<=5; i++) {
			System.out.println("*****");
		}
		
//		5x5 * using nested for loop
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		n*n * pattern
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
