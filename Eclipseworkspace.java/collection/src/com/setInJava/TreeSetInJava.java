package com.setInJava;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		/*
		 * 🔹 TreeSet in Java:
		 * =====================
		 * ✅ Implements the Set interface and uses a **self-balancing Red-Black Tree** internally.
		 * ✅ **Maintains elements in sorted order (Ascending by default)**.
		 * ✅ **Does NOT allow duplicate elements**.
		 * ✅ **Does NOT allow `null` values** (Throws NullPointerException if tried).
		 * ✅ **Slower than HashSet (`O(log n)`)** but provides sorting.
		 * ✅ **Random access is NOT allowed** (Unlike Lists, we cannot get elements by index).
		 */

//		TreeSet<Integer> treeset = new TreeSet<>(); by default arranges in ascending order.
		// Creating TreeSet with Custom Comparator (Descending Order Sorting)
		TreeSet<Integer> treeset = new TreeSet<>((a, b) -> b - a); // Sorting in Descending Order
		
		treeset.add(2);
		treeset.add(10);
		treeset.add(100);
		treeset.add(12);
		treeset.add(13);
		
		// Printing TreeSet (Sorted in Descending Order)
		System.out.println(treeset); // Output: [100, 13, 12, 10, 2]

		/*
		 * 🔹 Important TreeSet Methods:
		 * ==============================
		 * ✅ first()       -> Returns the first (smallest) element.
		 * ✅ last()        -> Returns the last (largest) element.
		 * ✅ lower(E e)    -> Returns greatest element < given element.
		 * ✅ higher(E e)   -> Returns smallest element > given element.
		 * ✅ floor(E e)    -> Returns greatest element <= given element.
		 * ✅ ceiling(E e)  -> Returns smallest element >= given element.
		 * ✅ pollFirst()   -> Removes and returns first element.
		 * ✅ pollLast()    -> Removes and returns last element.
		 */

		System.out.println("First Element: " + treeset.first()); // 100
		System.out.println("Last Element: " + treeset.last()); // 2
		System.out.println("Lower than 12: " + treeset.lower(12)); // 10
		System.out.println("Higher than 12: " + treeset.higher(12)); // 13
		System.out.println("Floor of 11: " + treeset.floor(11)); // 10
		System.out.println("Ceiling of 11: " + treeset.ceiling(11)); // 12

		treeset.pollFirst(); // Removes 100
		treeset.pollLast();  // Removes 2

		System.out.println("After pollFirst & pollLast: " + treeset); // Output: [13, 12, 10]
	}
}
