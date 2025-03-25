package concrete_pojo;

// Concrete class with full implementation
class Car {
    private String brand;
    private int speed;

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Fully implemented methods
    public void accelerate() {
        speed += 10;
        System.out.println(brand + " accelerated! Speed: " + speed + " km/h ");
    }

    public void brake() {
        speed -= 10;
        System.out.println(brand + " applied brakes! Speed: " + speed + " km/h ");
    }
}

public class ConcreteClass {
    /*
     * Concrete:
     * => full implementation:
     * 
     * CONCRETE METHOD:
     * => The method contains full implementation/body
     * 
     * NON-CONCRETE Method/ abstract body
     * => This method doesnt contain implementation/body
     * 
     * CONCRETE CLASS:
     * => The class contain full implemented/body method
     */

    /*🏗️ Concrete Class in Java - The Fully Built House!
    Imagine you’re building a house:
    ✔ A blueprint (abstract class) gives the structure but doesn't provide full functionality.
    ✔ A concrete house (concrete class) is a fully built, usable house! 🏠

    A Concrete Class in Java is just like that house!
    It is a fully implemented class that can be instantiated (used to create objects).

    💡 What is a Concrete Class?
    A Concrete Class is a regular class that provides full implementations for all its methods.
    Unlike an abstract class, a concrete class must have complete functionality and can be instantiated.*/

    // only planning no implementation we take interface
    // partial implementation and planning we go with abstract
    // full implementation and planning we use concrete

    public static void main(String[] args) {
        // ✅ Example of a Concrete Class
        Car myCar = new Car("Tesla", 60);
        myCar.accelerate();
        myCar.brake();
    }
}
