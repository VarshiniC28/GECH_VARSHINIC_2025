package com.collectionInjava;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInJava1 {

    public static void main(String[] args) {
        /*
         * Collection vs Collections:
         * ==========================
         * - Collection: The root interface in the Java Collection Framework. It defines the common methods for handling groups of objects.
         * - Collections: A utility class in `java.util` that provides static methods for sorting, searching, min, max, reverse, etc.
         * 
         * COLLECTION:
         * ===========
         * =>A Collection in Java is a framework that provides predefined classes and interfaces to store and manipulate groups of objects efficiently.
         * - A Collection represents a group of individual objects as a single entity.
         * - `Collection` is an **interface** that provides built-in methods applicable to various collection classes.
         * - Allows **heterogeneous data** (different data types), but using generics (`Collection<T>`) ensures **type safety**.
         * - Supports **autoboxing**, converting primitive data types into wrapper classes (e.g., `int` → `Integer`).
         * - Requires explicit **unboxing** when retrieving primitive values if generics are not used.
         * 
         * Types of Collections:
         * ====================
         * - **List** (Ordered, allows duplicates) → `ArrayList`, `LinkedList`, `Vector`, `Stack`
         * - **Set** (Unordered, no duplicates) → `HashSet`, `LinkedHashSet`, `TreeSet`
         * - **Queue** (FIFO structure) → `PriorityQueue`, `LinkedList` (as Queue)
         * - **Map** (Key-value pairs) → `HashMap`, `TreeMap`, `LinkedHashMap` (not part of Collection interface)
         * 
         * Common Collection Methods:
         * ==========================
         * - `add(E e)`, `remove(Object o)`, `clear()`, `contains(Object o)`, `size()`, `isEmpty()`, `toArray()`, etc.
         */

        // Creating a Collection (ArrayList implementation)
        Collection collection = new ArrayList<>();

        // Adding elements (supports different data types due to autoboxing)
        collection.add(10);         // Integer
        collection.add("name");     // String
        collection.add(10.23);      // Double

        System.out.println(collection); // Output: [10, name, 10.23]

        // Removing an element
        collection.remove(10);
        System.out.println(collection); // Output: [name, 10.23]

        // Clearing all elements
        collection.clear();
        System.out.println(collection); // Output: []
    }
}
