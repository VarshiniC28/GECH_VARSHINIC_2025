package objectOrientedProgramming; // Package declaration

import java.util.Scanner; // Import Scanner for user input

// Define the Employees class with private variables to apply encapsulation
class Employees {
	private int Id;          // Employee ID (private - encapsulated)
	private String name;     // Employee name (private - encapsulated)
	private int salary;      // Employee salary (private - encapsulated)

	// No-argument constructor (required for Bean or POJO rules)
	public Employees() {
	}

	// Parameterized constructor (optional - helps set values while creating object)
	public Employees(int id, String name, int salary) {
		Id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getter and Setter methods for each field - provide controlled access
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

// Main class for testing encapsulation by storing multiple employee details
public class EncapsulationExercise {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Create Scanner object to read input
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();    
		sc.nextLine();           

		Employees[] storage = new Employees[n];  // Create array to store 'n' employee objects

		// Loop to read each employee's details
		for(int i = 0; i < n; i++) {
			Employees e = new Employees();  // Create a new Employee object

			System.out.println("Enter the details:"); // Prompt to enter employee info
			// Expected input: id,name,salary e.g., 1,Tim,10000
			String details = sc.nextLine(); // Read the line as a whole

			String arr[] = details.split(","); // Split the string by comma into array

			// Set individual fields using setter methods
			e.setId(Integer.parseInt(arr[0]));     // Convert id to int and set
			e.setName(arr[1]);                     // Set name directly
			e.setSalary(Integer.parseInt(arr[2])); // Convert salary to int and set

			storage[i] = e; // Store the employee object in the array
		}

		// Loop to print all stored employee details
		for(int i = 0; i < storage.length; i++) {
			//System.out.println(storage[i]);            // Prints object address (hashcode) of e 
			System.out.print(storage[i].getId());     // Print ID
			System.out.print(storage[i].getName());   // Print name
			System.out.print(storage[i].getSalary()); // Print salary
		}

	}
}
