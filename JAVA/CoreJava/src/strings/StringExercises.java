package strings;

public class StringExercises {
	
	static String reverseUsingBuilder(String str) {
	    return new StringBuilder(str).reverse().toString();
	}

	
	static String reverseUsingTwoPointers(String str) {
	    char[] arr = str.toCharArray();
	    int left = 0, right = arr.length - 1;

	    while (left < right) {
	        char temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;

	        left++;
	        right--;
	    }
	    return new String(arr);
	}
	
	

	static String reverseRecursive(String str) {
	    if (str == null || str.length() <= 1) {
	        return str;
	    }
	    return reverseRecursive(str.substring(1)) + str.charAt(0);
	}

	
	/*
	 * ✔ Most optimized → StringBuilder.reverse()
	 * ✔ Best logic-based approach → Two-pointer swap
	 * ✖ Avoid except for learning → Recursion
	 * */

	public static void main(String[] args) {

		//Reverse a string:
		String s = "Varshini";
		System.out.println(s);
		
		System.out.println(reverseUsingBuilder(s));
		System.out.println(reverseUsingTwoPointers(s));
	}

}
