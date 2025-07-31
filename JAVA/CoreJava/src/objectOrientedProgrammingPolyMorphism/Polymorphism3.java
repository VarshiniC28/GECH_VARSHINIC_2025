package objectOrientedProgrammingPolyMorphism;

class Plane1{
	void takeOff() {
		System.out.println("Took off");
	}
	
	void fly() {
		System.out.println("Flies");
	}
	
	void land() {
		System.out.println("Land");
	}
}

class CargoPlane1 extends Plane1{
	
	@Override
	void takeOff() {
		System.out.println("Cargo Plane Took off");
	}
	
	@Override
	void fly() {
		System.out.println("Crago Flies");
	}
	
	@Override
	void land() {
		System.out.println("Crago Landed");
	}
}

class PassengerpLane extends Plane1{
	@Override
	void takeOff() {
		System.out.println("Passenger Plane Took off");
	}
	
	@Override
	void fly() {
		System.out.println("Passenger Flies");
	}
	
	@Override
	void land() {
		System.out.println("Passenger Landed");
	}
}

class Fighterplane extends Plane1{
	@Override
	void takeOff() {
		System.out.println("Fighter Plane Took off");
	}
	
	@Override
	void fly() {
		System.out.println("Fighter Flies");
	}
	
	@Override
	void land() {
		System.out.println("Fighter Landed");
	}
}


//2nd way of achieving the polymorphism is create one class with a method passed with Parent reference and call the methods in the parent class in it as below
class Airport{ //Preferred method
	
	public void permit(Plane1 ref) { //should be public 
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class Polymorphism3 {

	public static void main(String[] args) {
		
		CargoPlane1 c = new CargoPlane1();
		c.fly();
		
		PassengerpLane p = new PassengerpLane();
		p.fly();
		
		Fighterplane f = new Fighterplane();
		f.fly();
		
		//No polymorphism till now , there is method overriding  but there is tight coupling
		
		//This method where Reference of superclass pointing to object of subclass is called Up casting.

//		Plane1 ref;  //can also directly write it as Parent ref = new Child();
//		
//		ref = c;
//		ref.fly();
//		
//		ref = p;
//		ref.fly();
//		
//		ref = f;
//		ref.fly();
		//Now there is polymorphism , since ref has many forms through loose coupling
		
		
		//This is one way to achieve polymorphism
		
		//There is 2nd way to that also. and this 2nd way is preferred 
		Airport a = new Airport();
		a.permit(c); //Now for permit method in airport class which has parameter as parent ref we are passing child object - bow ref = c;
		a.permit(p);
		a.permit(f);
		
		
	}

}
