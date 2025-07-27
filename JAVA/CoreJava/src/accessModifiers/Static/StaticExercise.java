package accessModifiers.Static;

import java.util.Scanner;

class Si{
	float si;
	float p;
	float t;
	static float r;
//	static float r=15.2f; can also give value to r like this but preferred method is giving value in static block
	
	
	static{
		r = 15.2f;
	}
	
	//we cant put the sentences hanging without method
	
	void accceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prinicipal amount: ");
		p=sc.nextFloat();
		
		System.out.println("Enter the tenure: ");
		t=sc.nextFloat();
		
//		r = 15.2f; //since it remains same throughout we can make it static which saves memoey also
	}
	
	void calculate() {
		si = (p*t*r)/100;
	}
	
	void display() {
		System.out.println(si);
	}
	
	//Java compiler gives default constructor if we dont give.
}

public class StaticExercise {

	public static void main(String[] args) {

		Si si = new Si();
		si.accceptInput();
		si.calculate();
		si.display();
		
		Si si1 = new Si();
		si1.accceptInput();
		si1.calculate();
		si1.display();
		
		Si si2 = new Si();
		si2.accceptInput();
		si2.calculate();
		si2.display();
		
		
	}

}
