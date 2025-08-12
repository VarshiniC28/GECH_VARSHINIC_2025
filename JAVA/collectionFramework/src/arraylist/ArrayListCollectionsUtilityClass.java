package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionsUtilityClass {
    public static void main(String[] args) {

        // Without Generics (Not recommended, can store any type)
        ArrayList a = new ArrayList();
        a.add(10); // Autoboxing: int -> Integer
        a.add("Hello");
        a.add(3.14);
        System.out.println("ArrayList without generics: " + a);
        
        //3 different things
        //Collections - Utility class for Collection framework
        //Collection - Interface with classes like ArrayList, LinkedList
        //Collections Framework - Concept which comprises all of this

        // With Generics (Recommended, type-safe)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Autoboxing
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList with Integers: " + numbers);
        
        //---------------------------------------------------------------------
        
        //Collections utilty class
        
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(100);
        arr.add(89);
        arr.add(2);
        
        Collections.sort(arr);
        
        System.out.println(arr);
        
        //---------------------------------------------------------------------
        
        
        //Drawbacks of Array List:
        //Slow insert/delete in middle → shifting elements takes O(n) time.
        //Fixed growth pattern → resizing array internally costs performance.
        //Not memory efficient → stores extra capacity beyond current size.
    }
}
