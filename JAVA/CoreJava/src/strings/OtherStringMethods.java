package strings;

import java.util.Scanner;

public class OtherStringMethods {
	public static void main(String[] args) {

		        // Creating a new String object with full name
		        String s = new String("ISHWARCHANDRAVIDYASAGAR");

		        // ------------------------ String methods ------------------------

		        // Converts all characters to lowercase
		        System.out.println(s.toLowerCase()); // ishwarchandravidyasagar

		        // Converts all characters to uppercase (already in uppercase)
		        System.out.println(s.toUpperCase()); // ISHWARCHANDRAVIDYASAGAR

		        // Returns the number of characters in the string
		        System.out.println(s.length()); // 24

		        // Returns the character at index 6 (0-based indexing)
		        System.out.println(s.charAt(6)); // A

		        // Returns ASCII value of character at index 5
		        System.out.println(s.codePointAt(5)); // 82 (ASCII of 'R')

		        // Finds the first occurrence index of 'R'
		        System.out.println(s.indexOf('R')); // 5

		        // Finds the last occurrence index of 'R'
		        System.out.println(s.lastIndexOf('R')); // 22

		        // Checks if the string contains the sequence "PARVATHI"
		        System.out.println(s.contains("PARVATHI")); // false

		        // Checks if the string contains the sequence "SAGA"
		        System.out.println(s.contains("SAGA")); // true

		        // Checks if the string is empty (length == 0)
		        System.out.println(s.isEmpty()); // false

		        // Checks if the string is blank (all characters are whitespace)
		        System.out.println(s.isBlank()); // false

		        // Returns substring from index 13 to the end
		        System.out.println(s.substring(13)); // VIDYASAGAR

		        // Returns substring from index 13 to 18 (18 exclusive)
		        System.out.println(s.substring(13, 18)); // VIDYA

		        // ------------------------ String splitting ------------------------

		        String s2 = new String("ISHWAR,CHANDRA,VIDYA,SAGAR");

		        // Directly printing split() returns an array reference (not readable)
		        System.out.println(s2.split(",")); // Output: memory address

		        // Use traditional for loop to print each part after split
		        String[] arr = s2.split(",");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.println(arr[i]); // prints: ISHWAR, CHANDRA, ...
		        }

		        // Use enhanced for loop (modern/for-each loop)
		        for (String word : arr) {
		            System.out.println(word);
		            // Use this loop when just reading values, no index access needed
		        }

		        // ------------------------ Convert String to Character Array ------------------------

		        // Converting string to character array for easy char manipulation
		        char[] array = s.toCharArray();
		        for (char a : array) {
		            System.out.print(a); // Prints one character at a time
		        }

		        System.out.println(); // spacing after output

		        // ------------------------ Taking String input from user ------------------------

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter one word (no spaces): ");
		        String word = sc.next(); // takes input until space
		        System.out.println("You entered: " + word);

		        sc.nextLine(); // consume leftover newline

		        System.out.println("Enter a full line (can include spaces): ");
		        String line = sc.nextLine(); // takes entire line
		        System.out.println("You entered: " + line);
		    }
		}

