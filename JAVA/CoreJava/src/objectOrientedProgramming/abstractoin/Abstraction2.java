package objectOrientedProgramming.abstractoin;

//Rule in Java : In a class if there is a even one abstract method then the class should be also abstract otherwise there will be error.
//And if class dont have abstract methods or has only fully implemented methods , its our wish to make class abstract or not, but the thing is class can be abstract even if dont have abstract methods
abstract class Alpha{
	//Abstract method/incomplete method is a method with only method signature and no method body or implementation.
//	abstract void disp(); // method implementation is hidden	
	
	public Alpha() {
		//abstract class can have constructor
		System.out.println("Inside Alpha constructor");
	}	
}


//abstract class can be inherited by normal class but this class should be also abstract if it inherits abstract method, otherwise no need.
// and normal class(not abstract) can also inherit the abstract class.
// and abstract class can also inherit another abstract class, so conclusion is with abstract also inheritance works normally like other classes 


class Gamma extends Alpha{
	//default constructor is given by Java compiler automatically
	public Gamma() {
		//super(); by JVM
	}
	
}

public class Abstraction2 {

	public static void main(String[] args) {

		//Abstractions : Hiding the implementation and showing only the essential functions to user is called abstraction.
		
		//2 ways :
		//1. Abstract : Its a keyword
		//2. Interface
		
		//1. abstract
		//Alpha a = new Alpha(); //error because we cant instantiate the abstract class or we cant create object for abstract class.
		
		Gamma g = new Gamma(); //constructor of this class has super() given by JVM which will go to suoer class constructor
		//so constructor of abstract class is called by creating object of the subclass.
	
	}

}
