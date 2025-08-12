package wrapper.Class;
public class WrapperClassIntro {

    public static void main(String[] args) {

        // Boxing - Converting primitive data types to objects is called Boxing

        int a = 10;

        // Old way (Deprecated in Java 9+)
        // Integer i = new Integer(a);

        // Recommended way (valueOf)
        Integer i = Integer.valueOf(a);
        System.out.println(i); // 10 is converted to an Integer object

        // Checking the class type
        System.out.println(i.getClass());           // class java.lang.Integer
        System.out.println(i.getClass().getName()); // java.lang.Integer

        // Example of 'instanceof' to check if 'i' is an Integer object
        if (i instanceof Integer) {
            System.out.println("i is an instance of Integer");
        } else {
            System.out.println("i is NOT an instance of Integer");
        }
        
        //------------------------------------------------------------------------------
        //Ways of boxing:
        Integer i1 = Integer.valueOf(25); // Using valueOf() – preferred
        Integer i2 = new Integer(25); // Deprecated since Java 9
        Integer i3 = 25; // Autoboxing

        //autoboxing - this happens automatically in collections
        int num1 = 10;
        Integer obj = num1; // primitive to object
        
        //___________________________________________________________________________________
        // Unboxing - Converting object back to primitive
        
        //manual way
        int num = i.intValue();
        System.out.println("Unboxed value: " + num);
        
        //AutoUnboxing:
        Integer in = Integer.valueOf(10);
        int d = in; //auto unboxing by java
        System.out.println(d);
    }
}
