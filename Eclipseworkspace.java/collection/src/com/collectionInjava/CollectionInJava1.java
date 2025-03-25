package com.collectionInjava;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInJava1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Collection --> root interface in collection framework
		 * Collections --> it will provide some of the utility methods to work with collection.
		 * 
		 * COLLECTION:
		 * ===========
		 * => When you represent a group of indiviual object as a single entity then we should go for collection
		 * => Root interface in collection framework.
		 * => This will provide some of the built-in methods to work with any collection class.
		 * 
		 * */
		
		//collection has lists , queue, sets
		//Lists - ArrayList, Linkedlist, vector , stack, these are used within , collection used in all lists , queues , sets
		//collection is an object which has bultin types like ArrayList()(-Can take multiple data types)(same as python's List)
		//Here we are creating a collection - arraylist
		//for this arraylist collection we can perform operations like add,remove or clear all elements in array.
		Collection collection = new ArrayList();
		
		//in collection there is toString() method autoamtically when we import , so we can print with object name directly.
		collection.add(10);
		collection.add("name");
		collection.add(10.23);
		System.out.println(collection);
		
		collection.remove(10);
		System.out.println(collection);
		
		collection.clear();
		System.out.println(collection);
	}

}
