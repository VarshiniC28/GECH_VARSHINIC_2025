package objectOrientedProgramming.inheritance;

//Mixture of 2 different types of inheritance

// Here it is Mixture of single level and Hierarchical inheritance 

class GrandParent11{
	float height  = 5.8f;
	void readBooks() {
		System.out.println("I love to read books");
	}
}

class Parent11 extends GrandParent11{

}

class Child11 extends Parent11{
	
}

class Child22 extends Parent11{
	
}

class Child33 extends Parent11{
	
}


public class HybridLevel {

	public static void main(String[] args) {

		Child11 c = new Child11();
		System.out.println(c.height);
		c.readBooks();
		
		Child22 ch = new Child22();
		System.out.println(ch.height);
		ch.readBooks();
		
		Child33 chi = new Child33();
		System.out.println(chi.height);
		chi.readBooks();
		
	}

}
