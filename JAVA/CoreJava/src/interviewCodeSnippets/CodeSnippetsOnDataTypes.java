package interviewCodeSnippets;

public class CodeSnippetsOnDataTypes {
	public static void main(String[] args) {
		
		System.out.println("---------------------Interview ques - Code Snippets on data types----------------------");
		
		System.out.println("1)");
		byte k = 127;
		k++;
		System.out.println(k); // -128
		
		
		System.out.println("2)------------------------------");
		byte h = 1;
		byte i = 1;
		//byte n = h+i; // will show error instead of n having 2 
		//System.out.println(n);
		//byte + byte → int
		//Type mismatch: cannot convert from int to byte
		//must explicitly cast the result to byte like this:
		byte n = (byte)(h + i); // now compiles
		System.out.println(n); // prints 2
		
		
		System.out.println("3)---------------------------------------");
		//what will be the output of the below
		int a = 045; // Octal literal (base 8), 045 = 4×8 + 5 = 37 in decimal
		System.out.println(a); // Prints 37 (Octal 045 converted to decimal)
		int b = 055; 
		System.out.println("b"); // 5x8 + 5= 45
		// ANother method refer notes 

		
		System.out.println("4)---------------------------------------");
		int c = 0x45; // Hexadecimal literal (base 16), 0x45 = (4×16) + 5 = 69 in decimal
		System.out.println(c); // Prints 69 (Java auto-converts hex to decimal)
		
		
		
		System.out.println("5)---------------------------------------");
		int d = 0b00000010; // Binary literal (base 2), 0b00000010 = 2 in decimal
		System.out.println(d); // Prints 2 (Java auto-converts binary to decimal)
		
		
		
		System.out.println("6)---------------------------------------");
//		int e = 078; // ❌ Error: 078 is invalid because 8 is not allowed in octal (base 8 uses digits 0–7 only)
//		System.out.println(e); // Compilation error (invalid octal literal)



	}
}
