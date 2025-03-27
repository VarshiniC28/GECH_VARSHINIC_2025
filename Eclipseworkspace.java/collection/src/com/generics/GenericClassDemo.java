package com.generics;

//Generics means parameterized types.
//Generic type is a generic class or interface that is parameterized over types

// The idea is to allow a type(like Integer, String,etc..) to be a parameter to methods classes and interfaces that can be changed.
//or
//Using generics its possible to create classes that work with different data types

//We are creating our own generic class with our own generic value T which can be changed later 
class Student<T>{ //<> called as angle brackets.
	T student_id;

	public Student(T student_id) {
		super();
		this.student_id = student_id;
	}
	
	public T returnValue() {
		return student_id;
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// How to make our generic class like ArrayList<e> where we can change the
		// object data type of a single/same variable, whenever and wherever we want using the letter declared inside <>.
		
		Student<Integer> std1 = new Student<>(12); // was supposed to write generic values inside <> while calling but now its optional after Java8
		System.out.println(std1.returnValue());
		
		//Changing the generic type.
		Student<String> std2 = new Student<>("SANJAY C");
		System.out.println(std2.returnValue());
	
	}
	

}
