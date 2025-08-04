package exceptionHandling;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {

		//The way to Give Scanner is 
		
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			scan.nextInt();
		}
		finally {
			scan.close();
		}

		
	}

}
