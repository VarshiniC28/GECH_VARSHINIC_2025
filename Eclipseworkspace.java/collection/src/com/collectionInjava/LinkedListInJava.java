package com.collectionInjava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {

	public static void main(String[] args) {
				// LINKED LIST
				/*
				 * ==> A Linked List can be implemented as:
				 *      - Singly Linked List (each node has two parts: data + next node address).
				 *      - Doubly Linked List (each node has three parts: data + previous node address + next node address).
				 *      
				 * ✅ Java's LinkedList **is implemented using a Doubly Linked List**.
				 * ❌ Java does NOT provide a built-in Singly Linked List.
				 */

				 /*      
				 * ==> Linked List allows **duplicate elements**.
				 * ==> Linked List **preserves insertion order**.
				 * ==> Linked List **allows null values**.
				 * ==> Linked List **does NOT support fast random access** (get(index) takes O(n) time).
				 */
				
				List<Integer> list = new LinkedList<>();
				list.add(43);
				list.add(43);  // ✅ Allows duplicate elements
				list.add(null); // ✅ Allows null values
				list.add(23);
				list.add(30);
				list.add(35);
				System.out.println(list);
				System.out.println(list.get(0)); // ✅ Random access (but O(n) time complexity)
				System.out.println(list.remove(1));
				System.out.println(list);

				/*
				 * ✅ LINKED LIST vs ARRAYLIST:
				 * 
				 * **Underlying Data Structure**:
				 *      - Linked List ➝ **Doubly Linked List**.
				 *      - ArrayList ➝ **Dynamic Array**.
				 * 
				 * **Memory Usage**:
				 *      - Linked List ➝ **More memory** (stores prev, next, and data).
				 *      - ArrayList ➝ **Less memory** (stores only data in a contiguous array).
				 * 
				 * **Performance**:
				 *      - Linked List ➝ **Fast insertions & deletions** (O(1) at head/tail, O(n) in middle).
				 *      - ArrayList ➝ **Fast random access (O(1))**, but **slower deletions** (O(n) due to shifting).
				 * 
				 * **When to Use LinkedList?**
				 *      - If there are **frequent insertions & deletions**.
				 *      - **NOT** recommended when **frequent get(index) operations** are needed.
				 */
	}

}
