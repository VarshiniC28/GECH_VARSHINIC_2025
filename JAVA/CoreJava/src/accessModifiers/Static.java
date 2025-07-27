package accessModifiers;

class Demo{
	 static int a;
	//int a;
	
	//Static block and instance block both can access the static variable 
	static {
		System.out.println(a);
//		method1(); // calling the method1 
	}
	
	//Static method and instance method both can also access the static variable
	static void method1() {
		System.out.println(a);
	}
	
	//static var can be accessed on constructor also
	public Demo() {
		System.out.println(a);
	}
	
	//Instance vars can be accessed by instance block ,instance method, constructor
	
	//Why cant instance var be accessed by static block and static method ? 
	//: Because when class is loaded ,  static variables memory is allocated first in method area, but for instance its memory is allocated only when object is created, so when we try to access instance var inside static method or block before obj creation it shows error
	
}

public class Static {

	public static void main(String[] args) {

		Demo d = new Demo();
	 Demo.method1();
	}

}
