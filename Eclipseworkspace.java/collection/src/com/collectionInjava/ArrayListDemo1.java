package com.collectionInjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        // Creating an ArrayList of Integer type
        List<Integer> list = new ArrayList<>();
        
        // Adding elements to the list (duplicates are allowed in ArrayList)
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(10);
        
        // Different ways to iterate through the ArrayList

        // 1. Using a Traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " "); // list.get(i) retrieves elements using index
        }
        System.out.println();

        // 2. Using Enhanced for- for-each loop
        System.out.println("Using for-each loop:");
        for (int i : list) {
            System.out.println(i + " "); // Automatically retrieves each element in the list
        }
        System.out.println();

        // 3. Using forEach() method with Lambda Expression (Java 8 feature)
        System.out.println("Using forEach() method with Lambda:");
        list.forEach(i -> System.out.println(i + " ")); // i -> System.out.println(i) is a lambda expression, -> is a arrow operator
        System.out.println();

        // 4. Using an Iterator (for more controlled traversal)
        System.out.println("Using Iterator:");
        Iterator<Integer> list1 = list.iterator(); // Iterator is an interface used for iteration
        while (list1.hasNext()) { // Checks if there is another element in the list
            System.out.println(list1.next() + " "); // next() retrieves the next element
        }
    }
}
