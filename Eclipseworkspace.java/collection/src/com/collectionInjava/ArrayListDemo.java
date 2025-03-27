package com.collectionInjava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * ARRAY LIST:
		 * ===========
		 * => ArrayList is a improved version of an array(dynamic array)
		 * => ArrayList underline a data structure called Dynamic array => means array can grow or shrink.
		 * => Arraylist allows duplicate.
		 * => ArrayList allow random acces i.e can access any elements througout the array using index number.
		 * => ArrayList will allow null values.
		 * => ArrayList will preserve the order of insertion similar to lists.
		 * */
		
//		Arraylist is accepting a generic value Integer here.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(34);
		list.add(12);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(34);
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list);
		
		Integer i = 34; //  declaring a var that has 34 . so we can remove 34 using i variable.
		list.remove(i);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}
