package legacy.classes;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(10);
		s.push(11);
		s.push(23);
		
		System.out.println(s); //10 11 23 //not 23 11 10 //way of displaying is not appreciated and hence LinkedList or ArrayDeque is best for Stack
		System.out.println(s.pop()); //23
	}

}
