package linkedlist;

import java.util.LinkedList;

public class LinkedListIntro {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(10);
//		li.add(null);
//		li.add(10);
//		li.add(null);
		li.add(20);
		li.add(30);
		li.add(40);
		li.addFirst(1);
		li.addLast(2);
		li.removeFirst();
		System.out.println(li.removeLast()); //will print the removed last object
		
		System.out.println(li.peek()); //10 - gives first element but doesnt remove
		System.out.println(li.peekFirst()); //gives first element - prints
		System.out.println(li.peekLast()); //gives last element - prints
		
		System.out.println(li.poll()); //10 - gives first element but removes and it returns that removed object
		System.out.println(li.pollFirst()); //removes and prints the first element
		System.out.println(li.pollLast()); //removes and prints the last element
		
		li.offer(100); //same as add() but offer() returns false instead of throwing an exception if capacity is full 
		
		System.out.println(li);
		
		
	}

}
