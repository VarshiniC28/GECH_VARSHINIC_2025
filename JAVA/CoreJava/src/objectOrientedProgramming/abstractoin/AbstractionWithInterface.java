package objectOrientedProgramming.abstractoin;

import java.util.Scanner;

//interface dont have any parent by default not even object
interface Theta{ //automatically there will be abstract for both interface and methods in it , since interface will take only abstract method
	void disp(); //JVM will make any methods in interface as public and abstract by default 
}

class Omega implements Theta{

	@Override
	public void disp() { //must be public because in interface all methods will be public by default , and when implementing that method we cant decrease the visibility/access level to package/default 
		System.out.println("Implementing inherited abstract methos=ds from interface in this class which is implemented to that interface.");
	}
}

//----------------------------------------------------

interface Calculator{
	public void add();
	public void sub();
}

abstract class MyCalci1 implements Calculator{
	@Override
	public void add() {
		int a = 1;
		int b = 1;
		System.out.println(a+b);
	}
 
	//sub() is here inherited method and since its is abstract method we will have to make class as abstract also
}

class MyCalci2 implements Calculator{
	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a  =sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a  =sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println(a-b);
	}
}

class MyCalci3 implements Calculator{
	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a  =sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a+b);
		}else {
			System.out.println("Invalid!!");
			System.exit(0); //will terminate the program, nothing will execute next
		}
	}

	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a  =sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		if(a<b) {
			System.out.println(a-b);
		}else {
			System.out.println("Invalid!!");
			System.exit(0);
		}
	}
	
	public void mul() {
		int a=1, b=2;
		System.out.println(a*b);
	}
}

//polymorphism
class Calci {
	void calci(Calculator c) { //This is just ref of interface not Object and we cant create object also
		c.add();
		c.sub();
	}
}

public class AbstractionWithInterface {

	public static void main(String[] args) {

		//2. Abstraction with interface.
		
		//Disadvantages of Abstraction using abstract keyword
		/*
		 * 1. Can achieve pure and impure abstraction also, since in a abstract class in can have both complete and abstract methods or only abstract methods.
		 * 2. It can be used when we need to achieve the partial abstraction
		 * 
		 * */
		
		/*==> Pure abstraction can be achieved by interface and also can achieve multiple inheritance
		==> We cant create Object for interface similar to abstract class since they have abstract methods
		==> We can achieve polymorphism with interface by passing child class objects to parent interface reference.
		==> Methods in interface are automatically public and abstract
		==> Specialized methods cant be accessed directly using interface type reference but can access using down casting the interface reference to subclass type
		==> A class can implement multiple interfaces because diamond shape problem does not exist as interface don’t have parent.
		==> 
		*/
		
		//implementing classes
//		MyCalci1 c = new MyCalci1();
		MyCalci2 cc = new MyCalci2();
		MyCalci3 ccc = new MyCalci3();
		
		Calci l = new Calci();
//		l.calci(c);
		l.calci(cc);
		l.calci(ccc);
		
		//Parent ref 
		Calculator ref;
		ref = ccc;
//		ref.mul(); //we cant access the specialized method of a class extended to interface using reference of interface parent and up casting but possible indirectly using down casting as below.
		((MyCalci3)(ref)).mul();
	}
}
