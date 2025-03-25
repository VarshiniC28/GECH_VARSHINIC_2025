package Vehicle;

class VehicleBaseClass{
	public String brand;
	public int Speed;
	public VehicleBaseClass(String brand, int speed) {
		super();
		this.brand = brand;
		this.Speed = speed;
	}
	public void displayVehicleDetails() {
		System.out.println("The "+ this.brand+ " brand Vehicles run at " +this.Speed +"/km");
	}
}

class Car extends VehicleBaseClass{
	public int numDoors;
	public Car(String brand, int speed, int numDoors) {
		super(brand, speed);
		this.numDoors = numDoors;
	}
	public void DisplayCarDetails() {
		System.out.println("Car from " +this.brand+ " with speed "+this.Speed+" has "+this.numDoors+" number of doors. ");
	}

	
}

public class Vehicle {

	public static void main(String[] args) {
		Car car = new Car("Tesla",100,5);
		car.displayVehicleDetails();
		car.DisplayCarDetails();
	}

}
