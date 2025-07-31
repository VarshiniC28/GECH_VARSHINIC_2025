package toString;

 class Employee{ //extends Object //automatically done by JVM
	 private int id;
	 private String name;
	 
	 public Employee() {
	}
	 
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //must be public if not visibility is reduced and hence error
		return id+" "+name; //tostring() method gives us value of object instead of hash code
	}
	
//	public String toString() { //must be public if not visibility is reduced and hence error
//		return "Hello";
//	}
	
 }

public class ToString {

	public static void main(String[] args) {
		
		Employee e = new Employee(1,"Varshini");
		System.out.println(e); //This gives e ref var's address 
		//but instead to print 1, Varshini we use toString() method which is inherited by Object class automatically and this will be attached to ref ar e automatically by JVM like e.toString()
		//if we give ourself e.toStrng() it print like this -> toString.Employee@6f539caf
		//But our goal is to print 1 Varshini we have to override(without annotation also possible) the toString() method in from the parent object class as above

		//Object, ctrl+click open declaration and click ctrl+o
	}

}
