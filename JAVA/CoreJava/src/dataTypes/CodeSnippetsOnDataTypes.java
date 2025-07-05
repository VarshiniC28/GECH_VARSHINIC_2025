package dataTypes;

public class CodeSnippetsOnDataTypes {
	public static void main(String[] args) {
		
		System.out.println("---------------------Interview ques - Code Snippets on data types----------------------");
		
		System.out.println("1)");
		byte k = 127;
		k++;
		System.out.println(k); // -128
		
		System.out.println("------------------------------");
		
		System.out.println("2)");
		byte h = 1;
		byte i = 1;
		//byte n = h+i; // will show error instead of n having 2 
		//System.out.println(n);
		
		//byte + byte → int
		//Type mismatch: cannot convert from int to byte

		//must explicitly cast the result to byte like this:
		byte n = (byte)(h + i); // now compiles
		System.out.println(n); // prints 2

	}
}
