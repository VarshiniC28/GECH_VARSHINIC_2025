package arraylist;

import java.util.Arrays;

public class ArraysUtilityClassInArray {

	public static void main(String[] args) {

		//Array and Arrays is different
		
		//Array > JRE system library > Project- java.base > java.lanf.reflect package has Array.class(its not java file like we create)
		//We cannot find array class for security reasons, still it does job - if it sees[] its known its array
		//In that Array class the constructor is private
		
		//Arrays > Class to assist Array
		int[] a = {10,21,30,4,5};
		Arrays.sort(a); //sorts in ascending order
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//We can print array without using for loop instead using the Arrays utility class.
		System.out.println(Arrays.toString(a));
	}

}
