package introduction_to_java.first_program;

import java.util.Scanner;

public class UserInputValues {

	public static void main(String[] args) {
		int stdage = 0;
		System.out.println("Enter the student age:");
		Scanner sc = new Scanner(System.in);
		stdage = sc.nextInt();
		System.out.println("The age of the student is:" +stdage);
		
		//to scan for different datatypes:
		/*
		 * byte = nextByte();
		 * short = nextShort();
		 * int = nextInt();
		 * float = nextFloat();
		 * double = nextDouble();
		 * Boolean = nextBoolean*/
		
		sc.nextLine(); // called a buffering to avoid a error
		// character
		//shows error even when we enter after entering age because enter is also a character so to add buffering we add sc.nextLine(); above her
		System.out.println("Enter the student name:");
		char stdname = sc.nextLine().charAt(0);
		//can also give as sc.next().charAt(0);
		System.out.println("The name of the student is:"+stdname);
	}

}
