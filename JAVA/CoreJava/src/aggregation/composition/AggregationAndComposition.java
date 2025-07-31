package aggregation.composition;

class Charger{
	private String brand;
	private float Voltage;
	
	//Specialized setter
	public Charger(String brand, float Voltage) {
		super();
		this.brand = brand;
		this.Voltage = Voltage;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public float getVoltage() {
		return Voltage;
	}
}

class Os{
	private String name;
	private float size;
	
	public Os(String name, float size) {
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public float getSize() {
		return size;
	}
}

class Mobile {
	
	//To achieve composition create a object of that particular class in our class
	Os os = new Os("Andriod", 4.5f); //this puts OS inside Mobile class - Composition - Tight bound
	
	//We achieve aggregation we create a method like this
	void hasA(Charger c){
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
	
}

public class AggregationAndComposition {

	public static void main(String[] args) {

		//Aggregation and Composition: Together called as a Association in Java
		//Aggregation - loose bound has-A relationship between classes through a method
		//Composition - tight bound has-A relationship between classes through a Object
		
		Charger c  = new Charger("SAMSUNG",(25.0f));
		
		Mobile m = new Mobile();
		
		//Aggregation can access directly from Charger
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
		
		//Composition
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		//Lets say Mobile lost
		m = null; //this makes garbage collector collect this, and no longer that exists
		
		//Charger is still present
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
		
		//but Os cant be accessed the below way - Composition
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
	}

}
