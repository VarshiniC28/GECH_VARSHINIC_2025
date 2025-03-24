package InheritanceInJava;

class GrandParentClass{
	public void GrandParentMethod() {
		System.out.println("This is Grand Method");
}
}
class ParentClass extends GrandParentClass{
	public void ParentMethod() {
		System.out.println("This is Parent Method");
	}
}
class ChildClass extends ParentClass{
	public void ChildMethod() {
		System.out.println("This is Child method");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		//from parentclass we can acess two methods
		// from child class we can access all 3 methods as we are extending
		child.GrandParentMethod();
		child.ParentMethod();
		child.ChildMethod();
	}

}
