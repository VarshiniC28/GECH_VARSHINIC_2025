package objectOrientedProgramming.inheritance;

class SuperClass{
	int i = 1;
	
	void display() {
		System.out.println("Hello");
	}
}

class SubClass extends SuperClass{
	int i = 10;
	
	void disp() {
		System.out.println(i); //i = 10 , because its from this subclass.
		System.out.println(super.i); //o/o i =1; because we are calling i var from superclass using super keyword.
	}
	
	@Override
	void display() {
		System.out.println("Hi"); //prints hi
		//but if we want to print the super class's Hello then we use super keyword again as below
		super.display(); //super class's method is executed.
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		SubClass s = new SubClass();
		s.disp(); 
		
		s.display(); //"Hi" 
		
	}

}
