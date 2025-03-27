package com.collectionInjava;

public class CollectionInJava {

	public static void main(String[] args) {
		/*
		 * Why we need to use collections:
		 * => To overcome  the drawbacks of array we use collections.
		 * 
		 * Drawbacks of Array:
		 * 1. Fixed size -> cant change the size of array once declared.
		 * 2. Array can only store Same data type elements, cant store multi datatypes.
		 * 3. We cannot reduce the size of an array - cant shrink the array.
		 * 
		 * Advantages of array:
		 * 1. Random access.
		 * 2. type safety - the elements inside the array is based on one datatype.
		 * 3. type casting - To print the element in arrays - no need to type cast. 
		 * */
		
		char [] arr = new char[2]; // since we have already mentioned dattatype int so even if we give another datatype value it automatically type casts to int , if its char and we give int , automatically it changes as char
		arr[0] = 12;
//		arr[1] = 'h';// prints ascii value - which is a integer.
		arr[1] = 20;
		
		System.out.println((int)arr[0]); //no need of this type casting in array as we have already declared as int it automatically typecasts.
		System.out.println(arr[1]);
	}

}
