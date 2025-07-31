package interviewCodeSnippets;

public class CodeSnippetsIV {

    public static void main(String[] args) {

        // Create an array of integers
        int[] a = {10, 20, 30, 40, 50};

        // Printing the array reference variable directly
        System.out.println(a); 
        // OUTPUT: [I@<hashcode>
        // Explanation:
        // This prints the internal memory reference (like [I@1b6d3586)
        // because arrays inherit the default toString() from Object class.
        // [I --> denotes it is an array of int
        // @1b6d3586 --> the object's hashcode in hexadecimal

        // Create a String object
        String s = "JAVA";

        // Printing the String object directly
        System.out.println(s); 
        // OUTPUT: JAVA
        // Explanation:
        // String class overrides the toString() method from Object class.
        // Its toString() returns the actual string value, not memory address.

        // Q: Why does the array 'a' print the address, but String 's' prints the value?
        // ANS:
        // Because the toString() method of Object class is:
        //    public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        //
        // Arrays do NOT override this method → so it prints address-style output.
        // BUT the String class **overrides** toString() to return the actual string value.

        // Summary:
        // → Arrays use Object's default toString() → gives class@hexcode
        // → String overrides toString() → gives actual string value
    }
}
