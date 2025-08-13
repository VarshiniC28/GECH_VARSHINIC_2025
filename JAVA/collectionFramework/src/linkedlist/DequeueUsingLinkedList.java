package linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class DequeueUsingLinkedList {

	public static void main(String[] args) {
		
		//Dequeue - Double ended q - can add and remove elements from both sides - from this is why and where linked list got addFirst and last , removeFirst and last : To add and remove elements on both sides

		LinkedList li = new LinkedList(); //it already behaves like queue
		
		li.addFirst(10); //10
		li.addFirst(20); //20 10
		li.addLast(30); //20 10 30

		System.out.println(li); 
		
		System.out.println(li.removeFirst()); //10
		
		System.out.println(li);
		
	}

}
