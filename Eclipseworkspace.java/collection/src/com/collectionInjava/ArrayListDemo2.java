package com.collectionInjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {
    	
    	/*COLLECTIONS:
		 * Its a utility classes that provide methods to work with collection.
		 * */
    	
        List<Integer> list = new ArrayList<>();
        list.add(120);
        list.add(12);
        list.add(10);
        list.add(100);
        
        System.out.println("Before: " + list);
        
        // 1. SORT:
        Collections.sort(list);
        System.out.println("After Sorting: " + list);
        //Uses the TimSort algorithm (a hybrid sorting algorithm) internally.
        
        // 2. Min and Max in list
        System.out.println("Min value: " + Collections.min(list));
        System.out.println("Max Value: " + Collections.max(list));
        
        // 3. Reverse()
        Collections.reverse(list);
        System.out.println("Reverse of array: " + list);
        
        // 4. Swap elements
        Collections.swap(list, 0, 2);
        System.out.println("After Swap: " + list);
        
        // 5. Shuffle elements
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
        //Uses the Fisher-Yates shuffle algorithm internally.
        
        // 6. Frequency of an element
        list.add(100);
        System.out.println("Frequency of 100: " + Collections.frequency(list, 100));
        
        // 7. Binary search (List must be sorted first)
        Collections.sort(list);
        int index = Collections.binarySearch(list, 100);
        System.out.println("Index of 100: " + index);
        
        // 8. Copy list elements
        List<Integer> newList = new ArrayList<>(Collections.nCopies(list.size(), 0));
        Collections.copy(newList, list);
        System.out.println("Copied List: " + newList);
        
        // 9. Fill list with a single value
        Collections.fill(newList, 999);
        System.out.println("After Fill: " + newList);
        
        // 10. Check if two collections are disjoint (no common elements)
        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(500);
        anotherList.add(600);
        System.out.println("Are list and anotherList disjoint? " + Collections.disjoint(list, anotherList));
        
        // 11. Convert list to an unmodifiable list
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodifiableList);
        
        // 12. Get an empty list
        List<Integer> emptyList = Collections.emptyList();
        System.out.println("Empty List: " + emptyList);
    }
}
