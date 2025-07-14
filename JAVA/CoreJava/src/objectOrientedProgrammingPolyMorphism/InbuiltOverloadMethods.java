package objectOrientedProgrammingPolyMorphism;

import java.util.Arrays;

public class InbuiltOverloadMethods {

	public static void main(String[] args) {
		// --------------------------------------------
		// 🚀 COMMON INBUILT OVERLOADED METHODS IN JAVA
		// --------------------------------------------

		// 1. System.out.println() → PrintStream class
		// Overloaded to print any type: int, float, char, boolean, object, etc.
		System.out.println(10);            // Prints integer
		System.out.println("Hello");       // Prints string

		// 2. System.out.print() → PrintStream class
		// Similar to println() but does not move to a new line after printing.
		System.out.print(10);              // Prints integer
		System.out.print("Hello");         // Prints string

		// 3. substring() → String class
		// Extracts part of string; single index or start–end indexes.
		String s = "PROGRAM";
		System.out.println(s.substring(3));    // "GRAM"
		System.out.println(s.substring(2, 5)); // "OGR"

		// 4. indexOf() → String class
		// Finds index of character or substring; can specify start index.
		System.out.println(s.indexOf('O'));       // 2
		System.out.println(s.indexOf("RA", 3));   // 4

		// 5. valueOf() → String class (static method)
		// Converts any datatype to String (int, char, float, boolean...).
		System.out.println(String.valueOf(100));   // "100"
		System.out.println(String.valueOf(false)); // "false"

		// 6. replace() → String class
		// Replace character or substring.
		System.out.println(s.replace('R', 'X'));     // "PXOGXAM"
		System.out.println(s.replace("PRO", "DEV")); // "DEVEGRAM"

		// 7. Math.max() → Math class
		// Returns larger value; works for int, float, double, long.
		System.out.println(Math.max(5, 10));     // 10
		System.out.println(Math.max(2.5, 3.9));  // 3.9

		// 8. Math.min() → Math class
		// Returns smaller value; works for all numeric types.
		System.out.println(Math.min(4, 1));      // 1
		System.out.println(Math.min(7.2, 6.3));  // 6.3

		// 9. Math.abs() → Math class
		// Returns absolute value; works for int, float, long, double.
		System.out.println(Math.abs(-9));        // 9
		System.out.println(Math.abs(-5.4f));     // 5.4

		// 10. Arrays.sort() → Arrays class
		// Sorts array of any data type or given range.
		int[] arr = {3, 2, 1};
		Arrays.sort(arr);                       // Full array sort
		Arrays.sort(arr, 0, 2);                 // Partial sort: index 0 to 1

		// 11. Arrays.fill() → Arrays class
		// Fills entire array or part of it with given value.
		Arrays.fill(arr, 5);                    // Fills all with 5
		Arrays.fill(arr, 1, 3, 9);              // Index 1 to 2 with 9

		// 12. compareTo() → String class
		// Compares 2 strings lexicographically.
		System.out.println("A".compareTo("B"));     // -1
		System.out.println("Z".compareTo("Z"));     // 0

		// 13. equals() → Object class (overridden by String and others)
		// Compares content of objects (not address).
		System.out.println("Hi".equals("Hi"));      // true
		System.out.println("Hi".equals("hello"));   // false

		// 14. charAt() → String class
		// Returns character at given index.
		System.out.println("JAVA".charAt(2));       // V

		// 15. split() → String class
		// Splits string based on delimiter and returns String array.
		String[] parts = "A,B,C".split(",");
		System.out.println(parts[1]);               // B

		// 16. String.format() → String class
		// Formats values into a formatted string (like printf).
		System.out.println(String.format("%s %d", "Age:", 21)); // Age: 21

		// 17. printf() → PrintStream (System.out)
		// Similar to C-style printf formatting.
		System.out.printf("%s = %d", "Count", 10); // Count = 10

		// 18. getBytes() → String class
		// Converts string to byte array.
		byte[] bytes = "ABC".getBytes();
		System.out.println(bytes[0]);              // 65

		// 19. StringBuilder.append() → StringBuilder class
		// Appends any type (int, string, char, float...) to string.
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(123);
		System.out.println(sb);                    // Hello123

		// --------------------------------------------

	}

}
