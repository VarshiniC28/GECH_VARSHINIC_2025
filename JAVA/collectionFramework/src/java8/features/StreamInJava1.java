package java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInJava1 {

	public static void main(String[] args) {
		// after applying the termination operation on stream  we cannot reuse it
		// for each stream we can use only one termination operation
		// example :
		
		List<Integer> list = Arrays.asList(12, 4, 5, 65, 87, 1);

		Stream<Integer> stream = list.stream().filter(x -> x > 10);
		Long res = stream.count();
		System.out.println("count of no > 10: " + res);

		// stream is already closed by count termination and if we use below collect operation again 
		// it shows the error ==> stream has already been operated upon or closed
		// List<Integer> result1 = stream.collect(Collectors.toList()); // ❌ Error
		// Long res1 = stream.count(); // ❌ Error

		// ===============================
		// Examples of Intermediate & Terminal Operations
		// ===============================

		// Source
		List<String> names = Arrays.asList("apple", "banana", "mango", "banana", "kiwi", "orange");

		// --- Intermediate Operations ---
		List<String> processedNames = names.stream()
				.filter(name -> name.length() > 4)    // keep names longer than 4 letters
				.distinct()                           // remove duplicates
				.sorted()                             // sort alphabetically
				.map(String::toUpperCase)             // convert to uppercase
				.limit(3)                             // keep only first 3 elements
				.collect(Collectors.toList());        // terminal operation
		System.out.println("Processed Names: " + processedNames);

		// --- Terminal Operation: forEach() ---
		System.out.print("Names in uppercase: ");
		names.stream()
				.map(String::toUpperCase)
				.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// --- Terminal Operation: anyMatch(), allMatch(), noneMatch() ---
		boolean hasBanana = names.stream().anyMatch(s -> s.equals("banana"));
		System.out.println("List contains 'banana'? " + hasBanana);

		boolean allShorterThan10 = names.stream().allMatch(s -> s.length() < 10);
		System.out.println("All names shorter than 10 letters? " + allShorterThan10);

		boolean noneStartsWithZ = names.stream().noneMatch(s -> s.startsWith("z"));
		System.out.println("No name starts with 'z'? " + noneStartsWithZ);

		// --- Terminal Operation: findFirst() ---
		names.stream()
				.filter(s -> s.startsWith("b"))
				.findFirst()
				.ifPresent(s -> System.out.println("First name starting with 'b': " + s));

		// --- Terminal Operation: reduce() ---
		int sum = Arrays.asList(1, 2, 3, 4, 5).stream()
				.reduce(0, (a, b) -> a + b); // initial value 0, sum all numbers
		System.out.println("Sum of numbers: " + sum);
	}
}
