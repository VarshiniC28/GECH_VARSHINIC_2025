package typeCasting;

public class Implicit {

	public static void main(String[] args) {
		
//		Implicit :
		
		byte a = 45;
		double b;
		b = a; //right to left assignment always, assigning a to b,, not b to a;
		System.out.println(a); //45
		System.out.println(b); //45.0 -> since its double
		
		char d = 'A';          // 'A' has ASCII/Unicode value 65
		int e;                 
		e = d;                 // Implicit widening from char to int
		System.out.println(d); // Prints A (char)
		System.out.println(e); // Prints 65 (int value of 'A')

		char x = '0';           // '0' is a character, not the number zero
		int y = x;              // Implicit widening: '0' → 48 (ASCII/Unicode value)
		System.out.println(x);  // Prints 0 (the character)
		System.out.println(y);  // Prints 48 (its Unicode integer value)
		
		// '9' -> 57
		
		char o = '0';
		int O = o;
		System.out.println(O); //48
		System.out.println(o); //0

	}
}
