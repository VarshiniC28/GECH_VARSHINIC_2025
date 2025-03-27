package com.collectionInjava;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        /*
         * ARRAYLIST:
         * ==========
         * => ArrayList is a **resizable array implementation** in Java.
         * => It is a part of the **Java Collections Framework** and implements the **List interface**.
         * => The underlying data structure of an ArrayList is a **dynamic array**, meaning it can **grow or shrink** dynamically.
         * => **Allows duplicate elements**.
         * => **Preserves insertion order** (elements remain in the order they were added).
         * => **Allows null values**.
         * => **Supports random access** (can access any element using its index in O(1) time complexity).
         * => **Not synchronized** (not thread-safe by default, but can be synchronized using `Collections.synchronizedList()`).
         */

        // Creating an ArrayList that only stores Integer values (Type-safe using Generics).
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list.add(12);
        list.add(1);
        list.add(1);
        list.add(null); // Null values are allowed
        list.add(null);
        list.add(34);
        list.add(12);
        list.add(1);
        list.add(1);
        list.add(null);
        list.add(null);
        list.add(34);

        System.out.println("ArrayList elements: " + list);

        // Accessing an element using get(index)
        System.out.println("Element at index 3: " + list.get(3));

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // Removing an element by index
        list.remove(0);
        System.out.println("After removing index 0: " + list);

        // Removing an element by value
        Integer i = 34; // Assigning 34 to an Integer variable
        list.remove(i); // Removes the first occurrence of 34
        System.out.println("After removing first occurrence of 34: " + list);

        // Clearing all elements from the ArrayList
        list.clear();
        System.out.println("After clearing the ArrayList: " + list);
    }
}
