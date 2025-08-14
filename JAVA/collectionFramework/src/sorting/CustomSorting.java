package sorting;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{ //we pass Employee object which is our base here
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

//	@Override
//	public int compareTo(Employee e2) {
//		Employee e1 = this;
//		if(e1.salary>e2.salary) { //we can get without getters even if salary is private because we are accessing in the same class its declared
//			return 1;
//		}else if (e2.salary>e1.salary) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
	
	//Since we already have compareTo for Integer we can use it to compare according to ids as below
//	@Override
//	public int compareTo(Employee e2) {
//		Employee e1 = this;
//		
//		Integer id1 = e1.getId();
//		Integer id2 = e2.getId();
//		
//		return id1.compareTo(id2);
//	}
	
	//Sorting with name
//	@Override
//	public int compareTo(Employee e2) {
//		Employee e1 = this;
//		
//		String n1 = e1.getName();
//		String n2 = e2.getName();
//		
//		return n1.compareTo(n2);
//	}
	
	//to sort employees based on length of their name
	@Override
	public int compareTo(Employee e2) {
		Employee e1 = this;
		
		Integer n1 = e1.getName().length();
		Integer n2 = e2.getName().length();
		
		return n1.compareTo(n2);
	}

	//since we cant change code in compareTo for each different comparing methods, 2nd option is comparator interface
}

public class CustomSorting  {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>(); 
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar);

		Collections.sort(ar); //This calls compareTo method from Integer class which takes single object parameter and is from Comparable Interface, val1>val2 -> +ve, val1<val2 -> -ve, val1==val2 -> 0
		//Every wrapper class has compareTo method for that particular object, compareTo for Integer, Long, String...
		
		//------------------------------------------------------------
		
		//Our own class Object - complex object
		Employee e = new Employee(1, "Varshini C", 2400000);
		Employee em = new Employee(2, "Sanjay C", 2400000);
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(em);
		emp.add(e);
		
		System.out.println(emp); //return address of e and em if toString() is not used
		
		//Now to sort the employees based then their salaries
		Collections.sort(emp); //we have to make our own compareTo , to that make Employee class implement functional Interface Comparable(where compareTo is abstract method) and override the compareTo method and make it our own implementation
		
		System.out.println(emp);
		
	}

}
