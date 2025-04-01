package mapInJava;

import java.util.TreeMap;

public class TreeMapInJava {

    public static void main(String[] args) {
        /*
         * 🔹 TreeMap in Java:
         * =======================
         * ✅ Implements the `Map` interface.
         * ✅ **Stores key-value pairs in sorted order based on KEYS (Ascending by default).**
         * ✅ **Does NOT allow `null` keys** (Throws `NullPointerException` if tried).
         * ✅ **Allows multiple `null` values.**
         * ✅ **Uses a Self-Balancing Red-Black Tree (`O(log n)`) for insert, delete, and search.**
         * ✅ **Slower than HashMap (`O(1)`) but keeps keys sorted.**
         */

        // Creating a TreeMap with Custom Comparator (Sorting Keys in Descending Order)
        TreeMap<Integer, String> treemap = new TreeMap<>((a, b) -> b - a);

        // Adding key-value pairs
        treemap.put(1, "Three");
        treemap.put(3, "One");
        treemap.put(2, "Four");
        treemap.put(4, "Two");

        // Printing TreeMap (Sorted by Key in Descending Order)
        System.out.println("TreeMap (Descending Order by Key): " + treemap);
        // Output: {4=Two, 3=One, 2=Four, 1=Three}

        // Removing a key-value pair
        treemap.remove(4);
        System.out.println("After Removing Key 4: " + treemap);
        // Output: {3=One, 2=Four, 1=Three}

        // Checking if a key exists
        System.out.println("Contains Key 1? " + treemap.containsKey(1)); // true

        // Checking if a value exists
        System.out.println("Contains Value 'Two'? " + treemap.containsValue("Two")); // false

        /*
         * 🔹 Important TreeMap Methods:
         * ==============================
         * ✅ firstKey()    -> Returns the first (smallest) key.
         * ✅ lastKey()     -> Returns the last (largest) key.
         * ✅ lowerKey(K)   -> Returns greatest key < given key.
         * ✅ higherKey(K)  -> Returns smallest key > given key.
         * ✅ floorKey(K)   -> Returns greatest key <= given key.
         * ✅ ceilingKey(K) -> Returns smallest key >= given key.
         */

        System.out.println("First Key: " + treemap.firstKey());  // 3
        System.out.println("Last Key: " + treemap.lastKey());    // 1
        System.out.println("Lower Key than 2: " + treemap.lowerKey(2));  // 3
        System.out.println("Higher Key than 2: " + treemap.higherKey(2)); // 1
        System.out.println("Floor Key of 2: " + treemap.floorKey(2));  // 2
        System.out.println("Ceiling Key of 2: " + treemap.ceilingKey(2)); // 2
    }
}
