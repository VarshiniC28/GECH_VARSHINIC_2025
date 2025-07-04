package patternProgramming;

import java.util.Scanner;


public class nxnPattern {
	
	static void squarePattern(int n) {
		for(int j=1; j<=n; j++) {
			for(int i=1;i<=n;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		squarePattern(n);
		System.out.println();
//		sc.close();
	}
}
