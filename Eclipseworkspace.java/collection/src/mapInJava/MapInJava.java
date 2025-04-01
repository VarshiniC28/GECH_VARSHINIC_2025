package mapInJava;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
	public static void main(String[] args) {

		/*
		 * 🔹 MAP INTERFACE:
		 * =====================
		 * ✅ A `Map` represents a collection of key-value pairs.
		 * ✅ Keys must be UNIQUE (Duplicates are NOT allowed).
		 * ✅ Values can be DUPLICATE.
		 * ✅ Each key maps to exactly one value.
		 * ✅ It does NOT follow any insertion order (unless using LinkedHashMap).
		 * ✅ Implements the `Map` interface (not `Collection`).
		 *
		 * 🔹 COMMONLY USED MAP IMPLEMENTATIONS:
		 * =====================================
		 * 🔸 `HashMap<K, V>`      - Unordered, allows one `null` key, multiple `null` values.
		 * 🔸 `LinkedHashMap<K, V>` - Preserves insertion order.
		 * 🔸 `TreeMap<K, V>`      - Sorted based on keys (uses Red-Black Tree, `O(log n)`).
		 * 🔸 `Hashtable<K, V>`    - Thread-safe version of `HashMap` (but slower).
		 */

		// ✅ Creating a HashMap (Key: Integer, Value: String)
		Map<Integer, String> map = new HashMap<>();

		// ✅ Adding key-value pairs using put()
		map.put(1, "ONE");
		map.put(1, "TEN"); // ✅ Same key, value "ONE" is replaced by "TEN"
		map.put(3, "TWO");
		map.put(4, "THREE");

		// ✅ Printing the Map (No guarantee of insertion order)
		System.out.println("Initial Map: " + map); // Output: {1=TEN, 3=TWO, 4=THREE}

		// ✅ Removing a key-value pair
		map.remove(3); // Removes key 3
		System.out.println("After Removing Key 3: " + map); // Output: {1=TEN, 4=THREE}

		// ✅ Checking if a key exists
		System.out.println("Contains Key 3? " + map.containsKey(3)); // false

		// ✅ Checking if a value exists
		System.out.println("Contains Value 'THREE'? " + map.containsValue("THREE")); // true

		/*
		 * 🔹 Important Map Methods:
		 * ============================
		 * ✅ put(K key, V value)  - Inserts or updates a key-value pair.
		 * ✅ get(K key)           - Returns the value for a given key.
		 * ✅ remove(K key)        - Removes the mapping for a key.
		 * ✅ containsKey(K key)   - Checks if the map contains a key.
		 * ✅ containsValue(V val) - Checks if the map contains a value.
		 * ✅ keySet()             - Returns all keys as a Set.
		 * ✅ values()             - Returns all values as a Collection.
		 * ✅ entrySet()           - Returns all key-value pairs as a Set of Map.Entry.
		 */

		// ✅ Getting a value by key
		System.out.println("Value for Key 1: " + map.get(1)); // TEN

		// ✅ Iterating through keys
		System.out.println("\n🔹 Iterating through keys:");
		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

		// ✅ Iterating through key-value pairs
		System.out.println("\n🔹 Iterating through key-value pairs:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// ✅ Getting all values
		System.out.println("\nAll Values: " + map.values());
	}
}
