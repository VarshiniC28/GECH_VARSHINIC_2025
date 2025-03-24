package InheritanceInJava;
//public - can access anywhere
//if we use private it will show error because we can access that method only within class.
//if we use default that is we dont write anything in place of access specifier it will give output as usual inside the package
//static - same as above but we give static in place of public or private and to access it we access directly with class name instead of object

//1. single level:
class Parent{
	int pData = 100; //1st state
	//dont write anything or we  dont use default word. 
	void parentMethod() {
		System.out.println("This is parent method");
	}
}

//class Child1{
//	public void child1Method() {
//		System.out.println("This is child1 method");
//	}
	
class Child2 extends Parent{
	int cData = 200; //2nd state & 1st state is from parent as we have extended to parent class
	static void child2Method() {
		System.out.println("This is child2 method");
	}
}

public class InheritanceInJava {

	public static void main(String[] args) {
		/*
		 * INHERITANCE:
		 * 
		 * -> extending the properties of parent class to child class 
		 * ->  properties(state and action)
		 *
		 * TYPES IN INHERITANCE: 
		 * 1. single level => parent to child class (only 2
		 * classes - inheritance is singgle level) 
		 * 
		 * 2. multilevel => one child class
		 * extends to 2 parent classes one after another that is p1>p2 then c extends to  p1(c>p1) (inheritance in multilevel) 
		 * 
		 * 3. hierarchial => two childs extends to a single parent 
		 * 
		 * 4. hybrid => one child extends form both interface and a
		 * parent class using implements and extends 
		 * 
		 * 5.Multiple => not possible as java
		 * doesnt support inheritance for multiple parents to one child so we use interface as we learnt previously
		 */
		
		Child2 child = new Child2();
		child.parentMethod();
		
		//for static method to access that method we directly call using class name
		Child2.child2Method();
		
		System.out.println(child.pData);
		System.out.println(child.cData);
	}

}
