package final_this_superKeywords;

//Parent class
class NewAnimal {
	public String name;
	public int age;

	// parent constructor
	public NewAnimal(String name, int age) {
		super();
		System.out.println("This is parent constructor");
		this.name = name;
		this.age = age;
	}

	// main display
	public void Display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}

//child class
class NewDog extends NewAnimal {
	// instance in child class
	public String eat;

	// constructor of child class with prop of parent constructor also
	public NewDog(String name, int age, String eat) {
		super(name, age);// constructor from parent class with its vars only
		System.out.println("Child class Constrctor");
		this.eat = eat;
	}

	public void Display() {
		super.Display(); // Used to call super for methods from parent class to child class
		System.out.println("Dog eats:" + this.eat);
		System.out.println("name of dog once again: " + this.name);
	}

}

public class SuperInJava {

	public static void main(String[] args) {
		/*
		 * super: difference between this and super is that super accesses var or constructor or methods from parent class where as this points the current class.
		 * 1. Used to call super class instance variables 
		 * 2. Used to call super class constructor 
		 * 3. Used to call super class methods
		 * 
		 * this and super cant be put together -> this(), nd super()
		 */

		NewDog dog = new NewDog("Blacky", 10, "Pedigree");
		dog.Display();

		/*
		 * OUTPUT: 
		 * This is parent constructor 
		 * Child class Constrctor
		 * Name: Blacky 
		 * Age:10
		 * Dog eats:Pedigree 
		 * name of dog once again: Blacky
		 * 
		 * Output explanation:
		 * dog.display(); 
		 * ->first NewDog child class goes to parent class NewAnimal since it is extended & prints This is parent constructor
		 * ->then prints its own i.e child class constructor
		 * -> then comes to diplay method in child class which has super.display() form parent which prints name and age
		 * -> then child class displays Dog eats : Pedigree and name of the dog once again
		 */

	}

}
