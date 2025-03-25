package Polymorphism;

// ✅ 1. Method Overriding (Runtime Polymorphism / Dynamic Binding)
class Person {
    // ❌ Static methods CANNOT be overridden, so removing "static"
    public void walking() {
        System.out.println("The person is walking");
    }
}

class Varsha extends Person {
    // ✅ Overriding the walking() method in the child class
    @Override
    public void walking() {
        System.out.println("Varsha is walking");
    }
}

// ✅ 2. Method Overloading (Compile-time Polymorphism / Static Binding)
class Addition {
    // Overloaded methods with different parameters
    public static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("Addition: " + (a + b + c));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        /*
         * ✅ POLYMORPHISM:
         * 
         * Poly -> Many, Morphism -> Forms
         * 
         * => Polymorphism is a mechanism where methods perform different actions based on the situation.
         * => In simple words, polymorphism allows us to use the same method in different classes 
         *    while changing its behavior.
         * 
         * ✅ Two types:
         * 1️⃣ Method Overloading (Compile-time Polymorphism / Static Binding)
         * 2️⃣ Method Overriding (Runtime Polymorphism / Dynamic Binding)
         */

        // ✅ 1. Method Overriding Example
        // Parent reference, child object (Dynamic Polymorphism)
        Person person = new Varsha();
        person.walking(); // Calls the overridden method in Varsha class

        // ✅ 2. Method Overloading Example
        // Since these are static methods, we call them directly using the class name
        Addition.add(5, 5);      // Calls method with two parameters
        Addition.add(5, 5, 5);   // Calls method with three parameters
    }
}
