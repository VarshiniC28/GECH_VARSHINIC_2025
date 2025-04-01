package predefinedFunctionInterface;

import java.util.function.Function;

public class FunctionInJava {

	public static void main(String[] args) {
		// FUNCTION Functional Interface
		/*
		 * ✅ Function<T, R> is a functional interface in java.util.function package.
		 * ✅ It takes ONE input parameter (T) and returns a result (R).
		 * ✅ It is mainly used for data transformation, computations, and mapping.
		 * ✅ It contains only ONE abstract method: apply(T t).
		 */

		// Example 1: Function to return the length of a string
		// First parameter (String) is the input type, Second (Integer) is the return type
		Function<String, Integer> f = (s) -> s.length(); // Action performed: calculate string length
		int res = f.apply("hello world"); // Passing a string and getting its length
		System.out.println("Length of String: " + res); // Output: 11

		// Example 2: Function to square a number
		Function<Integer, Integer> f1 = (s) -> s * s; // Squares the input integer
		int res1 = f1.apply(3); // Passing 3, expected output: 9
		System.out.println("Square of 3: " + res1);

		/*
		 * 🔹 Function Interface Methods:
		 * ===============================
		 * ✅ apply(T t)         -> Takes input and returns output.
		 * ✅ andThen(Function)  -> Executes another function after this.
		 * ✅ compose(Function)  -> Executes another function before this.
		 */

		// Example 3: Using andThen() to first square and then double the number
		Function<Integer, Integer> square = (n) -> n * n;
		Function<Integer, Integer> doubleValue = (n) -> n * 2;

		int result = square.andThen(doubleValue).apply(4); // (4*4) -> 16 -> (16*2) -> 32
		System.out.println("Square then Double: " + result);

		// Example 4: Using compose() to first double then square
		int result2 = square.compose(doubleValue).apply(4); // (4*2) -> 8 -> (8*8) -> 64
		System.out.println("Double then Square: " + result2);
	}
}

/*
 * 🔹 Summary:
 * ===========
 * ✔ Function<T, R> -> Takes input T, returns output R.
 * ✔ apply() -> Applies function logic on input and returns output.
 * ✔ andThen() -> First apply original function, then another.
 * ✔ compose() -> First apply another function, then original function.
 * ✔ Common Use Cases: Data transformation, computations, conversions (e.g., String -> Integer)
 *
 * 🔹 How to Read More:
 * ====================
 * - In Eclipse/IntelliJ: Open JRE System Library → java.base → java.util.function → Function<T, R>
 * - Official Docs: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html
 */
