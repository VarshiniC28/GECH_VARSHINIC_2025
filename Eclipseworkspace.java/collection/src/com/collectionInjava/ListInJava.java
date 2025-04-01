package com.collectionInjava;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

    public static void main(String[] args) {

        /*
         * List in Java:
         * =============
         * - `List` is a **child interface** of `Collection` and part of the Java Collections Framework.
         * - It provides **ordered storage**, **index-based access**, and **allows duplicate elements**.
         * - Elements in a `List` can be retrieved using their index position.
         * - Supports **autoboxing** (automatically converts primitive types to their wrapper class objects).
         * - Implementations of `List`: `ArrayList`, `LinkedList`, `Vector`, `Stack`.
         * 
         * Differences from Arrays:
         * ------------------------
         * - **Arrays** have a fixed size, while **Lists** are dynamic.
         * - **Arrays** require specifying a type, while **Lists** can store multiple types (if not using generics).
         * - **Arrays** do not provide built-in methods like `add()`, `remove()`, `get()`, etc., which are available in `List`.
         */

        // Creating a List (ArrayList implementation)
        List list = new ArrayList(); // List is an interface, ArrayList is a class

        // Adding elements (autoboxing: converts primitives to wrapper classes)
        list.add(2);         // Index 0 -> Integer (Autoboxing from int to Integer automatically)
        list.add("Hello");   // Index 1 -> String
        list.add(10.67);     // Index 2 -> Double (Autoboxing from double to Double automatically)
        
        System.out.println(list); // Output: [2, Hello, 10.67]

        /*
         * Type Issues in Collections:
         * ===========================
         * - Since `List` stores elements as `Object` (without generics), retrieving an element returns an `Object`.
         * - Type casting is required to convert `Object` back to its original type (called **Unboxing**).
         * - If incorrect casting is done, it results in `ClassCastException`.
         */

        // Correct type casting while retrieving elements
        String str = (String) list.get(1); // Converting Object to String
        System.out.println(str);  // Output: Hello

        double value = (double) list.get(2); // Converting Object to double
        System.out.println(value); // Output: 10.67
    }
}
