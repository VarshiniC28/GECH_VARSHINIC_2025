package objectOrientedProgramming.abstractoin;

//import java.util.Scanner;
interface Calculator1{
	void add();
	void sub();
}

interface Calculator2{
	void mul();
	void div();
}

class MyCalculator implements Calculator1,Calculator2{

	@Override
	public void mul() {
		System.out.println("Multiplication");
	}

	@Override
	public void div() {
		System.out.println("Dividing");
	}

	@Override
	public void add() {
		System.out.println("Adding");
	}

	@Override
	public void sub() {
		System.out.println("Subtracting");
	}
	
}

//---------------------------------------------------
//Industry preferred multiple inheritance using Interface

interface One{
	void add();
}

interface Two{
	void sub();
}

interface Three extends One, Two{
	void mul();
}

class One1 implements Three{

	@Override
	public void add() {
		System.out.println("Add");
	}

	@Override
	public void sub() {
		System.out.println("Sub");
	}
	
	@Override
	public void mul() {
		System.out.println("Mul");
	}
}

//--------------------------------------------------
// A class can implement a interface and extend to a class at the same time, but first extend then implement as below.

interface Four{
	void add();
}

class Two2{
	void addition() {
		System.out.println("additiom");
	}
}

class Three3 extends Two2 implements Four{

	@Override
	public void add() {
		System.out.println("Add");
	}	
}

//-----------------------------------------------------
//Interface can have variable butJava will automatically attach public , static and final
interface Demo{
	int COUNT = 2; //automatically java will make it as public static final int count = 2;
//	void fun(); //automatically java will make it as public void fun();
}

class Demo21 implements Demo{
	//static var will be inherited hence count will be inherited here 
	void add() {
//		COUNT = 2; //will get error that final field cant be assigned
	}
}

//-----------------------------------------------------------------
//Interface which is empty is called as empty interface or marker interface or triggered interface, Tagged interface
//One inbuilt interface which is empty/marker/tagged interface is Serializable 
interface Demo1{
	
}

//---------------------------------------------------------------------

public class MultipleInheritanceWithInterface2 {

	public static void main(String[] args) {

		//Multiple inheritance using interface : One class can implement 1/more interfaces  
		//and interface is not extended to any parent by default not even object so there will be no diamond problem also.
		
		MyCalculator c = new MyCalculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
		
		
		//Multiple inheritance 
		One1 o = new One1();
		o.add();
		o.sub();
		o.mul();
	}
}
