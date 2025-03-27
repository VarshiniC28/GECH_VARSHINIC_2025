package com.functionalInterface;

@FunctionalInterface
interface Interface2{
	public void display();
}

@FunctionalInterface
interface Interface3{
	public int string(String s); //Takes a String and returns an int
}

@FunctionalInterface
interface Interface4{
	public int add(int a , int b); //Takes two integers and returns an int
	
}
public class FunctionalInterfaceInjava1 {

	public static void main(String[] args) {
		
		//Lambda expression with functional interface: to use lamda expression interface should be Functional interface
		// No need for extra classes, just assign functionality directly
		// Shorter, more readable, and powerful
		
		//int a=10;
		Interface2 i = () -> System.out.println("Hello"); // No class, no overriding—just pure expression!
		i.display();
		
		//another functional interface to use lamda expression for that abstract method.
		Interface3 i3 = s -> s.length();
		int res = i3.string("Hello World"); // calling the method 
		System.out.println("Result is : "+res);
		
		//another functional interface to perform  addition using lamda expression for functioal interface.
		Interface4 i4 = (a,b)-> {return a+b;}; //i4 var has the operation we want to perform using lambda expression.
		int result = i4.add(1, 2);
		System.out.println("Addition using lambda expression: " +result);
	}

}
