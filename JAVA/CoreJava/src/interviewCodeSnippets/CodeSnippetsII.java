package interviewCodeSnippets;

public class CodeSnippetsII {

	public static void main(String[] args) {
		
		
//		1)
		byte b = 127;     // Max value byte can hold is 127
		b++;//-128              // Overflow: wraps around to -128
		b++;//-127              // Increments to -127
		System.out.println(b); // -127 → because of byte overflow
		
//		2)
		byte a = 1;
		byte c = 1;
		byte d = (byte)(a + c);  // a + c → promoted to int, so we cast back to byte
		System.out.println(d);   // 2 → valid output after casting otherwise error without casting

		// Whenever we do mathematical operations on the integer datatypes byte, short , int , long will always give int, as above

//		3)
		int g = 25;
		int h =2;
		int i = g/h;
		System.out.println(i); //Since whenever we do mathematical operation on integer types returns int, even if it is 12.5 as it shoul be int it will print 12
//		And this is called truncation. 12 → result is int (25/2 = 12.5 but decimal part is truncated)
//		Truncation means cutting off the decimal part of a number without rounding.

//		4)
		int n = 25;
		int m = 2;
		float o = n / m;  // int / int = 12 → assigned to float → o = 12.0
		// No casting needed: Java does implicit casting from int to float (widening)
		System.out.println(o);  // 12.0 → decimal but no fraction as int division happened first

		
//		5)
		double y = 128;
		byte v = (byte)y;   // Explicit cast: 128 is out of byte range (-128 to 127), so wraps to -128
		System.out.println(v); // -128 → because of overflow during narrowing conversion

		//byte range: -128 to 127
		// since its our of range by 1 it will come to -128 if its 2 out of range it would have been -127
//		Casting 128 to byte causes overflow:
//		128 - 256 = -128  → wraps around
		
		double f=129;
		byte u = (byte)f;
		System.out.println(u); //-127  //byte out of range by 2 so it goes to -127 next to -128
	}
}
