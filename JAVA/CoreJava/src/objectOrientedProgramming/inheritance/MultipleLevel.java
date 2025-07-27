package objectOrientedProgramming.inheritance;

class ParentC{
	float height  = 5.8f;
	void readBooks() {
		System.out.println("I love to read books");
	}
}

class ParentB{
	float height  = 5.8f;
	void readBooks() {
		System.out.println("I love to read books");
	}
}

//class Child21 extends ParentC, ParentB{
//	//Not possible in java 
//}

public class MultipleLevel {

	public static void main(String[] args) {

		//Multiple/Diamond/Diamond path Inheritance/Diamond Problem : one child inheriting from multiple classes which is not possible in java
		
		//Called as diamond because:
		//Even when we dont extend a class to any other class, JVM by itself will extend to a class called Object Class which is a root/parent class that every class in Java inherits.
		// ParentC and Parent B will extend to Object, and Child21 extends to ParenrC and ParentA, which creates diamond shape, hence called diamond problem.
		
		//Equals() method is not from String but actually from Object class.MultiLevel.java
	}

}
