package objectOrientedProgrammingPolyMorphism;

//1. Compile-Time polymorphism - Method Overloading 
class Compiletime {
	
	//One/more methods in a class with same name has different number, types, order of parameters
	//called as compile time because Java compiler decides which method based on the no of inputs while compiling - disp(2,2);
	void disp(){
		System.out.println();
	}
	
	void disp(int a) {
		System.out.println(a);
	}
	
	void disp(int a , int b) {
		System.out.println(a+b);
	}
}


//2. Run-Time Polymorphism - Method Overriding
class Parent11 {
	void marry() {
		System.out.println("marry");
	}
}

class Child11 extends Parent11{
	
	//One method has many forms hence its polymorphism
	//Here when we use override and call the method based on the object of a particular class, JVM comes , and since JVM comes during runtime its called runtime polymorphism
	
	@Override
	void marry() {
		System.out.println(" no");
	}
}

class Child22 extends Parent11{
	
	void marry() {
		System.out.println("no..");
	}
}

class Child33 extends Parent11{
	void marry() {
		System.out.println(" no...");
	}
}

public class PolymorphismTypes {

	public static void main(String[] args) {

		//There are 2 types of polymorphism:
		//1. Compile-Time polymorphism/Static binding/Early Binding - Method Overloading 
		//2. Run-Time Polymorphism/Dynamic binding/Late Binding/Dynamic Method Dispatch - Method Overriding 
		
		//1. Compile-Time polymorphism - Method Overloading 
		Compiletime c = new Compiletime();
		c.disp(2, 2); //called as compile time because Java compiler decides which method based on the no of inputs while compiling - disp(2,2);
		
		
		//2. Run-Time Polymorphism - Method Overriding
		Child11 ch= new Child11();
		ch.marry(); //Here when we use override and call the method based on the object of a particular class, JVM comes , and since JVM comes during runtime its called runtime polymorphism
			
	}

}
