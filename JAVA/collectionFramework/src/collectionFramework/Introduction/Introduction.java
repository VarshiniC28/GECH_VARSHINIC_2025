package collectionFramework.Introduction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Introduction {

	public static void main(String[] args) {

		//Collection Framework: 
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);//adds data at last
		a.add("V"); //We can add data of any type - Hence ArrayList is Heterogeneous 
		a.add(1,15); // to add data at a particular index
		
		a.trimToSize(); //since the initial capacity of ArrayList is 10 - and we have only used 4 space of it we can try trim to the size of array only to not waste the memory
		
//		System.out.println(a.add(0)); //true //boolean value that its added
		
		ArrayList ar2 = new ArrayList();
		ar2.add(10);
		ar2.add(2);
		ar2.add(3);
		
//		a.addAll(ar2); //this will copy and paste all the elements form ar2 to a
		//a.addAll(1, ar2); //adds the elements from ar2 to a from index 1, left is index and right is Collection c
		
//		a.retainAll(ar2);//10 //method to make array1 to keep only the duplicate elements from array 2, that is keep only those elements are common in both
		
		a.removeAll(ar2); //method to remove duplicates of array1 that is in arr2 also and keep only non duplicates from array1. - returns only non duplicates
		
//		a.remove(2); //this will remove the element at index 2
		System.out.println(a.remove(2)); //It prints the element that was removes at index 2
	
		a.set(1, 100); //set is used to replace a element at index not add
		
		System.out.println(a.get(0)); //getFast() , getLast()
		
		//no need of for loop	
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(ar2);
		System.out.println(ar2.isEmpty());//false //returns true if arrayList is empty and return false if its not empty
		
		//Different ways to access the elements of the Array list:
		//1.
		System.out.println(ar2);
		
		//2. For loop - we can access customized index
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		//3. For each / enhanced for loop: cant access index based elements
		for(Object e : ar2) { //Since Collection can never store Primitive data types only objects, we must use wrapper class to store objects - like Integer for int, Character for char, but since here it stores heterogeneous data- we must use Object
			System.out.println(e);
		}

		//4. Iterator - to iterate over array list by checking if there is element next or not as below
		Iterator cursor = a.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		//cannot traverse array list in reverse direction using for each and iterator hence List iterator was introduced
		
		//5. ListIterator
		ListIterator cursorl = ar2.listIterator(ar2.size()); //ar2.size wll make start from the index of size and we can access backward
		while(cursorl.hasPrevious()) {
			System.out.println(cursorl.previous());
		}
		 	
		
	}

}
