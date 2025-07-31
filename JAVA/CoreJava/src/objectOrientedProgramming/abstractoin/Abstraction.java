package objectOrientedProgramming.abstractoin;

abstract class Bird{
	abstract void eat();
	abstract void fly();
}

abstract class Eagle extends Bird{
	
	@Override
	 void fly() {
		 System.out.println("Flies at large height");
	 }
}

class SerpentEagle extends Eagle{
	
	@Override
	 void eat() {
		 System.out.println("Eats ");
	 }
	
 //fly() is inherited method 
}

class GoldenEagle extends Eagle{

	@Override
	void eat() {
		System.out.println("Eats");
		
	}
	 //fly() is inherited method 
}


// Method overriding/ polymorphism is there but to make it have with loose coupling following way
class Sky{
	
	//parent
//	public void EagleFamily(Eagle ref) {
//		ref.eat();
//		ref.fly();
//	}
	
	//main parent
	public void BirdFamily(Bird ref) {
		ref.eat();
		ref.fly();
	}
}


public class Abstraction {

	public static void main(String[] args) {

		SerpentEagle s = new SerpentEagle();
		s.fly();
		s.eat();
		
		GoldenEagle g = new GoldenEagle();
		g.eat();
		g.fly();
		
		//Method overriding with loose coupling
		Sky sk = new Sky();
//		sk.EagleFamily(s);
//		sk.EagleFamily(g);
		sk.BirdFamily(s);
		sk.BirdFamily(g);
		
		
	}

}
