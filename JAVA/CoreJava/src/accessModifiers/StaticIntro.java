package accessModifiers;

class Test{
	
	//static vars
	static int a ,b;
	
	//static block
	static
	{
		a = 10;
		b = 10;
		System.out.println("Inside Static block");
	}
	
	//static function
	static void function1 (){
		System.out.println("Inside static method");
	}
	
	//instance vars:
	int x,y;
	
	//non-static/instance block:
	{
		System.out.println("Inside instance. non-static block");
	}
	
	//non-static function
	void function2() {
		System.out.println("Inside non static/instance method");
	}
	
	//default / non parameterized constructor
	public Test() {
		System.out.println("Inside constructor");
		x = 30;
		y = 40;
	}
}

public class StaticIntro {

	public static void main(String[] args) {
		
		//Java called as DYNAMIC language because : It loads class only when we need it but not all together at once

		//Static :
		//JVM first will look for static varibales
		//Then looks for static blocks
		//next will look for static methods that is main method
		
		//Instance: And once statics are done , when we create object , first obj is created then instance block is executed and then constructor and then the method(function2) called using object
		
		//No need of obj creation since we have used static keyword
		Test.function1();
		
		//Needs obj creation since its instance method
		Test t = new Test();
		t.function2();
		
		//o/p order : first static block >> static method(if its called) >> instance block >> constructor >> instance method called using ref var of obj
	}

}
