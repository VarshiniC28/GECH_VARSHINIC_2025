package EncapsulationInJava;

class Person{
	public String name;
	public int age;
	
	//constructor creation for the class
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//Now to call the object directly and print it directly we use toString() method that overrides constructor 
	//right click > sources > Generate toString() > gives output as below
	//Here in toString() method , instead of calling just name and age we can use this.name or this.age but it became optional from JAVA17
	
	@Override
	public String toString() {
		return "person [name=" + this.name + ", age=" + age + "]";
	}
	
	
	
}

public class ToStrinInJava {
	public static void main(String[] args) {
		/*toString: Use: to print an object directly
		 * =======
		 * => It is a method that is used to display the objects or print the objects directly .
		 * */
		
		Person person = new Person("Varsha",21); // giving arguments to constructor 
		
		//When we try to print object directly without object.name by default it searches for toString() method and prints
		System.out.println(person);
	}
}
