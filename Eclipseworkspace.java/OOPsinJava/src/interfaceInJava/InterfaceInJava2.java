package interfaceInJava;

//interface and class are same but interface doesn't have body as in method(); whereas class will have the body
interface Interface1 {
	public void method();
	
	//but when we don't want to declare body in class but we can write body for methods using default and static
	public default void defaultMethod() {
		System.out.println("This is default method in interface");
	}
	public static void staticMethod() {
		System.out.println("This is static method in interface");
	}
}

class Child1 implements Interface1{

	@Override
	public void method() {
		System.out.println("This is method");
	}
}

public class InterfaceInJava2 {

	public static void main(String[] args) {
		/*
		 *default and static method inside interface 
		 *==> interface and class are same but interface doenst have body as in method(); whereas class will have the body
		 *==> but when we dont want to declare body in class but want to write body to a method in interface we can write body for methods using default and static methods
		 */
		
		Child1 child = new Child1();
		child.method();
		child.defaultMethod();
		//when we are calling a static method from the interface we call it using the interface name not the object name
		Interface1.staticMethod();
	}

}