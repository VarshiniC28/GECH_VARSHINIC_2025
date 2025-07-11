package method;

class Calculator4{
	
	int c;
	int add(int a, int b) { // this int a and int b is parameters
		c= a+b;
		return c;
	}
}

public class WithReturnWithParameter {

	public static void main(String[] args) {

		Calculator4 calci = new Calculator4();
		System.out.println(calci.add(10, 20)); //here 10, 20 are arguments for the parmaters.
	}
}
