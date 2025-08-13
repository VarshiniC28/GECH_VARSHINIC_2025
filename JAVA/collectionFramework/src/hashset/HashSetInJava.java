package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {

	public static void main(String[] args) {

		HashSet h =new  HashSet();
		h.add(1);
		h.add(101);
		h.add(15);
		h.add(75);
//		h.add(75);//not allowed
		h.add(null); //allowed
		h.add("Ammu"); //allows heterogeneous data
		
		System.out.println(h); //no fixed order, no duplicates

		//for loop // not possible since no indexing
		for (int i = 0; i < h.size(); i++) {
		}
		
		//for each loop
		for(Object e: h) {
			System.out.println(e);
		}
		
		//Iterator
		Iterator cursor = h.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		//ListIterator- clearly no a list
		
		//Descending iterator - no fixed order, since random order not possible
		
	}

}
