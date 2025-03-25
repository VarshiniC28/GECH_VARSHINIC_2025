package final_this_superKeywords;

final class Animal{
	public final void eat() {
		System.out.println("This is the final class which cant be extended");
	}
}

//A class cant be extended to a final class  // shows error 
//class Dog extends Animal{
//	public void eat() {
//		System.out.println("DOG");
//	}
//}

//do for method

public class FinalInJava {

	public static void main(String[] args) {
		/*
		 * final -> We cant change the value once set using final keyword
		 * -> can create a object for final class but final class cant be extended to parent class or viceversa
		 * Final Keyword with Variables, method, class
		 * 
		 * variables => The values of vars cannont be changed
		 * method => The methods cant be overrided
		 * final class => We cannot extend that class
		 * */
		
//		1. final var
		final double PI = 3.14;
		System.out.println(PI);
		
		//shows error that variable PI cannot be assigned as we have used the final keyword
//		PI = 44;
//		System.out.println(PI);
		
		Animal animal = new Animal();
		animal.eat();
	}

}
