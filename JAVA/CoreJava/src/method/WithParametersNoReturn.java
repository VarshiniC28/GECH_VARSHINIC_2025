package method;

class Calculator3{
	
	int c;
	void add(int a, int b) {
		c= a+b;
		System.out.println(c);
	}
}

public class WithParametersNoReturn {

	public static void main(String[] args) {

		Calculator3 calci = new Calculator3();
		int num1 = 2;
		int num2 = 3;
		calci.add(num1, num2);
	}

}
