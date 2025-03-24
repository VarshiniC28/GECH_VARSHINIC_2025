package interfaceInJava;

interface Animal{
	public void makeSound(); // its an abstract method inside a interface which doesnt have any body
}

//to extend a class with interface we use implement
//to do that hover over the error on Dog(class) and create unimplemented method . that overrides implemented method and creates unimplemnted methods
class Dog implements Animal{

	@Override
	public void makeSound() {
			System.out.println("Dog Barks");
	}
	
}

class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat Meows");
	}
	
}

public class InterfaceinJava {

	public static void main(String[] args) {
		/*
		 * Interface:
		 * =========
		 * => It is a blue print of the class
		 * => The methods in the interface is by default abstract that doesnt have a body
		 * => form java8 we can write default and static methods in interface.
		 * => if we don't know the complete implementation of a particular method then we use the interface as we can access the method inside the class when we know what we want to implement
		 *  interface interface_name{
		 *  	//code
		 *  }
		 *  
		 *  interface Animal{
		 *  	public void makeSound();
		 *  }
		 * */
		
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
	}

}
