package com.predicatefunction;

import java.util.function.Predicate;

public class PredicateFunctionInJava {

	public static void main(String[] args) {
		// ✅ PREDICATE IN JAVA
		// ======================
		/*
		 * 🔹 Predicate is a in built **functional interface** (java.util.function.Predicate<T>)
		 * 🔹 It represents a **boolean-valued function** (a condition/logic that returns true or false).
		 * 🔹 It contains **only one abstract method**:
		 *     - `boolean test(T t)` → Evaluates a condition on input `t` and returns true/false.
		 * 🔹 Used for filtering, validation, and conditional logic.
		 * 🔹 Commonly used in **Streams and Collections**.
		 */
		
		// 🟢 Example: Check if a number is EVEN using Predicate
		Predicate<Integer> p = (a) -> a % 2 == 0;
		System.out.println(p.test(34)); // ✅ Output: true (since 34 is even)
		System.out.println(p.test(13)); // ✅ Output: false (since 13 is odd)
		
		/*
		 * 🔹 Common Predicate Methods:
		 * =============================
		 * ✅ `test(T t)`        -> Tests if `t` satisfies the condition (returns boolean)
		 * ✅ `negate()`         -> Returns a predicate that reverses the condition
		 * ✅ `and(Predicate p)`  -> Combines two predicates with AND logic
		 * ✅ `or(Predicate p)`   -> Combines two predicates with OR logic
		 */
		
		// 🟢 Example of `negate()`: Check if a number is ODD
		Predicate<Integer> isOdd = p.negate();
		System.out.println(isOdd.test(34)); // ✅ Output: false (since 34 is even)
		System.out.println(isOdd.test(13)); // ✅ Output: true (since 13 is odd)
		
		// 🟢 Example of `and()`: Check if a number is EVEN **and** greater than 10
		Predicate<Integer> isGreaterThan10 = (a) -> a > 10;
		Predicate<Integer> isEvenAndGreaterThan10 = p.and(isGreaterThan10);
		System.out.println(isEvenAndGreaterThan10.test(8));  // ❌ Output: false (even but not > 10)
		System.out.println(isEvenAndGreaterThan10.test(12)); // ✅ Output: true  (even and > 10)
		
		// 🟢 Example of `or()`: Check if a number is EVEN **or** greater than 10
		Predicate<Integer> isEvenOrGreaterThan10 = p.or(isGreaterThan10);
		System.out.println(isEvenOrGreaterThan10.test(8));  // ✅ Output: true (even)
		System.out.println(isEvenOrGreaterThan10.test(15)); // ✅ Output: true (> 10)
		System.out.println(isEvenOrGreaterThan10.test(7));  // ❌ Output: false (neither even nor > 10)
		
		/*
		 * 🔹 Where is Predicate Used?
		 * ============================
		 * - Stream API (filtering elements)
		 * - Data validation (e.g., checking user input)
		 * - Conditional checks (e.g., checking eligibility)
		 * - Logging and debugging conditions
		 */
	}
}
