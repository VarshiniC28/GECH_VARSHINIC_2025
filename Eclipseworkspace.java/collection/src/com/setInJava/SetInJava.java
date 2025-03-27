package com.setInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInJava {

	public static void main(String[] args) {
		/*
		 * SET:
		 * ====
		 * => Set is a child interface of collection.
		 * => When you represent a group of indiviual object as a single entity where the insertion order is not preserved,
		 * duplicate will not allow then we should go for set interface.
		 * 
		 * 1. Order is not preserved
		 * 2. duplicate is not allowed .
		 * 3. Random access is there.
		 * */
		
		Set<Integer> set = new HashSet<Integer>(); // Hashset is the subclass of Set.
		set.add(12); //doesnt occur twice in output as set doenst allow duplicate values.
		set.add(null);
		set.add(12);
		set.add(30);
		set.add(45);
		set.add(13);
		
		System.out.println(set);
		System.out.println(set);
		
		//when we want to delete the duplicates in list we can use set to duplicate values as below
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(34);
		list.add(12);
		list.add(24);
		list.add(34);
		list.add(13);
		System.out.println("List: "+list);
		
		Set<Integer> set1 = new HashSet<Integer>(list);
		System.out.println("Set: " +set1);

	}

}
