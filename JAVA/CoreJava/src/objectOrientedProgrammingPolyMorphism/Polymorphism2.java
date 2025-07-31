package objectOrientedProgrammingPolyMorphism;

class Plan{
	void fly() {
		System.out.println("Plane flies");
	}
	
	void land() {
		System.out.println("Plane lands");
	}
}

class CargoPlan extends Plan{
	
	@Override
	void fly() {
		System.out.println("Cargo plane Flies at lower height");
	}
	
	void carryCargo() {
		System.out.println("cargo");
	}
}

class PassengerPlan extends Plan{
	@Override
	void fly() {
		System.out.println("Passenger plane Flies at medium height");
	}
	
	void carryPassenger() {
		System.out.println("Passengers");
	}
}

class FighterPlan extends Plan{
	@Override
	void fly() {
		System.out.println("Fighter plane Flies at any height");
	}
	
	void carryWeapons() {
		System.out.println("Fiehter");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		
		
		CargoPlan c =new CargoPlan();
		PassengerPlan p = new PassengerPlan();
		FighterPlan f = new FighterPlan();
		
		c.fly();
		p.fly();
		f.fly();
		//Till now there is no Polymorphism. because there is tight coupling which means child Object to child reference only..
		//Loose coupling is what gives us polymorphism which means child object to Parent reference.
		
		System.out.println("____________________________________________________________");
		
		//Below gives us polymorphism through loose coupling as below.
		Plan refPlane;
		refPlane = c;
		refPlane.fly();
		refPlane.land();
		((CargoPlan)(refPlane)).carryCargo(); //Here down casting is done to access specialized method which couldn't be accessed otherwise
		
		refPlane = p;
		refPlane.fly();
		refPlane.land();
		((PassengerPlan)(refPlane)).carryPassenger(); //Here down casting is done to access specialized method which couldn't be accessed otherwise
		
		refPlane = f;
		refPlane.fly();
		refPlane.land();
		
		
		//Here just one refPlane(parent ref) reference variable gives different o/p hence now this code has polymorphism.
		
		//We can access inherited and overridden methods from the parent reference and the child object , but cant access specialized methods using parent reference
		//Because parent class doesn't have or knows about the specialized methods the child class has
				
		//Hence to access the specialized methods through the parent we use explicit type casting of parent reference to child which is here called as Down Casting when casting Parent to child as below 
		
		((FighterPlan)(refPlane)).carryWeapons(); //Here down casting is done to access specialized method which couldn't be accessed otherwise
		
		
		//Note: Down Casting - when casting Parent type  to child type (not explicit)
		//		explicit casting  -when converting higher data type to lower data type.
	}

}
