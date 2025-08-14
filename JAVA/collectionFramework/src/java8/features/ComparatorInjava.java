package java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class funinterface implements Comparator<Integer> { // comparator is a built in functional interface , our class is
													// implementing to that interface and implementing the method the compare

	@Override
	public int compare(Integer o1, Integer o2) {
//		return o1 - o2;
		//or
		return o2.compareTo(o1); //asc
		//or
//		return -1 * o1.compareTo(o2);
	}

}

public class ComparatorInjava {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(30);
		list.add(2);
		list.add(130);
		Collections.sort(list, new funinterface()); // calling our class funinterface that has the method compare thats
													// sorting from o1 to o2
		System.out.println(list);

		Collections.sort(list, (a, b) -> a - b); // performing sorting on the list using lamda expression ,
													// since comparator is a functional interface.
													//  we have to pass 2 parameters to that sort method i.e 1 is list and the other is lamda expression for sorting.
	}

}
