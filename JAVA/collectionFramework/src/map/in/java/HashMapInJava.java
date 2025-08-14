package map.in.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {

	public static void main(String[] args) {

		//Collection with key and value pair
		Map<String, Integer> m = new HashMap<>();
		m.put("ammu", 100);
		m.put("amu", 100);
		m.put("mu", 100);
		m.put("ammu", 1000); //key should be unique, if we try to add same key again the value will be replaced by 1000
		System.out.println(m);
		
		//get value by key
		System.out.println(m.get("ammu"));
		
		//To get all keys - keySet()
		System.out.println(m.keySet());
		
		//for each loop
		for(String key: m.keySet()) {
			System.out.println(key+": "+ m.get(key)); //get(key)- gives us values
		}
		
		System.out.println(m.values()); 
		
		//Hashtable same as hash map expect hashtable is synchronized
	}

}
