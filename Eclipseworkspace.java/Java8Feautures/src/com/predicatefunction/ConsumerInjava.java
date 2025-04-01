package com.predicatefunction;

import java.util.function.Consumer;

public class ConsumerInjava {

	public static void main(String[] args) {
		// CONSUMER
		/*
		 * 🔹 Consumer Functional Interface:
		 * =================================
		 * ✅ Belongs to `java.util.function` package.
		 * ✅ Represents an operation that **takes an input but does NOT return a result**.
		 * ✅ Used for performing **operations like logging, printing, storing, etc.**
		 * ✅ It has **one abstract method**:
		 *    - `void accept(T t)`: Performs operation on the given input.
		 * ✅ It has **one default method**:
		 *    - `Consumer<T> andThen(Consumer<? super T> after)`: Chains multiple consumers.
		 */

		// Simple Example: Consumer that prints a given string
		Consumer<String> c = (s) -> System.out.println(s); // Here it prints, not returns
		c.accept("Hello, Consumer Interface!"); // Output: Hello, Consumer Interface!

		// Using `andThen()` to chain multiple Consumers
		Consumer<String> c1 = s -> System.out.println("First Consumer: " + s);
		Consumer<String> c2 = s -> System.out.println("Second Consumer: " + s);
		Consumer<String> combinedConsumer = c1.andThen(c2);
		combinedConsumer.accept("Chaining Example");
		/*
		 * Output:
		 * First Consumer: Chaining Example
		 * Second Consumer: Chaining Example
		 */

		// Real-World Use Case: Logging system
		Consumer<String> logInfo = msg -> System.out.println("INFO: " + msg);
		Consumer<String> logError = msg -> System.out.println("ERROR: " + msg);
		logInfo.accept("Application started");
		logError.accept("Null Pointer Exception");
	}
}
