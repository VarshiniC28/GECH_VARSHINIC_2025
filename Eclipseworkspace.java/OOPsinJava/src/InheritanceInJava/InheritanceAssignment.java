package InheritanceInJava;

interface interface1{
	public void interface1method();
}
interface interface2{
	public void interface2method();
}
interface interface3 extends interface2, interface1{
	public void interface3method();
}
class Parentt implements interface3{
	public void parenttmethod() {
		System.out.println("This is parent to interface3 method");
	}

	@Override
	public void interface2method() {
		System.out.println("This is interfac2 method");
		
	}

	@Override
	public void interface1method() {
		System.out.println("This is interface1 method");
	}

	@Override
	public void interface3method() {
		System.out.println("This is interface3 method");
		
	}
	
}
class Child1 extends Parentt{
	public void child1method() {
		System.out.println("This is child1 to parent method");
	}
}
class Childd2 extends Parentt{
	public void child2method() {
		System.out.println("This is child2 to parent method");
	}
}

public class InheritanceAssignment {

	public static void main(String[] args) {
		
		//Accessed all methods from child1 class
		Child1 child1 = new Child1();
		child1.child1method();
		child1.parenttmethod();
		child1.interface1method();
		child1.interface2method();
		child1.interface3method();
		
		Childd2 child2 = new Childd2();
		child2.child2method();
		child2.parenttmethod();
		child2.interface1method();
		child2.interface2method();
		child2.interface3method();
		
		
	}

}
