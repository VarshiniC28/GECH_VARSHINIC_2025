package method;

class Calculator{
	
	// without return and without paramter:
	int a = 50;
	int b = 40;
	
	void add(){
		int c= a+b;
		System.out.println(c);
	}
}

public class WithoutReturnWithoutParamters {

	public static void main(String[] args) {

		//Methods: with /without return and paramaters.
		
		//without return and without paramter:
		Calculator calci = new Calculator();
		calci.add(); // 90
		
		//Java is robust as it manages memory efficiently by deleting all in all segments once the execution is over.
		//refer notes for more details.
		
		
	}

}
