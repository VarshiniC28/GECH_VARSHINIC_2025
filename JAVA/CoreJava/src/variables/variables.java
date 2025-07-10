package variables;

class Demo{
	
//	These are instance vars since they are declared inside class and outside method
	int a;
	float b;
	boolean c;
	char d;
	
	// 🔹 Static Variable (shared by all objects)
    static String college = "ABC University";

    // 🔹 Instance Variable (unique for each object)
    String name;
    int rollNo;

    // Constructor to initialize instance variables
    public Demo(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
	
	public Demo() {
		super();
	}

	void fun() {
		//These are local vars since they are decalred inside a method
		int a;
		float b;
		char c;
		boolean d;
	}
}

public class variables {
	public static void main(String[] args) {
		
//		Variables : holders that hold the data
		
		//Instance variables : Declared inside class outside methods is instance
		// Local variables : Declared inside methods or blocks locally
		// static varibales : 
		
		//Since main is also a method these below vars are also local variables.
		int x = 10;
		float y = 1.1f;
		char z = 'a';
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		Demo de = new Demo();
		// Here de is reference variable for the object
		
//		de.a=100;
//		de.b=100.0f;
//		de.c = true;
//		de.d = 'a';
		
		System.out.println(de.a); //100  //if not initialized- 0
		System.out.println(de.b); //100.0   //0.0
		System.out.println(de.c); //true    //false
		System.out.println(de.d); //a       //empty if not declared
		
	}
}
