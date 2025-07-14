package objectOrientedProgramming;

import java.util.Scanner;

class Employee{
	private int empId;
	private String name;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

public class PojoClass {

	public static void main(String[] args) {

		//Pojo class - plain old java object
		//its a clss with private data/vars, 2 constructors i.e zero and parameterized constructor with getters ans setters method 
		
		//Bean class is a class which implements a empty interface Serializable  which gives
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter your employee Id");
		emp.setEmpId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter your name: ");
		emp.setName(sc.nextLine());
		
		System.out.println("Enter your salary");
		emp.setSalary(sc.nextInt());
		
		System.out.println("ID: "+emp.getEmpId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
}

}
