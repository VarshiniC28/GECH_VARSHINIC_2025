package method;

import java.util.Scanner;

class Calculator2{
	
	//With return and without parameters
	int a=5, b=4;
	int add (){
		return a+b;
	}
}

public class WithReturnNoParameters {

	public static void main(String[] args) {

		//With return and without parameters
		Calculator2 calci = new Calculator2();
		calci.add();
		System.out.println(calci.add());
	}

}
