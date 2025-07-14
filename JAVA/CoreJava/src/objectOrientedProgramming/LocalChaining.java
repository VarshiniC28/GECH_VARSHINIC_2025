package objectOrientedProgramming;

class Customer{
	private int cId;
	private String cName;
	private int cNum;


//Noargs constructor
public Customer() {
	cId = 1;
	cName = "Arul";
	cNum = 1234;
	
}

public Customer(int cId, String cName, int cNum) {
	//to call the above constructor
	this(); //points to current classes constructor(same class), by this we can call other constructor to another constructor.
	//So this() is used for local chaining
	this.cId  = cId;
	this.cName = cName;
	this.cNum = cNum;
}

public int getcId() {
	return cId;
}

public String getcName() {
	return cName;
}

public int getcNum() {
	return cNum;
}

}

public class LocalChaining {

	public static void main(String[] args) {
		
		Customer c = new Customer(2, "Alex",123);
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
	}

}
