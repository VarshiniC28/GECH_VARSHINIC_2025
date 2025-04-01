package com.setInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInJava {

	public static void main(String[] args) {
		/*
		 * 🔹 SET (java.util.Set)
		 * ======================
		 * ✅ Set is a child interface of Collection.
		 * ✅ It represents a group of individual objects as a single entity.
		 * ✅ **Insertion order is NOT preserved.**
		 * ✅ **Duplicates are NOT allowed.**
		 * ✅ **Random access is available but inefficient (no index-based access).**
		 * ✅ Allows `null` (only one occurrence).
		 * 
		 * 📌 **Types of Set Implementations in Java**
		 * 1️⃣ **HashSet** (Uses Hash Table, no ordering, O(1) operations)
		 * 2️⃣ **LinkedHashSet** (Preserves insertion order, O(1) operations)
		 * 3️⃣ **TreeSet** (Sorted order, O(log n) operations using Red-Black Tree)
		 */

		// 🔹 HashSet Example: No duplicates, No order guarantee
		Set<Integer> set = new HashSet<Integer>(); // HashSet is a subclass of Set.
		set.add(12); // Doesn't occur twice in output as Set doesn't allow duplicates.
		set.add(null); // Allows null (only one occurrence).
		set.add(12); // Duplicate, will be ignored.
		set.add(30);
		set.add(45);
		set.add(13);

		System.out.println("HashSet: " + set); // Output order is unpredictable.

		// 🔹 Using Set to Remove Duplicates from a List
		// ✅ A common use case of Set is to remove duplicate values from a List.
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(34);
		list.add(12); // Duplicate
		list.add(24);
		list.add(34); // Duplicate
		list.add(13); // Duplicate
		System.out.println("List (with duplicates): " + list);

		// Convert List to Set to remove duplicates
		Set<Integer> set1 = new HashSet<Integer>(list);
		System.out.println("Set (duplicates removed): " + set1);

	}
}
