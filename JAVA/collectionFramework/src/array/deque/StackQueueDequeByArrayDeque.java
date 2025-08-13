package array.deque;

import java.util.ArrayDeque;

public class StackQueueDequeByArrayDeque {

	public static void main(String[] args) {

		//Stack:
		ArrayDeque arr = new ArrayDeque();
		arr.push(1);
		arr.push(11);
		arr.push(12);
		
		System.out.println(arr);//stack is created - Last element displayed first, since it will be the first one to be out
		System.out.println(arr.pop()); //12 //last element is removed first
		
		//-------------------------------------------------
		
		//Queue:
		ArrayDeque ar = new ArrayDeque();
		ar.add(1);
		ar.add(11);
		ar.add(12);
		
		System.out.println(ar);//
		System.out.println(ar.pop()); //1 - first element will be removed
		
		//--------------------------------------------------------
		
		//Deque:
		ArrayDeque a = new ArrayDeque();
		a.addFirst(1);
		a.add(11);
		a.addLast(12);
		
		System.out.println(a);
		System.out.println(a.pop()); //1 
		
	}

}
