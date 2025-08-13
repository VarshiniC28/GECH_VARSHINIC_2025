package linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		
		//Queue(FIFO/LILO) creation using linked list - use  not add() ,  removeFirst() , removeLast()

		LinkedList li = new LinkedList(); //it already behaves like queue
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		System.out.println(li); 
		
		System.out.println(li.removeFirst()); //10
		
		System.out.println(li);
		
	}

}
