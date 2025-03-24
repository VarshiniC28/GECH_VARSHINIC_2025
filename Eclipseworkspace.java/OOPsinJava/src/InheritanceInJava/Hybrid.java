package InheritanceInJava;
//Hybrid: one child extends to one/more interface and one parent class
//so we create a interface and a parent class. and child class which is extended to both parent interface and a parent class
//as usual abstract method in interface which we override in childcalss using @override i.e implemets and we extend child to parent class and create 2 methods, 1 from interface 
// now using child class we can call all 3 methods - interface, parent and child methods
interface ParentInterface{
	public void ParentInterfaceMethod();
}
interface Parent2Interface{
	public void interface2method();
}

class ParentHybrid{
	public void ParentHybridMethod() {
		System.out.println("This is Parent Class");
	}
}

class ChildHybrid extends ParentHybrid implements ParentInterface , Parent2Interface{
	public void ChildParentClass() {
		System.out.println("This is child and parent class method");
	}
	
	@Override
	public void ParentInterfaceMethod() {
		System.out.println("This is Child and parent interface method");	
	}

	@Override
	public void interface2method() {
		System.out.println("This is child and parent 2nd interface method");
	}
}



public class Hybrid {

	public static void main(String[] args) {
		ChildHybrid child = new ChildHybrid();
		child.ChildParentClass();
		child.ParentInterfaceMethod();
		child.interface2method();
		child.ParentHybridMethod();
	}

}
