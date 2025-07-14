package objectOrientedProgrammingPolyMorphism;

public class MainOverload {

    // JVM looks for this exact method signature to start execution
    public static void main(String[] args) {
        System.out.println("Main with String[] args"); 
        //until we call other main methods as below we get whats inside our main main method i.e Main with String[] args 
        
        // You can call other overloaded main methods from here
        main(5); //since its static method we directly call the method name, no need of class obj
        main("Java");
    }

    // Overloaded version 1
    public static void main(int a) {
        System.out.println("Overloaded main with int: " + a);
    }

    // Overloaded version 2
    public static void main(String s) {
        System.out.println("Overloaded main with String: " + s);
        

    }
}

