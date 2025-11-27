package accessModifiers.Static;

class SuperClass{
	
	static int a =10;
	
	static void disp() {
		System.out.println("Inside static method in Super class");
	}
	
	static{
		System.out.println("Inside static block of superclass.");
	}
	
	{
		System.out.println("Inside instance block of superclass");
	}
	
	public SuperClass() {
		System.out.println("Inside SuperClass");
	}
	
}

class SubClass extends SuperClass{
	
	static{
		System.out.println("Inside static block of subclass.");
	}
	
	{
		System.out.println("Inside instance block of subclass");
	}
	
	public SubClass() {
		super();
		System.out.println("Inside SubClass constructor");
	}
	
	// Static method cannot be overriden
//	@Override
//	static void disp() {
//		System.out.println("Inside static block");
//	}
	
	//Now its not overridden its a new method in this class and called specialized methods
	static void disp() {
		System.out.println("Inside static method of sub class"); 
		//Now we have only one method, since inherited method has same name and same no of parameters as this method no overloading also,
		//hence that parent class method will not be inherited but will be hidden inside sub class called method hiding.
		//And that parent class method can be accessed through the subclass, only through super class.
	}
	
//	@Override
//	public SuperClass() {
//	Cant override the constructor since the name of the class will not be anymore	
//	}
}


public class InheritanceAndStatic {

	public static void main(String[] args) {
		
		//static variables get inherited by the sub class.
//		System.out.println(SubClass.a);
		
		//Static method also gets inherited but cant be overridden and if we try it will be hidden and cant be accessed by the subclass and called as Method hiding
//		SubClass.disp();
		
//		SuperClass.disp();
		SuperClass s = new SuperClass();
		
		SubClass su = new SubClass(); //Comment all other lines and understand the output order of execution //First parents inherited block followed by subclass block like that
		
		
	}
}
