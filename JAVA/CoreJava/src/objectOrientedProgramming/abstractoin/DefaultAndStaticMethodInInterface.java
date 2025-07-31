package objectOrientedProgramming.abstractoin;

interface Demo11{
	void disp();
	
	//default and static came in Java 8
	default void disp1() { //when we want to give a body to method inside interface we can use abstract, and can be implemented/overriden in class
		System.out.println("Default");
	} //default methods are only allowed inside interfaces
	
	static void disp2() {
		System.out.println("..");
		//Static methods with body can be given in interface as we can access static methods without the need of creation of objects
	}
	
	//private came in Java 9
	private void disp3() {
		System.out.println("Private method can be given with body inside interfaces");
	}
}

class Def implements Demo11{

	@Override
	public void disp() {
		System.out.println(".");	
	}
	
	@Override
	public void disp1() {
		System.out.println("..");
	}
}
//-------------------------------------------------------------------

//class Bet{
//	//default methods are only allowed inside interfaces	default void add() { 
//		System.out.println(".");
//	}
//}

//-----------------------------------------------------------------------
@FunctionalInterface
interface fun{
	void add1();
	default void add() {  //its possible to give one/more default method inside the functional interface along with one abstract method(must), i.e cant give only one default method only there must me one abstract method along with it 
		
	}
	
	static void add3() {//its possible to give one/more static method inside the functional interface along with one abstract method(must), i.e cant give only one static method only there must me one abstract method along with it
		
	}
	
	//can give as many as default and static methods and can also give them together, but there must be a abstract method
}

//----------------------------------------------------------------------------------

//----------------------------------------------------------------------------------

interface SeaAnimals{
	void eat();
	void swim();
	//Whenever new feature/method has to be added , if there are many classes its not possible to override it in all of them, so we can give method with body along default keyword
	
	default void communicate() { //default is not access modifier its a keyword, public is there automatically
		System.out.println("Sea animals communicate");
	}
}

class Shark implements SeaAnimals{

	@Override
	public void eat() {
		System.out.println("Sharks eat humans");
	}

	@Override
	public void swim() {
		System.out.println("Sharks swim");
	}
	
}

class Dolphin implements SeaAnimals{

	@Override
	public void eat() {
		System.out.println("Dolphins eat fish");
	}

	@Override
	public void swim() {
		System.out.println("Dolphins swim");
	}
	
}

public class DefaultAndStaticMethodInInterface {

	public static void main(String[] args) {

		Def d = new Def();
		d.disp();
		d.disp1();
//		d.disp2(); //static methods wont participate in inheritance when its within interface but can when its class inheritance.
		
		Demo11.disp2(); //static method can be accessed directly with the name of interface like this
		
		//---------------------
		
		Shark s = new Shark();
		s.eat();
		s.swim();
		
		Dolphin dolp = new Dolphin();
		dolp.eat();
		dolp.swim();
	}

}
