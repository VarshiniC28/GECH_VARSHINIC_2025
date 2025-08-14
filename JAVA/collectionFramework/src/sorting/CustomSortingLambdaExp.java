package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Sorting10 implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		
		return id1.compareTo(id2);
	}
	
}


class Employee2 { 
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	
	public Employee2() {
		
	}
	
	public Employee2(int id, String name, int salary) {
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
}

public class CustomSortingLambdaExp  {

	public static void main(String[] args) {
		
		Employee2 e = new Employee2(0, "Varshini C", 2400000);
		Employee2 em = new Employee2(1, "Varshini C", 24000000); 
		
		//Lambda expression to functional interface(for security), Integer.valueOf is used because getId id int primitive type
//		Comparator<Employee2> c = (Employee2 e1, Employee2 e2) 
//						-> Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId()));
//		TreeSet<Employee2> emp = new TreeSet<Employee2>(c); 
		
		//We can also directly pass lambda expression to TreeSet(for higher security) since it has constructor that takes parameter c of type comparator
		TreeSet<Employee2> emp = new TreeSet<Employee2>((e1,e2)-> Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId())));
		emp.add(em);
		emp.add(e);
		
		System.out.println(emp); 
		
		//---------------------------ArrayList--------------------------
		
		ArrayList<Employee2> empl = new ArrayList<Employee2>();
		empl.add(em);
		empl.add(e);
		
		Collections.sort(empl, (e1,e2)-> Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId())));
		
		System.out.println(empl); 
	}

}