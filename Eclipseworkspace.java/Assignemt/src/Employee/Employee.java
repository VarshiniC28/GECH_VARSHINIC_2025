package Employee;


abstract class Employees {
    String employeeName; 

    public Employees(String employeeName) {
        this.employeeName = employeeName;
    }
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employees {
    int salary;  

    public FullTimeEmployee(String employeeName, int salary) {
        super(employeeName);
        this.salary = salary;
    }

    @Override
    void calculateSalary() {
        System.out.println(this.employeeName + "'s full-time salary is " + this.salary + " per month.");
    }
}

class PartTimeEmployee extends Employees {
    int hoursWorked;
    int hourlyRate;

    public PartTimeEmployee(String employeeName, int hoursWorked, int hourlyRate) {
        super(employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculateSalary() {
        int salary = hoursWorked * hourlyRate;
        System.out.println(this.employeeName + "'s part-time salary is " + salary + " for " + hoursWorked + " hours of work.");
    }
}

public class Employee {
    public static void main(String[] args) {
        
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("VARSHA", 500000);
        fullTimeEmp.calculateSalary();

        PartTimeEmployee partTimeEmp = new PartTimeEmployee("VEDA", 20, 500);
        partTimeEmp.calculateSalary();
    }
}
