package EncapsulationInJava;

class Student {
	private String name;
	private int age;
	private double marks;

	// Getter and Setter for Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter for Age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) { // Ensuring valid age
			this.age = age;
		} else {
			System.out.println("Age must be positive!");
		}
	}

	// Getter and Setter for Marks
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		if (marks >= 0 && marks <= 100) { // Ensuring valid marks range
			this.marks = marks;
		} else {
			System.out.println("Marks should be between 0 and 100!");
		}
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		// Encapsulation:
		/*
		 * Encapsulation is a mechanism that binds the data (variables) and methods that
		 * manipulate the data into a single unit (class).
		 *
		 * - All fields (variables) should be private to restrict direct access. - We
		 * provide public getter and setter methods to control access. - This helps in
		 * data hiding and protects the integrity of the data. 
		 * (or) 
		 * -Every feilds must be private when we wnat to protect data ,so we use encapsulation and create
		 * getters and setters to make it public so that we can set and get the data
		 * ourselves when we create object
		 *
		 * => Even if we don't define a constructor, Java provides a default no-argument
		 * constructor when an object is created.
		 */

		Student student = new Student();

		// Setting values using setter methods
		student.setName("Varsha");
		student.setAge(20);
		student.setMarks(85.5);

		// Getting values using getter methods
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());
		System.out.println("Student Marks: " + student.getMarks());
	}
}
