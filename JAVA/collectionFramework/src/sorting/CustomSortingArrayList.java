package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CustomSortingArrayList  {

	public static void main(String[] args) {
		
		//By default sorting order is ascending
		Sorting s = new Sorting(); 
		Sorting1 s1 = new Sorting1(); 
		SortingDesc s2 = new SortingDesc();
		SortingName s3 = new SortingName();
		Sorting2 s4 = new Sorting2();
		SortingC s5 = new SortingC();
		
		Employee1 e = new Employee1(1, "Varshini C", 2400000);
		//Employee1 em = new Employee1(2, "Sanjay C", 2400000);
		Employee1 em = new Employee1(2, "Varshini C", 2400000);
		
		ArrayList<Employee1> emp = new ArrayList<Employee1>(); 
		emp.add(em);
		emp.add(e);
		
		//Since ArrayList has no constructor that takes Comparator as parameter,
		//we must use Collections.sort(emp, ) - which has constructor that takes Comparator - public static <T> void sort(List<T> list, Comparator<? super T> c) 
		Collections.sort(emp, s5); //sort method is overloaded
		
		System.out.println(emp); 
		
	}

}