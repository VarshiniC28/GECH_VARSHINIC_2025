package typecastingInjava;

public class TypeCastingJava {

	public static void main(String[] args) {
		/*TYPE CASTING:
		 * => Conversion of one data type to another.
		 * 
		 * 2 Types of type Casting:
		 * 
		 * 1. Implicit type casting: Lowest to height(type casting does in the below order).
		 * byte -> short -> int -> long -> float -> double.
		 * 
		 * 2. Explicit Type Casting:: Heighest to lowest
		 * double -> float -> long -> int -> short -> byte.
		 * */
		
		//1. IMPLICIT TYPE CASTING:
		
		//int to long : a is being converted from int to long
		int a =10;
		long a2 = a;
		
		System.out.println("Int: "+a);
		System.out.println("Long: "+a2);
		
		byte x = 20;
		short y = x;
		System.out.println("byte: "+x);
		System.out.println("short: "+y);
		
		//2. EXPLICIT TYPE CASTING:
		
		//not possible in tgis manner 
//		long a3 = 10;
//		int a4 = a3
		
		
		long a3 = 10;
		int a4 = (int)a3;
		
		System.out.println("Int: "+a3);
		System.out.println("Long: "+a4);
		
		long a31 = (int)30;
		System.out.println(a31);
	}

}
