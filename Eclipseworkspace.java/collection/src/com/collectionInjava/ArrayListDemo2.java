package com.collectionInjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(12);
		list.add(10);
		list.add(100);
		System.out.println("Before: " +list);
		
		/*COLLECTIONS:
		 * Its a utility classes that provide methods to work with collection.
		 * */
		
		//1. SORT:
		Collections.sort(list);
		System.out.println("After Sorting:"+list);
		
		//2. min and max in list
		System.out.println("Min value: " + Collections.min(list));
		System.out.println("Max Value: " + Collections.max(list));
		
		//3. reverse()
		Collections.reverse(list);
		System.out.println("Reverse of array:" +list);

	}

}
