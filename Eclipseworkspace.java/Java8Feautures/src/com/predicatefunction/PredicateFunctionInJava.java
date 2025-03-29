package com.predicatefunction;

import java.util.function.Predicate;

public class PredicateFunctionInJava {

	public static void main(String[] args) {
		// PREDICATE
		
		/*
		 * it holds the condition 
		 */
	
		// need to find the number is even or not
		//predicate is a funtcional interface that is uses lambda expression to hold/return a condition that can be used to test later using boolean test method.
		Predicate<Integer> p = (a)-> a%2==0;
		System.out.println(p.test(34));// boolean test is a method in predicate functional interface that checks if the given condition is true.
	}

}