package exceptionInjava;

public class ExceptionInJava3 {

    public static void main(String[] args) {

        /*
         * Multiple Catch Blocks in Java:
         * - When multiple exceptions may occur, we use multiple catch blocks.
         * - Only one catch block executes (the first matching one).
         * - Always catch exceptions from most specific (child) to most general (parent).
         * - If you put parent first (Exception), it catches everything, making child catches unreachable.
         */

        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;

        try {
            System.out.println(arr[10]); //  Causes ArrayIndexOutOfBoundsException
            System.out.println(10 / 0);  //  Causes ArithmeticException (this won't execute)
        } 
        catch (ArrayIndexOutOfBoundsException e) { //  Specific catch block 1 (child)
            System.out.println(" Exception: " + e);
        } 
        catch (ArithmeticException e) { //  Specific catch block 2 (child)
            System.out.println(" Exception: " + e);
        } 
        catch (Exception e) { //  General catch block (parent)
            System.out.println(" General Exception caught: " + e);
        }

        System.out.println(" Program continues after exception handling...");
    }
}
