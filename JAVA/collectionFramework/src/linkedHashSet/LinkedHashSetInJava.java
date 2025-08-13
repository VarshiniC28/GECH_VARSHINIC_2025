package linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {

		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(10); //no duplicates
		set.add(2);
		set.add("Ammu"); //allows heterogeneous data
		set.add(23);
		set.add(100);
		set.add(null);
		
		//Difference between hashSet and LinkedHashSet is that linked hash set maintains insertion order, not random o/p
		
		System.out.println(set);
	}

}
