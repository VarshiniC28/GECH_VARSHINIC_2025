package objectOrientedProgramming;

class Demo11 {
	Demo11(){
		System.out.println("Inside parent constructor");
	}
}


class Demo22 extends Demo11{
	
	//Constructors will never get inherited to child class but will get executed because of super() call.
	//Because if the Demo11 comes to child class name of constructor should be same as class name which will not happen, but however gets executed because super() in the child class will make execute the constructor from parent class
	
	Demo22(){
		System.out.println("Inside child constructor");
	}
}

public class ConstructorChaining2 {

	public static void main(String[] args) {

		Demo22 d = new Demo22();
		
		/*
		  🔹 Constructors are NOT inherited in Java.
		     So, Demo11() is not inherited by Demo22.
		  
		  🔹 But when an object of Demo22 is created,
		     the parent constructor Demo11() is executed automatically
		     because of an implicit call to super() in Demo22 constructor.
		  
		  🔹 Reason:
		     Every constructor (child or parent) must ensure its
		     superclass is fully constructed first → Java does this by calling super()
		  
		  🔸 Note:
		     Even though Demo11's constructor is not inherited, 
		     it still runs when you create a Demo22 object — 
		     because the compiler adds `super();` as the first line of Demo22()
		*/

	}

}
