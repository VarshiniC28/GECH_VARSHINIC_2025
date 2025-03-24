package Polymorphism;

//1. method-overriding
class Person {
	public static void walking() {
		System.out.println("The person is walking");
	}
}

//class Varsha extends Person {
//	public void walking() {
//		System.out.println("Varsha is walking");
//	}
//}

//2. methood over-loading
class Addition {
	public static void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}
	public static void add(int a, int b, int c) {
		System.out.println("Addition: " + (a + b + c));
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		/*
		 * POLYMORPHISM:
		 * 
		 * poly-> many , morphism -> forms
		 * 
		 * => It is a mechanism where methods will perform a different actions based on
		 * the situation 
		 * => In simple words polymorphism is where we use the same method in different classes and changing the action.
		 * 1. method-overloading(one class) 
		 * 2. method-overriding(two class) / dynamic- polymorhism/ runtime polymorphism
		 * 
		 * => 1. overloading/Compiletime polymorphism/static polymorphism/static binding - same method with different inputs within the same class.
		 * -Called as Complile time polymorhism beacuse the compiler decides which input method to be called during compile time.
		 * 
		 * => 2. overriding for two classes - Using the same method
		 * in the child class extending to parent class but printing different by
		 * overriding the method and printing the new thing we want to print.
		 * 
		 * 
		 * => static method doesnt work when overriding but works when overloading
		 */

		// 1. method-overriding- static doesnt work in this case// check this once again for clarity
//		Varsha varsha = new Varsha();
//		varsha.walking();
//		Varsha.walking();
		
		//2. Method-overloading:
		//Default-method
		//Addition addition = new Addition();
		
		//compiler decides here:
		//since two inputs given it calls two input method during compiling
		//addition.add(5, 50);
		//since three inputs given it calls three input method during compiling
		//addition.add(70, 1, 4);
		
		//Static method
		Addition.add(5, 5);
		Addition.add(5, 5, 5);
		
	}

}
