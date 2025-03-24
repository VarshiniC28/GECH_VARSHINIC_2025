package InheritanceInJava;

//Heirarchial Inheritance : here one parent class and there are 2 child classes 
// and each child class is extended to the parent class.
// so child 1 has parent and child1method and child2 also has parent and child2method

class Parent1{
	public void ParentMethod() {
		System.out.println("This is Parent Method");
	}
}
class Children1 extends Parent1{
	public void Children1method() {
		System.out.println("This is Child 1");
	}
}

class Children2 extends Parent1{
	public void Children2method() {
		System.out.println("This is Child2 ");
	}
}
public class Heirarchial {

	public static void main(String[] args) {
		Children1 child1 = new Children1();
		child1.ParentMethod();
		child1.Children1method();
		
		Children2 child2 = new Children2();
		child2.ParentMethod();
		child2.Children2method();
		
	}

}
