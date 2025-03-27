package com.collectionInjava;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

	public static void main(String[] args) {

		/*
		 * Lists: ====
		 * 
		 * => Its a child interface of collection. 
		 * => It will contain some of the builtin methods that used inside a list implemented classes only. 
		 * => When you represent a group of indiviual object as a single entity where order is
		 * preserved and index based access and duplicate is allowed.
		 * => In collection> list converts the data give automatically from primitive dattatype to Object called as autoboxing.
		 */
		//Here List is interface , and ArrayList() is a class so we call it Like this ArrayList().
		// On ArrayList() ctrl + hover + click
		List list = new ArrayList();
		list.add(2); // index 0 //automatically its object i.e Integer not int => Autoboxing
		list.add("Hello"); //index 1
		list.add(10.67); //2
		System.out.println(list);
		
		//In array we know what datatype the elements are , but in collection we dont know
		//There will be type mismatching , cant convert object(list element) to string or int(data type) error will occur . 
		//as list element is object but if we wnat to strore that object element in a variable like str/int var_name = we need to convert object to primitive datatype.
		String str = (String) list.get(1); // to get a particular index value we use get and convert object to string
		System.out.println(str);
		
		double value = (double) list.get(2); //converting object Double to primitive data type double 
		System.out.println(value);
	}

}
