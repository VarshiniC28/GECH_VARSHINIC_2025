package strings;
import java.util.StringTokenizer;

public class StringTokenizerInbuiltClass {

	public static void main(String[] args) {
		
		 // ---------------------- StringTokenizer ----------------------
        // It is a class in `java.util` package used to split a string into tokens.
        // Useful for parsing data separated by spaces, commas, or other delimiters.
        // Each token is like a "word" split from the original string using the delimiter.

        // ---------------------- Example 1 ----------------------
        StringTokenizer st = new StringTokenizer("JAVA AI ML", " "); // Delimiter: " " (space) // Will split the string wherever space occurs
        while(st.hasMoreTokens()) { // Checks if there is another token available
            System.out.println(st.nextToken()); 
        }

        // ---------------------- Example 2 ----------------------
        StringTokenizer s1 = new StringTokenizer("JAVA,AI,ML", ","); // Delimiter: "," (comma) // Will split the string wherever comma occurs
        while(s1.hasMoreTokens()) {
            System.out.println(s1.nextToken()); 
        }

        // ---------------------- Example 3 ----------------------
        StringTokenizer s2 = new StringTokenizer("COMMMMMMMMMUNICATION", "M"); 
        // Delimiter: "M"
        // Every 'M' is treated as a separator. It doesn't care how many times it appears.
        while(s2.hasMoreTokens()) {
            System.out.println(s2.nextToken()); 
            // Output:
            // CO
            //
            //UNICATION
            // (Empty tokens are between multiple M’s)
        }

        // ---------------------- Interview Point ----------------------
        // Q: Is StringTokenizer faster than split()?
        // A: No. `String.split()` is fast and takes less memory so it is preferred in modern Java (it supports regex too).
        //    StringTokenizer is a legacy class from before Java 1.4.
        
        // Q: When would you still use StringTokenizer?
        // A: If you need basic, fast tokenizing without regex overhead — especially in older Java codebases.

        // ---------------------- Bonus Method ----------------------
        // You can also use countTokens() to know how many tokens exist:
        StringTokenizer s3 = new StringTokenizer("A B C", " ");
        System.out.println("Total Tokens: " + s3.countTokens()); // Output: 3

        // ---------------------- Comparison Summary ----------------------
        // ➤ StringTokenizer
        //    - Legacy (older)
        //    - No regex support
        //    - Slower than split()
        //    - Still useful for simple token parsing
        //
        // ➤ split()
        //    - Newer, recommended
        //    - Uses regex
        //    - More powerful and flexible
		}
		
	}

