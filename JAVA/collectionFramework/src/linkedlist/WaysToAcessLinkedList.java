package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class WaysToAcessLinkedList {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(2);
		
		li.add(2, 500);
		
		System.out.println(li);
		
		//different way of accessing the elements in linked list - even though it has no indexing internally it keeps counter and keeps counting
		//1. for loop
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println("------------------------------------------");
		
		//2. for each loop
		for(Object e: li) {
			System.out.println(e);
		}
		
		System.out.println("------------------------------------------");
		
		//3. Iterator - can move in forward direction only
		Iterator cursor = li.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		System.out.println("------------------------------------------");
		
		System.out.println("List Iterator(child interface) extends Iterator(parent interface) - hasNext(), next() are inherited to ListInterface and previous(), hasPrevious() - specialized methods in list iterator");
		
		//4. ListItertor - can move in both forward and backward direction
		ListIterator cursor2 = li.listIterator(li.size());
		while(cursor2.hasNext()) {
			System.out.println(cursor2.next());
		}
		
		while(cursor2.hasPrevious()) {
			System.out.println(cursor2.previous());
		}
		System.out.println("------------------------------------------");
	}
}
