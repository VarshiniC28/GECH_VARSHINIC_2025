package array.deque;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDequeInJava {

	public static void main(String[] args) {

		//Array deque - Array Double end queue
		
		ArrayDeque arr = new ArrayDeque();
		arr.add(10);
		arr.add(11);
		arr.add(13);
		arr.add(10); //duplicates are allowed
		//arr.add(null); //null insertion not allowed - NullPointerException
		arr.add("Ammu"); //can add heterogeneous data
		arr.addFirst(1);;
		arr.addLast(2);
		
		System.out.println(arr);
		
		//Different ways of accessing elements in Array deque

		//1. for loop: not possible since it has no indexing
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get);
//		}
		
		//2. for each loop : no indexing still works because 
		for(Object e: arr) {
			System.out.println(e);
		}
		
		//3. Iterator:
		Iterator cursor = arr.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		//4. List Iterator - this is not possible because this is only for classes those implement List interface, and queue is not list
//		ListIterator cursor1 = arr.listIterator();
			
		//5. Descending Iterator - this will traverse in both backward and forward direction, pointer will be at last by default and we say hasNext()- it moves in backward direction - hasNext will work like hasPrevious()
		Iterator cursor2 = arr.descendingIterator();
		while(cursor2.hasNext()) { //hasNext() works like hasPreviuos
			System.out.println(cursor2.next());
		}
		
	
	}

}
