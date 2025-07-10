package variables;

class Car{ //class is blueprint of the object which has state and properties 
	//Instance variables declared in class instantiated through object
	String name;
	int noOfSeats;
	float cost;
}


public class PassbyValue_PassByReference {

	public static void main(String[] args) {

		//Pass By value:
		int c = 1000; //Also called value type assignment
		int b;
		b = c; //Here assigning the value of c to b is called VALUE TYPE ASSIGNMENT.
		System.out.println(c); //1000
		System.out.println(b); //1000
		
		b=2000; //This is also called value type assignment
		System.out.println(c); //1000
		System.out.println(b); //2000
		
		
		System.out.println("------------------------------------");
		
		// Pass by reference:
		Car a = new Car();  // JVM creates an object of class Car and assigns its address to reference variable 'a'
		// Object is an instance of a class

		// To assign values to the instance variables, we go to the object via its reference variable 'a'
		a.name = "Suzuki";
		a.noOfSeats = 4;
		a.cost = 43000f;

		System.out.println(a.name);  // Suzuki

		// We can create more than one reference for the same object
		Car d; // To make 'd' refer to the same object as 'a', assign 'a' to 'd'
		// 'a' holds the object's address, so now 'd' will point to the same object
		d = a;  // This is called pass by reference or reference type assignment (assigning address to another reference)

		d.name = "KIA";           // Changes the 'name' of the object both 'a' and 'd' refer to
		System.out.println(d.name); // KIA → updated value printed
		System.out.println(a.name); //KIA //Because both a and d point to the same object!
	}

}
