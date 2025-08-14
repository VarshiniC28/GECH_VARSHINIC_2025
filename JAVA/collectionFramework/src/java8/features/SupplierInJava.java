package java8.features;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInJava {

	public static void main(String[] args) {
		// SUPPLIER Functional Interface
		/*
		 * ✅ Supplier<T> is a functional interface in java.util.function package.
		 * ✅ It does NOT take any input but RETURNS a value of type T.
		 * ✅ It is often used to provide or generate values on demand.
		 * ✅ It contains only ONE abstract method: get()
		 */

		// Example: Supplier returning the current date and time
		Supplier<Date> s = () -> new Date(); // Generates a new Date object when called
		Date date = s.get(); // Calling get() to retrieve the value
		System.out.println(date);

		/*
		 * 🔹 Common Use Cases of Supplier:
		 * ===============================
		 * ✅ Generating random values (UUID, OTP, random numbers)
		 * ✅ Fetching configuration values or system properties
		 * ✅ Lazy initialization of objects
		 */

		// Example: Generating a random number using Supplier
		Supplier<Double> randomNumber = () -> Math.random(); // Generates a random number
		System.out.println("Random Number: " + randomNumber.get());

		// Example: Generating a unique ID using Supplier
		Supplier<String> uniqueIdSupplier = () -> "ID-" + System.currentTimeMillis();
		System.out.println("Generated ID: " + uniqueIdSupplier.get());
	}
}
