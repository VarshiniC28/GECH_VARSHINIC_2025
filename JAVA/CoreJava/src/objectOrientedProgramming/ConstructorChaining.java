package objectOrientedProgramming;

class Test{
	int x, y;
	
	//Constructors are typically declared as public to allow the creation of objects from anywhere in the code
	public Test() {
		//the super() from child class comes here and executes the below, here also there will be super() given by JVM which will go to super class constructor i.e Object class. then executes the constructor of Object executes whats there in it comes back and executes x and y below lines and goes back to child class
		//super();
		x=100;
		y=200;
	}
	
	public Test(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}
}

class Test2 extends Test{
	
	int a,b;
	
	public Test2() {
		//super(); // refers to the constructor of super/parent class. If we dont give then the JVM will give super() automatically always
		//since no parameters its go to default constructor.
		
		//this and super cant be together
		this(9,99); //this will go to same class another parameterized constructor
		a= 300;
		b=400;
	}
	
	public Test2(int a, int b) {
//		super(a,b); //This goes to parameterized constructor of Parent class.
		super(); //this will goto default constructor of parent class //local chaining is happening here then constructor chaining .
		this.a = a;
		this.b = b;
		
	}
	
	void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {

		Test2 t = new Test2(8,88); //100,200, 8, 88 //There are parameters so it goes to parameterized constructor
		t.disp();
		
		Test2 ti = new Test2(); //100,200,300,400 //no parameters go to zero parameter constructor
		ti.disp();
		
		Test2 tii = new Test2(8,88); //8, 88, 8, 88 //parameterized here and also in constructor by giving a, b as parameters : super(a,b); hence it goes to parameterized constructor of parent class and assigns,x and y with a and b
		tii.disp();
		
		//constructor and local chaining together - 
		Test2 t2 = new Test2(); //100,200,300,400
		t2.disp();
		
		//Programmers can give this(), this(a,b), super(), super(a,b)
		//JVM can only give super() only if programmer has not given anything
		//first line of constructor can be either this or super not both.
		
		
	}

}
