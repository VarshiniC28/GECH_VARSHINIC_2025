package objectOrientedProgramming.abstractoin;

abstract class Gama{
//	abstract int vari; //not possible
//	void p() {
////		abstract int a; //not possible
//	}
	
//	abstract public void Gama(); //not possible //constructor
	
//	abstract final void disp() ; //not possible because we have to implement abstract methods in subclass, but final will make it unchangeable, so not possible.
}



public class Abstraction3 {

	public static void main(String[] args) {
		
		//Abstract method - possible
		//Abstract class - possible
		//Abstract variable - Not possible
		//Abstract constructor - Not possible
		
		/*Variable can't be abstract because only methods can have undefined (abstract) behavior, but variables must always have a definite value or type.
Constructor can't be abstract because constructors are never inherited, and abstract means "to be overridden in subclass" — which doesn’t apply to constructors.*/
		
		//abstract + final class - not possible - class Gama can be either abstract or final, not both because if we add final we can never inherit, then we can never instantiate abstract methods
		//abstract + final method - 
		//abstract + final variable - not possible 
		
	}

}
