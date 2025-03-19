package introduction_to_java.first_program;

import java.util.Scanner;

public class NonPrimitive {

	public static void main(String[] args) {
		//2. Non Primitive:
		
		/*1. array:
		 * <datatype>[] arrayanme = {};
		 * 
		 * 2. String:
		 * String name = "";*/
		
		int[] array1 = {1,2,3,4,5};
		System.out.println(array1[2]);
		
//		String name = "VARSHINI C";
//		System.out.println(name);
		
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println("Name is:"+name);
		
		Scanner sc= new Scanner(System.in);
//		String name =sc.next(); // used when we want to write only one line as it takes only one word
//		System.out.println(name);
//		sc.nextLine();
//		String nme=  sc.nextLine(); // in this it takes complete line
//		System.out.println(nme);
		
		// same goes with print and println
//		System.out.println("Hello World");
//		System.out.print("Hello");
//		System.out.print("World");
		
		//================================================
		//REVISION:
		
		System.out.println("Enter Student Name: ");
		String StdName = sc.nextLine();
		
		System.out.println("Enter Student's age: ");
		byte StdAge = sc.nextByte();
		
		System.out.println("Enter Student's marks: ");
		double Stdmarks = sc.nextDouble();
		
		System.out.println("Enter Student's Gender: ");
		char StdGen = sc.next().charAt(0);
		
		sc.nextLine();
		System.out.println("Enter Student branch");
		String branch = sc.nextLine();
		
		System.out.println("Enter Student adress");
		String adress = sc.nextLine();
		
		System.out.println("NAME: \n" +StdName);
		System.out.println("AGE: " +StdAge);
		System.out.println("MARKS: " +Stdmarks);
		System.out.println("GENDER: " +StdGen);
		System.out.println("BRANCH: " +branch);
		System.out.println("ADRESS: " +adress);
	}

}
