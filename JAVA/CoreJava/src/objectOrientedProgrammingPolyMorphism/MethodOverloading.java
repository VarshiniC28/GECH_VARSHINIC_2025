package objectOrientedProgrammingPolyMorphism;

class Demo{
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, float c) {
		System.out.println(a+b+c);
	}
	
	void add(int a, float b) {
		System.out.println(a+b);
	}
	
	void add(byte a, int b) {
		System.out.println(a+b);
	}
	
	void add(char a, int b) {
		System.out.println(a+b);
	}
	
//	void add(int a, char b) {
//		System.out.println(a+b);
//	}
//	
	
}

public class MethodOverloading {

	public static void main(String[] args) {

		//Method Overloading: (compile-time polymorphism)/(Static Binding)/(Early Binding)/(method overloading with type promotion)
		//Multiple methods with the same name but different type/number/order/name/implicit of parameters in the same class.
		//Why called compile-time? → 
		//Because the compiler decides at compile time which method version to call based on the arguments passed.

		// Method Overloading Example:
		// Same method name 'add' is used with different parameter types and count

		Demo d = new Demo();  // Creating an object of Demo class

		d.add(1, 10);         // Calls method with two int parameters
		d.add(1, 10.5f);      // Calls method with int and float parameters
		d.add(1, 10, 10.5f);  // Calls method with int, int, and float parameters
		d.add('a', 'b'); //calls method with char and int , doing implicit
		// Implicitly converting second char ('b') → int (since int is wider than char)
		// So it matches: add(char, int)
		// Output: 97 + 98 = 195
		
		d.add('a', 'b'); //ambiguity error as java is confused
		// At compile time, Java checks the method signatures and chooses the correct version of the method to call.

	}

}
