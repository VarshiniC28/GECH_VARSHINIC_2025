package objectOrientedProgramming.inheritance;


//Hierarchical Inheritance
class Plane{
	void takeOff() {
		System.out.println("Plane Took off");
	}
	
	void fly() {
		System.out.println("Plane flight");
	}
	
	void land() {
		System.out.println("Plane has landed");
	}
	
}

class CargoPlane extends Plane{
	
	//This is Overridden methods
	@Override
	void fly() {
		System.out.println("Flies at lower height");
	}
	
	//land and takeOff are inherited methods
	
	//Below is specialized methods thats only inside child class
	void caryCargo() {
		System.out.println("This is a carry cargo");
	}
}


class PassengerPlane extends Plane{
	
	//This is Overridden methods
	@Override
	void fly() {
		System.out.println("It flies  at medium height");
	}
	
	//land and takeOff are inherited methods
	
	//Below is specialized methods thats only inside child class
	void carryPassenger() {
		System.out.println("This carries passenger");
	}
}

class FighterPlane extends Plane{
	
	//This is Overridden methods
	@Override
	void fly() {
		System.out.println("Flies at any height");
	}
	
	//land and takeOff are inherited methods
	
	//Below is specialized methods thats only inside child class
	void caryWeapons() {
		System.out.println("This carries Weapons");
	}
}

public class MethodsOfInheritance {

	public static void main(String[] args) {

			/*
			 * Methods of Inheritance:
			 * 1. Inherited Methods
			 * 2. Overridden Methods
			 * 3. Specialized Methods
			 * */
		
		System.out.println("Cargo Plane");
		CargoPlane c = new CargoPlane();
		c.takeOff();
		c.fly();
		c.land();
		c.caryCargo();
		System.out.println();
		
		System.out.println("Passenger plane");
		PassengerPlane p = new PassengerPlane();
		p.takeOff();
		p.fly();
		p.land();
		p.carryPassenger();
		System.out.println();
		
		System.out.println("Fighter Plane");
		FighterPlane f = new FighterPlane();
		f.takeOff();
		f.fly();
		f.land();
		f.caryWeapons();
		System.out.println();
	}

}
