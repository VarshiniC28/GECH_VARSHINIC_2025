package predefinedFunctionInterface;

import java.util.function.Function;

public class FunctionInJava {

	public static void main(String[] args) {
		// TFUNCTION
		/*
		 * IT WILL TAKE ONE PARAMETER THEN PERFORM THE ACTION AND RETURN THE VALUE
		 */
//		first parameter is the parameter type and second on is the return type
		Function<String, Integer> f = (s)->s.length(); // action perform //int
		int res = f.apply("hello world"); // parameter taking // STring
		System.out.println(res);
		
		// squaring number
		Function<Integer, Integer> f1 = (s)->s*s; //integer
		int res1 = f1.apply(3); //integer
		System.out.println(res1);

	}

}

// go for java 8 function --click one JRE system library --> click java.basa-- click java.util.function
// there u can read about function and refer 