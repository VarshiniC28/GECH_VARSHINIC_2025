package linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		//Stack creation using linked list - use push() not add() , pop() not remove()

		LinkedList li = new LinkedList();
		
		li.push(10);
		li.push(1);
		li.push(20);
		li.push(3);
		
		System.out.println(li); //3 20 1 10 //The last will be the first to come out hence its at first
		
		li.pop();
		System.out.println(li); //20 1 10 //3 is removes - Last in First Out
	}

}
