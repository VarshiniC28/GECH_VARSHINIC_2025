package objectOrientedProgramming.inheritance;

class GrandParent{
	float height  = 5.8f;
	void readBooks() {
		System.out.println("I love to read books");
	}
}

class Parent1 extends GrandParent{

}

class Child1 extends Parent1{
	
}

public class MultiLevel {

	public static void main(String[] args) {

		Child1 c = new Child1();
		System.out.println(c.height);
		c.readBooks();
	}

}
