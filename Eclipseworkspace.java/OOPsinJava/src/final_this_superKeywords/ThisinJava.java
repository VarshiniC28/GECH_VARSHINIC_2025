package final_this_superKeywords;

class Person {
	public String name;
	public int age;

	// no-args- defualt constructor
	public Person() {
//		super();
		System.out.println("Default constructor");
	}

//	all-args
	public Person(String name, int age) {
//		super();
		this();//used to refer current class constructor  //refers to no-args constructor Person(); // prints content in it
		System.out.println("All args constructor");
		this.name = name; //used to refer instance variable in current class
		this.age = age;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void Display() {
		this.sayHello(); //this keyword for method
		System.out.println("Name: " +this.name); 
		System.out.println("Age: " +this.age);
	}

public class ThisinJava {

	public static void main(String[] args) {
		/*This Keyword:
		 * 
		 * 1. used to refer instance variable in current class.
		 * 2. used to refer current class constructor. 
		 * 3. used to refer method in current class.
		 * 
		 * */
		Person disp = new Person("Varshs",20);
		disp.Display();
	}

}}

