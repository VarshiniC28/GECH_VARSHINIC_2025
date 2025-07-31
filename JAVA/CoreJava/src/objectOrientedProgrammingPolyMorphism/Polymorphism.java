package objectOrientedProgrammingPolyMorphism;

class Plane{
	void fly() {
		System.out.println("Plane flies");
	}
	
	void land() {
		System.out.println("Plane landed");
	}
}

class CargoPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("Cargo plane Flies at lower height");
	}
}

class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane Flies at medium height");
	}
}

class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter plane Flies at any height");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		
		CargoPlane c =new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
		
		c.fly();
		p.fly();
		f.fly();
		//Till now there is no Polymorphism. because there is tight coupling which means child Object to child reference only..
		//Loose coupling is what gives us polymorphism which means child object to Parent reference.
		
		System.out.println("____________________________________________________________");
		
		//Below gives us polymorphism through loose coupling as below.
		Plane refPlane;
		refPlane = c;
		refPlane.fly();
		refPlane.land();
		
		refPlane = p;
		refPlane.fly();
		refPlane.land();
		
		refPlane = f;
		refPlane.fly();
		refPlane.land();
		
		//Here just one refPlane reference variable gives different o/p hence now this code has polymorphism.
		
		//We can access inherited and overridden methods from the parent reference and the child object , but cant access specialized methods using parent reference
		//Because parent class doesn't have or knows about the specialized methods the child class has
		
		//Hence to access the specialized methods through the parent we use explicit type casting of parent reference to child as below
		//refer Polymorhism2 file
	}

}
