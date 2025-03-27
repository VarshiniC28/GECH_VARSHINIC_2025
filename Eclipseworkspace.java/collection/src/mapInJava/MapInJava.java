package mapInJava;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
	public static void main(String[] args) {

		/*
		 * MAP: => When you represent a group of indiviual object as a single entity in
		 * the form of key value pair then we should use map interface.
		 * 
		 */
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ONE");
		map.put(1, "TEN"); //same key value, so the ONE is replaced by TEN
		map.put(3, "TWO");
		map.put(4, "THREE");
		System.out.println(map);
		
		map.remove(3); //removing operation is done through key values
		System.out.println(map);
		
		System.out.println(map.containsKey(3)); //returns true or false boolean value based on the existence of that key
		System.out.println(map.containsValue("THREE")); //returns true or false boolean value based on the existence of that value.
		
		
	}
}
