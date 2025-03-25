package exceptionInjava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInJava {

    // Recursion - function calling itself
    public static void display() {
        display(); // ❌ Leads to StackOverflowError
    }

    public static void main(String[] args) throws FileNotFoundException {
        /*
         * ❌ Exception in Java:
         * => An unwanted or unexpected event that disrupts the normal program flow.
         * => Whenever an exception occurs, normal execution stops.
         * 
         * 🛑 2 Types of Exceptions:
         * 1️⃣ Checked Exception (Compile-Time) ✅ Must be handled using try-catch or throws
         *    - Example: FileNotFoundException, IOException
         * 2️⃣ Unchecked Exception (Runtime) ❌ Program crashes if not handled
         *    - Example: ArrayIndexOutOfBoundsException, NullPointerException
         * 
         * 🏗️ Exception Handling Mechanisms:
         * ✔ try → Code that may cause an exception.
         * ✔ catch → Handles the exception.
         * ✔ finally → Always runs (even if an exception occurs).
         * ✔ throws → Declares exceptions in method signature.
         * 
         * ❗ ERROR vs EXCEPTION:
         * - ERROR = System-level issue (Cannot be handled) 🚨
         * - EXCEPTION = Program-level issue (Can be handled) ⚠️
         */

        // 🚨 Example of ERROR: StackOverflowError (Unrecoverable, cannot be handled)
//        ExceptionInJava.display(); // ❌ Causes infinite recursion & crashes program

        // ✅ Example of Checked Exception (Handled with throws)
        PrintWriter printWriter = new PrintWriter("abc.txt"); // Compiler forces handling
        printWriter.println("Hello WORLD!");
        System.out.println("File written successfully! ✍️");
        printWriter.close();

        // ✅ Example of Checked Exception (Handled with try-catch)
        try {
            PrintWriter writer = new PrintWriter("abc.txt"); // Risky code
            writer.println("Hello from try-catch!");
            System.out.println("File written in try-catch! ✅");
            writer.close();
        } catch (FileNotFoundException e) { // Specific exception handling
            System.out.println("⚠️ File not found! Handling exception...");
            e.printStackTrace();
        }

        // ✅ Example of Unchecked Exception (Runtime Error)
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // ❌ Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Array index is out of bounds! Exception handled.");
        }

        // ✅ Example of Finally Block (Always Executes)
        try {
            System.out.println("Inside try block");
        } catch (Exception e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("✅ Finally block executed!");
        }
    }
}
