package concrete_pojo;

class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class pojoclass {

	public static void main(String[] args) {
		/*
		 * POJO CLASS: =========== *plain old java object(POJO);
		 * 
		 * RULES: 1. The class should not extend or implement to any class or interface.
		 * 2. Every feilds(states/properties) should be private 
		 * 3. All-args constructor
		 * 4. No-args Constructor 
		 * 5. toString() 
		 * 6. Getter and setter public methods.
		 */

		/*
		 * 💡 What is a POJO Class? A POJO (Plain Old Java Object) is a simple Java
		 * class that only contains: 
		 * ✔ Private variables (fields) to store data 📌 
		 * ✔Public getter & setter methods to access and modify the data 🛠 
		 * ✔ A default (no-arg) constructor and/or parameterized constructor 🏗 
		 * ✔ No business logic,no inheritance, no extra dependencies ❌
		 */

		Student std = new Student("VARSHINI C");
		System.out.println(std);

	}

}
