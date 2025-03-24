package AbstractioninJava;

//1. Abstraction using interface.
interface Animal{
	public void eat(); // In interface the method is by default abstract so no need of abstract keyword unlike in the abstract method in clss that needs abstarct keyword
}

class Lion implements Animal{ //no need of abstract keyword here also

	@Override
	public void eat() {
		System.out.println("Lion eats meat");
	}
	
}

abstract class Vehicle{ // we cant create a object for abstract method so we need to create another class extend to this.
	//Abstract method:
	public abstract void start();
	
	//Non - Abstract method
	public void stop() {
		System.out.println("The Vehicle has stopped");
	}
	
}

class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("The Vehicle has started");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		/*
		 * ABSTRACTION:
		 * => Its a process of hiding the implementation and showing only the essential resources.
		 * 
		 * 2 Ways:
		 * 1. Abstraction using Interface(gives 100% abstraction)
		 * 2. abstract class(0-100% , when we want to achieve abstraction in between range)
		 * */
		
		//1. Interface
		Lion lion = new Lion();
		lion.eat();
		
		Car car = new Car();
		car.start();
		car.stop();
	}

}
