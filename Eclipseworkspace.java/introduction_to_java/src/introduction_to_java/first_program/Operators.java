package introduction_to_java.first_program;

public class Operators {

	public static void main(String[] args) {
		//OPERATORS:
		/*
		1.Arithmetic operators => +,-,*,/,%
		2.Assignment operators => -=,+=,*=, /=, %=
		3.Comparison/Relational operators => <,>, >=, <=, !=, ==, (O/P: true or false)
		4.Logical operators => &&, ||, ! (O/P: true or false)
		5.Bitwise operators => &,|,~
		6.Ternary Operators => ?:
		7.Unary Operators => ++, --
		8. Shift Operators => >>, <<
		9. instance of operator => instanceof
		*/
		
		
		//1. ARITHMETIC OPERATORS:
		
		int a = 5;
		int b = 2;
		System.out.println("Addition:" +(a+b));
		System.out.println("Subtraction:" +(a-b));
		System.out.println("Mutiplication:" +(a*b));
		System.out.println("Division:" +(float)(a/b));
		System.out.println("Modulos:" +(a%b));
		
		//2. Assignment operators
		int c= 0;
		System.out.println(c+=3);
		System.out.println(c-=1);
		System.out.println(c*=5);
		System.out.println(c/=2);
		System.out.println(c%=1);
		
		//3. Relational Operators
		int d = 20;
		int e = 30;
		System.out.println(" Equality Operator: "+(d==e));
		System.out.println("greater than Operator: "+(d>e));
		System.out.println("lesser than Operator: "+(d<e));
		System.out.println("greater than or equal to Operator: "+(d>=e));
		System.out.println("lesser than or equal to Operator: "+(d<=e));
		System.out.println("not equal to Operator: "+(d!=e));
		
		//4. Logical operators
		boolean f = true;
		boolean g = false;
		System.out.println("true and false:" +(f&&g));
		System.out.println("true and false:" +(f&&g));
		System.out.println("or:" +(f||g));
		System.out.println("not:" +(!g));
		System.out.println("not:" +(!f));
		
		//5. Bitwise Operators
		int h = 2;
		int i = 3;
		System.out.println("Bitwise &: "+(h&i));
		System.out.println("Bitwise |: "+(h|i));
		System.out.println("Bitwise ^: "+(h^i));
		System.out.println("Bitwise ~: "+(~i));
		
		//6. Unary operators:
		int j = 0;
		j++;
		j++;
		System.out.println(j);
		j--;
		System.out.println(j);
		
		//7. Shift operators:
		int k = 0;
		
	}

}
