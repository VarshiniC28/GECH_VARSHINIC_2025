package objectOrientedProgrammingPolyMorphism;

import java.util.Scanner;

//class keyw{
//	final int a= 1;
//	void change() {
////		a = 10; //error as it is final,we cant change and will always be constant that is 1
//	}
//}

class Parent{
	void disp() {
		System.out.println("Hello");
	}
}

class child extends Parent{
	
	@Override //annotation
	//can change the methods access specifier to public protected but not private
	//So rule 1: When overriding we have to use same access specifier or can increase the visibility but not restrict/decrease the access level.
	//rule 2: Method name, return type, and parameters must be identical 
	public void disp() { 
		System.out.println("Hi");
	}
}


//---------------NOTE: Before Rule 3:/Note: Methods can not only return datatypes/primitive datatypes but also non primitive datatypes/ Objects like Strings and also Scanner object
class Alpha{
	String method() {
		return "Methods in Java Can also return Objects like Array String, Buffer, builder Scanner object other than primitive datatypes";
	}
	
	StringBuffer method1() {
		StringBuffer sb = new StringBuffer();
		return sb;
	}
	
	Scanner scan() {
		return new Scanner(System.in);
	}
	
	Beta b() {
		return new Beta();
	}
}

class Beta{
	

}
//--------------------------------------------------------

//Rule 3: Co-variant return type: If we want to change the return type(class) while overriding we can do it using co-variant return Type(i.e class/object), extending the classes 

//If we want to change the return type while overrding a method from a class we make it co-variant as below
class Animal{
}

class Tiger extends Animal {
}

class Parent1 {
	Animal disp(int s) {
		Animal a = new Animal();
		return a;
	}
}

class Child1 extends Parent1{
	
	//Will show error as the return type has changed, but can make it happen by making it co-variant i.e making the Class of the object we are creating to change the type extend to the class of the object which was supposed to be same 
//	@Override
	Tiger disp(int s, int a) { //can't give 2 parameters but can give if we remove override because it changes to method - Overloading
		Tiger t = new Tiger();
		return t;
	}
	
	////now will child 1 will have 2 methods :1 is inherited method and the other is method overloaded method(When no @override annotation)
}


public class RulesOfMethodOverriding {

	public static void main(String[] args) {

		/*
		 * Rules of Method Overriding:
		 * => When overriding we have to use same access specifier or can increase the visibility but not restrict/decrease the access level.
		 * => Method name, return type, and number and type of parameters must be identical
		 * => Co-variant return types:While overriding, we can change the return type to a subclass (co-variant) of the original return type, only if the return type is a class (not primitive), i.e those classes must have inheritance only then we can change the return type to child class from parent class.
		 * => Cannot override final, static, or private methods.  
		 * 
		 * => R P C A - Return-type, parameters, co-variant return types, Access Modifiers
		 * */
		
		Child1 c = new Child1(); //Child1 has 2 methods now
		c.disp(0);
		c.disp(0, 0);
		
		Alpha a = new Alpha();
		System.out.println(a.method());
		System.out.println(a.method1());
	}

}
