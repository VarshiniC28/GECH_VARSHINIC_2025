package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListIntro2 {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);

		LinkedList li = new LinkedList(arr); //Constructor polymorphism- When you pass arr (child) to the constructor parameter (Collection c) (parent), polymorphism happens. Parent type reference → Child object = upcasting
		//loose coupling Collection c = new ArrayList() - this is what happens
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		System.out.println(li);
		
		
	}

}
