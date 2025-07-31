package aggregation.composition;

// =========== COMPOSITION PART ===========

class Brain {
    private float weight;

    public Brain(float weight) {
        this.weight = weight; // Constructor to initialize weight
    }

    public float getWeight() {
        return weight; // Getter method to return brain weight
    }
}

class Heart {
    private float weight;

    public Heart(float weight) {
        this.weight = weight; // Constructor to initialize weight
    }

    public float getWeight() {
        return weight; // Getter method to return heart weight
    }
}

class Human {
    // Composition: objects created inside the class => tightly bound (object owns its part)

    Brain b = new Brain(1.4f); // Brain is part of Human (created inside Human class)
    Heart h = new Heart(0.25f); // Heart is also a part of Human

    // Method to show internal composition details
    public void showParts() {
        System.out.println("Brain weight: " + b.getWeight());
        System.out.println("Heart weight: " + h.getWeight());
    }
}

// =========== AGGREGATION PART ===========

class Bike {
    String name;

    public Bike(String name) {
        this.name = name; // Constructor to set bike name
    }

    public String getName() {
        return name; // Getter for bike name
    }
}

class Book {
    String sub;

    public Book(String sub) {
        this.sub = sub; // Constructor to set book subject
    }

    public String getSub() {
        return sub; // Getter for book subject
    }
}

class Student extends Human {
    // Aggregation: Student has Bike and Book passed from outside => loosely coupled

    // Method showing Student "has a" Bike
    void hasA(Bike b) {
        System.out.println("Student's bike: " + b.getName());
    }

    // Method showing Student "has a" Book
    void hasA(Book b) {
        System.out.println("Student's book: " + b.getSub());
    }
}

// =========== DRIVER CLASS ===========

public class AggregationAndCompositionExercise {

    public static void main(String[] args) {
        
        // Aggregation: Bike and Book created outside Student
        Bike myBike = new Bike("Bullet");
        Book myBook = new Book("Science");

        // Create a Student object (inherits from Human)
        Student s = new Student();

        // Calling inherited method from Human to show composition
        s.showParts();  // Human parts like Brain and Heart

        // Calling aggregation methods
        s.hasA(myBike); // Aggregated bike
        s.hasA(myBook); // Aggregated book
        
        Human h = new Human();
        System.out.println(h.b.getWeight());
        System.out.println(h.h.getWeight());
        
        h = null;
        
        System.out.println(h.b.getWeight());
        System.out.println(h.h.getWeight());
    }
}
