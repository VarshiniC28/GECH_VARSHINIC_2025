package treeset.com;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class AccessingWaysInTreeSet {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		set.add(10);
		set.add(90);
		set.add(100);
		set.add(1);
		set.add(15);
		
		System.out.println(set);
		
		//Different ways of accessing elements in tree set
		//1. for loop : Not possible since tree set has no indexing
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(s);
//		}
		
		//2. For each loop
		for(Object e: set) {
			System.out.println(e); //prints sorted order
		}
		
		//3. Iterator
		Iterator cursor = set.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		//List Iterator: clearly this is not set - so not possible
//		ListIterator cursor0 = set
		
		//5. DescendingIterator method in Iterator interface
		Iterator cursor1 = set.descendingIterator();
		while(cursor1.hasNext()) {
			System.out.println(cursor1.next()); //prints descending sorted order
		}
	}

}
