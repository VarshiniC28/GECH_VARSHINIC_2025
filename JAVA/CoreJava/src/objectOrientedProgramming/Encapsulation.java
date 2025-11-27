package objectOrientedProgramming;

class Bank{
	private int accNo;
	private int password;
	
	//Getters and setters methods to access private vars
	
	public void setAccNo(int accNo){ //give names that is same as accNo, setaccNo
		this.accNo = accNo; //this keyword is used to point to current object in the class , here i.e instance vars accNo, password
	}
	
	public void setterPassword(int password) {
		this.password = password;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public int getPassword() {
		return password;
	}
	
////	Can we give one setter method for all vars: yes
//	public void setterBank(int accNo, int password) {
//		this.accNo = accNo;
//		this.password = password;
//	}
	
	//Can we give one getter method for all vars: no not possible because the varibale type could be diff string int etc
//	public int getterData() {
//		return accNo, password;
//	}
	
	//Constructor is a special type of setter with same name as class with no return type 
	//Parameterized constructor/Full args constructor has all parameters, Zerparameterized constructor and no args/default	 constructor has no paramters, son no argumnets
	//Full args constructor
	public Bank(int accNo, int password) { 
		this.accNo = accNo;
		this.password = password;
	}
	
	//no args contructor but can have body , which will also be given by java compiler if we dont write any constructor at all, once we write full args constructor, if we want no args will have to give no args.
	public Bank() {
//		this.accNo = 11;
//		this.password = 11; //when we create object with no parameters , this value will already assigned to 
		System.out.println("No args/Default contructor");
	}
	
	//no args and full args contructor together is constructor overloading
}

public class Encapsulation {

	public static void main(String[] args) {


		//Encapsulation: Wrapping up of data (variables) and methods into a single unit/entiry (class).
		//To Keep data safe from outside interference and misuse.
		//Achieved using access modifiers like private, public, protected.
		
//		Bank b = new Bank(); //when we dont have no args constructor also this works bcz if we dont give also java will give no args constructor by default always and everytime
		Bank b = new Bank(111,111); //now when we use constructor the object creation asks for those arguments to the parameters in constructor
		//because constructor is called before the object creation whereas setter and getters are called after object creation through its ref.
		System.out.println(b.getAccNo());
		System.out.println(b.getPassword());
		
		
//		System.out.println(b.accno); //cant access since its private
//		System.out.println(b.password);
		
		b.setAccNo(11);
		System.out.println(b.getAccNo());
		
		b.setterPassword(11);
		System.out.println(b.getPassword());
		
//		b.setterBank(111, 10);
//		System.out.println(b.getAccNo());
//		System.out.println(b.getPassword());
		

	}

}
