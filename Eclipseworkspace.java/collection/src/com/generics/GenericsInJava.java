package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {

	public static void main(String[] args) {
		/*
		 * GENERICS:
		 * ========
		 * => To provide the type safety and to avoid the type casting in collection than we should go for generic.
		 * */
		
		char [] arr = {'a','b','c'}; //Type safety
		char FirstEle = arr[0]; //Without type casting
		System.out.println(FirstEle);
		
		//Without generics, i.e without type safety.
		//Here List is interface , and ArrayList() is a class so we call it Like this ArrayList().
		List arr1 = new ArrayList(); //There is no type safety.
		arr1.add(12);
		arr1.add(10.56);
		arr1.add("Hello");
		System.out.println(arr1);
		
		int value = (int) arr1.get(0); // explicit type casting.
		System.out.println(value);
		
		System.out.println("-----------------------------------------------");
		
		//Generic : to add type safety we decalre the Object type Integer, Double etc.. within <>. which was in Java 8 . lateron removed or became optional.
		//Java 8 syntax: for (Generic) collection.
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(120); //1
		//list.add(10.25); 
		System.out.println(list);
		
		int a = list.get(1); //There is no concept of type casting beacuse we have declared that all elements are Integers. 
		System.out.println(a);
	}

}
