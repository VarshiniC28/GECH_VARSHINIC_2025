package objectOrientedProgramming.inheritance;

class Parent{
	
	//Attributes, properties, instance variables
	float height = 5.8f;
	String color = "Brown";
	String noseStructure = "Normal";
	
	//behavior 
	void readBooks() {
		System.out.println("Loves to read books");
	}
	
	void drink() {
		System.out.println("No drinks");
	}
	
	void smoke() {
		System.out.println("No smoke");
	}
}

class Child extends Parent{
	
	
}

public class Inheritance {

	public static void main(String[] args) {

		/*Inheritance: 
		 * => Process where one class inherits the properties and behaviors from another class
		 * => Advantages : Code re-usability, Reduces development time and effort, Increases profitability.
		 * 
		*/
		
		Child c = new Child();
		//Child class has inherited the properties and behavior from parent class 
		System.out.println(c.height + c.color + c.noseStructure);
		c.readBooks();
		c.drink();
		c.smoke();
		
	}

}
