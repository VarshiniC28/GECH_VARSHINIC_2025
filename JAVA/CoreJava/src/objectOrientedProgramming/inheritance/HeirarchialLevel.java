package objectOrientedProgramming.inheritance;

class ParentA{
	float height  = 5.8f;
	void readBooks() {
		System.out.println("I love to read books");
	}
}

class ChildA extends ParentA{

}

class Child2 extends ParentA{
	
}

class Child3 extends ParentA{
	
}

public class HeirarchialLevel {

	public static void main(String[] args) {

		ChildA c = new ChildA();
		System.out.println(c.height);
		c.readBooks();
		
		Child2 ch = new Child2();
		System.out.println(ch.height);
		ch.readBooks();
		
		Child3 chi = new Child3();
		System.out.println(chi.height);
		chi.readBooks();
		
	}

}
