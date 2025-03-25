package animal;



interface Animal{
	public void eat();
	public void makeSound(); 
}
	
class Dog implements Animal{

	@Override
	public void makeSound() {
			System.out.println("Dog Barks");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats");
		
	}
	
}

class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat Meows");
	}

	@Override
	public void eat() {
		System.out.println("Cat eats");
		
	}
	
}

public class Animals {

	public static void main(String[] args) {
		
		System.out.println("ABOUT DOG: ");
		Dog dog = new Dog();
		dog.makeSound();
		dog.eat();
		
		System.out.println("ABOUT CAT: ");
		Cat cat = new Cat();
		cat.makeSound();
		cat.eat();
	}

}
