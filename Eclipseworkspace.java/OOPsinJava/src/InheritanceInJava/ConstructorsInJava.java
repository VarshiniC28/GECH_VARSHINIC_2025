package InheritanceInJava;

class Student1{
	//states
	public int age ;
	public String name ;
	public double marks ;
	
	//by default constructor should be public 
	//rignt click > sources > get constructor using fields
	
	//1. Full args constructor
	//for One constructor we can create multiple objects 
//	public Student1(int age, String name, double marks) {
//		System.out.println("Full args constructor");
////		super();
//		this.age = age;
//		this.name = name;
//		this.marks = marks;
//	}
	
	//2. No-args constructor
	// when no arguments is given for object it will print the default values declared in the beginning of the class, here in this its null
	public Student1() {
		System.out.println("No args constructor");
	}

	//actions
	public void isPlaying() {
		System.out.println(this.name + " is playing");
	}
	
	public void isSleeping() {
		System.out.println(this.name +" is sleeping");
	}
	public void display() {
		System.out.println("Name:" +this.name);
		System.out.println("age:" +this.age);
		System.out.println("marks:" +this.marks);
	}

}

public class ConstructorsInJava {

	public static void main(String[] args) {
//		Student1 std1 = new Student1(21,"Varshini", 600);
//		std1.display();
//		
//		//this is taking fullargs constructor sice we have given arguments 
//		Student1 std2 = new Student1(21, "ammggu", 635);
//		std2.display();
		
		//this is taking no-args constructor since we have given no arguments and is displaying the default values for display that is null
		Student1 std3 = new Student1();
		std3.display();
		
	}

}
