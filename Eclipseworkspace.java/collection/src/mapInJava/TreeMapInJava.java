package mapInJava;

import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
		// TreeMap:
		// same as Map.
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>((a,b)-> b-a); // Sorting is based on the key
		treemap.put(1,"Three");
		treemap.put(3, "One");
		treemap.put(2, "Four");
		treemap.put(4, "Two");
		System.out.println(treemap);
		
		treemap.remove(4);
		System.out.println(treemap);
		
		System.out.println(treemap.containsKey(1));
		System.out.println(treemap.containsValue("Two"));
	}

}
