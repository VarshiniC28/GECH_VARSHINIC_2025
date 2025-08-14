package sorting;

import java.util.Comparator;
import java.util.TreeSet;

class Sorting implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		
		return id1.compareTo(id2);
	}
	
}

class Sorting1 implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		Integer sal1 = e1.getSalary();
		Integer sal2 = e2.getSalary();
		
		return sal1.compareTo(sal2);
	}
	
}

//make sorting in descending order - i.e by multiplying by -1 : which will make +ve to -ve and -ve to +ve, then -ve will swap and , +ve will No swap
class SortingDesc implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		Integer sal1 = e1.getSalary();
		Integer sal2 = e2.getSalary();
		
		return -1*sal1.compareTo(sal2);
	}
	
}

class SortingName implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		String n1 = e1.getName();
		String n2 = e2.getName();
		
		return n1.compareTo(n2);
	}
	
}

//sorting so that if name is same of 2 employees then we should compare with id
class Sorting2 implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		String n1 = e1.getName();
		String n2 = e2.getName();
		
		if(n1.equals(n2)) { //even if we use n1 == n2 still works the same because we care comparing both refs which is not created using new keyword, hence in SCP - duplicates are not allowed
			Integer id1 = e1.getId();
			Integer id2 = e2.getId();
			
			return id1.compareTo(id2);
		}else {
			return n1.compareTo(n2);
		}
	}
	
}

//compare names, if same compare salaries, if same compare id
class SortingC implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		String n1 = e1.getName();
		String n2 = e2.getName();
		
		if(n1.equals(n2)) { //even though salary is integer we are comparing using equals() because we are comparing object- Integer not int
			Integer s1 = e1.getSalary();
			Integer s2 = e2.getSalary();
			
			if(s1.equals(s2)) {
				Integer i1 = e1.getId();
				Integer i2 = e2.getId();
				
				return i1.compareTo(i2);
			}else {
				return s1.compareTo(s2);
			}
		}else {
			return n1.compareTo(n2);
		}
	}
}

class Employee1 { 
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	
	public Employee1() {
		
	}
	
	public Employee1(int id, String name, int salary) {
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



	//since we can't change code in compareTo for each different comparing methods, 2nd option is function interface - comparator interface - compare() method which takes 2 parameters
	//we shouldn't use our main class to implement Comparator interface, we have to create separate class to implement it
}

public class CustomSorting2  {

	public static void main(String[] args) {
		
		//By default sorting order is ascending
		Sorting s = new Sorting(); // we have to say this is our sorting to tree set by passing s to tree set which will call internally compare which is inside Sorting.
		Sorting1 s1 = new Sorting1(); //salary sorting ,pass the ref to tree set 
		SortingDesc s2 = new SortingDesc();
		SortingName s3 = new SortingName();
		Sorting2 s4 = new Sorting2();
		SortingC s5 = new SortingC();
		
		//Our own class Object - complex object
		Employee1 e = new Employee1(1, "Varshini C", 2400000);
		//Employee1 em = new Employee1(2, "Sanjay C", 2400000);
		Employee1 em = new Employee1(2, "Varshini C", 24000000); //when name is same and we compare based on name, then as per set properties , duplicate are not allowed and Will return only one
		
//		TreeSet<Employee1> emp = new TreeSet<Employee1>(s); //TreeSet(Comparator<? super E> comparator), s will be given to comparator
		//We can sort the employees based on salary and name also, for that we dont have to change the method like we did for Comparable - compareTo,
		//In this Comparator interface, we can implement other class to comparator and write custom sorting for Salary, or names. and pass that here
		
//		TreeSet<Employee1> emp = new TreeSet<Employee1>(s1);//sorting based on salary - if salary same returns only one since duplicates are not allowed.
//		TreeSet<Employee1> emp = new TreeSet<Employee1>(s2); //sorting salary but descending
//		TreeSet<Employee1> emp = new TreeSet<Employee1>(s3);//sorting based on name - if name same , will return 1 because no duplicates allowed
//		TreeSet<Employee1> emp = new TreeSet<Employee1>(s4);
		TreeSet<Employee1> emp = new TreeSet<Employee1>(s5); //sort if name same on salary, salary same compare ids
		emp.add(em);
		emp.add(e);
		
		System.out.println(emp); //return address of e and em if toString() is not used
		//Collections.sort(emp); //no need of sort since tree set will order itself
		//System.out.println(emp);
		
	}

}