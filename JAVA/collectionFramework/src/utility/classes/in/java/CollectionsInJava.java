package utility.classes.in.java;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsInJava {

	public static void main(String[] args) {

//		Collections is utility class in java: Has static methods to work with Collections
		
		ArrayList<Integer> ar = new ArrayList<Integer>(); //Diamond operator - Generics to specify the type of objects this arrayList can have - Gives type safety and doesnt allow heterogeneous data
		ar.add(10);
		ar.add(20);
		ar.add(30);
//		ar.add("A"); //doesn't allow heterogeneous data because we are using generics here.
		
		System.out.println(ar);
		
		System.out.println(Collections.binarySearch(ar, 20)); //must be sorted  //return index where 20 is - //1
		
		System.out.println(Collections.frequency(ar, 40)); //how many times 40 is present
		
		System.out.println(Collections.min(ar));
		
		System.out.println(Collections.max(ar));
		
		System.out.println(Collections.replaceAll(ar, 30, 40)); //in ar replace where there is 30 with 40
		System.out.println(ar);
		
		Collections.sort(ar); //sorts - only same type, not if there's heterogeneous data - ClassCastException
		System.out.println(ar);
		
		Collections.shuffle(ar); //to shuffle the elements
		System.out.println(ar);
		
	}

}
