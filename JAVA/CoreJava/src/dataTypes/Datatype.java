package dataTypes;

public class Datatype {

	public static void main(String[] args) {
		
		byte c; // 1 byte = 8 bits
		short d; // 2 bytes = 16 bits
		int e; // 4 bytes = 32 bits
		long f; // 8 bytes = 64 bits
//		----------------------------------------------------------------------
		
		float a = 45.5f; // 4 bytes = 32 bits --> Single precision
		//If suffix f is not added, by default java will consider it as a double value
		//or
		float b = (float)45.5;
		// otherwise if we try to assign float s = 45.5; it will show error as java thinks it as double
		//---------------------------------------------------------------------------
		
		double g ; // 8 bytes = 64 bits -->Double precision
		//---------------------------------------------------------------------------
		
		char ch = 'A'; // 2 bytes = 16 bits
//		-> Character type data represents characters such as letters, digits, and symbols.
		//---------------------------------------------------------------------------
		
		boolean v = true; //1 // 1 byte = 8 bits
		boolean j = false; //0
		//---------------------------------------------------------------------------
		
//		DATA TYPES: Its a converter that converts real world data into binary form i.e 0's & 1's
//		-> data is converted into binary using base-2 format if its +ve (MSB will be 0)
//		And base-2 format + 2's complement if data is -ve ( MSB will be 1)
//
//		There are 8 data types:
//		==> 1 byte = 8 bits
//		==> short = 2 bytes = 16 bits
//		==> int = 4 bytes = 32 bits
//		==> long = 8 bytes = 64 bits
//		==> float = 4 bytes = 32 bits
//		==> double = 8 bytes = 64 bits
//		==> char = 2 bytes = 16 bits
//		==> boolean = 1 byte = 8 bits

		// To find range of each datatype : N bits = (-2 power n-1) to (+2 power n-1)+1
		
		//RANGE:
		// byte:    -128 to 127
		// short:   -32,768 to 32,767
		// int:     -2,147,483,648 to 2,147,483,647
		// long:    -2^63 to 2^63 - 1
		// float:   ±3.4 x 10^38 (Single Precision)
		// double:  ±1.7 x 10^308 (Double Precision)
		// char:    0 to 65,535 (Unsigned, Unicode)
		// boolean: true or false (stored as 1 byte)

		}

}
