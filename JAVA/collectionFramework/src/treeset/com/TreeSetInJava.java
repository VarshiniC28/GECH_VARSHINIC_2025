package treeset.com;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(20);
		//set.add("Vars"); //Heterogeneous data is not allowed - ClassCastException
		set.add(75);
		set.add(6);
		set.add(6); //duplicates are not allowed
		
		//set.add(null); //null insertion is not allowed - NullPointerException
		
		System.out.println(set); //Will give us in sorted order - ascending
		
		//	• Internal Data Structure is Red black tree / Binary search tree

		//Tree traversals - in-ordeer traversal, pre-oder traversal , post-order traversal
		//tree set used in-order traversal - LVR
		
		//Methods
		System.out.println(set.first()); //returns smallest number since treeset is sorted
		System.out.println(set.last()); //returns largest number
		
		System.out.println(set.headSet(6)); //returns elements less than or left of 6(excluding if present in set)
		System.out.println(set.headSet(6, true)); //returns elements less than 6 including 6 when boolean argument is given true, excludes if given false
		
		System.out.println(set.tailSet(20)); //returns elements greater than 20 including 20
		System.out.println(set.tailSet(20, false)); //returns elements greater than 20 excluding 20 if boolean set to false
		
		System.out.println(set.descendingSet());//gives descending order sorted set
		
		System.out.println(set.subSet(6, 75));// returns subset form 6 to 75(exclusive)
		System.out.println(set.subSet(2, false, 75, true)); //returns subset from 2 to 75 - whether inclusive or not is based on boolean argument given 
		
		System.out.println(set.ceiling(7)); //returns smallest element i.e greater than or equal to 7 - //20 is the smallest element which is greater than 7
		System.out.println(set.floor(3)); //returns largest element i.e smaller than or equal to 3 - //2 is the largest which is smaller than 3
		
		System.out.println(set.higher(2)); //returns the 1st higher value than given element 2 even if given element is present //6
		System.out.println(set.lower(7)); //returns the 1st lower value than given element 7 even if given element is present or not //6
		
		System.out.println(set);
	}

}
