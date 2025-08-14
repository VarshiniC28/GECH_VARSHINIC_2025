package java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInJava {

	public static void main(String[] args) {
		// =========================
		// Java 8 Stream API Example
		// =========================
		// A Stream in Java represents a sequence of elements supporting sequential and parallel aggregate operations.
		// It does NOT store elements — it operates on data from a source (like Collection, Array, or I/O channels).
		// Streams follow the principle: 
		// 1) Source
		// 2) Intermediate operations (transformations, filters, maps, etc.)
		// 3) Terminal operations (produce a result, end the stream)
		
		// Source: List<Integer>
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(43);
		list.add(66);
		list.add(55);
		
		// Goal: Filter odd numbers and collect them into a List
		
		// =========================
		// METHOD 1: Using separate Stream object
		// =========================
		// Creating a stream from the list (source)
		Stream<Integer> stream = list.stream();
		
		// Intermediate operation: filter()
		// filter(Predicate) keeps only those elements that satisfy the given condition
		// Here: keep numbers where (x % 2 != 0) → odd numbers
		// Terminal operation: collect()
		// collect() gathers the elements of the stream into a container (like List, Set, Map, etc.)
		List<Integer> numbers = stream
									.filter((x) -> x % 2 != 0)
									.collect(Collectors.toList());
		System.out.println("numbers: " + numbers); // prints list of odd numbers
		
		// =========================
		// METHOD 2: Chaining directly
		// =========================
		// Here, we don’t store the intermediate Stream in a variable
		// Instead, we create, filter, and collect in one line.
		// NOTE: A Stream can only have ONE terminal operation; once used, it is closed and cannot be reused.
		List<Integer> number = list
									.stream() // create stream
									.filter((x) -> x % 2 != 0) // keep only odd
									.collect(Collectors.toList()); // collect into list
		System.out.println("num list: " + number);
		
		// =========================
		// Important Points:
		// =========================
		// 1) Stream operations are lazy — intermediate operations don’t run until a terminal operation is invoked.
		// 2) Common Intermediate Ops: filter(), map(), sorted(), distinct(), limit(), skip()
		// 3) Common Terminal Ops: collect(), forEach(), reduce(), count(), anyMatch(), allMatch(), findFirst()
		// 4) Streams don’t modify the source; they produce a new result.
		// 5) A Stream can be consumed only once. If you need to use it again, create a new one from the source.
		// 6) collect() is a terminal operation that uses the Collectors utility class.
		//    - Collectors.toList(), Collectors.toSet(), Collectors.joining(), etc.
		
		Integer num = list.stream().filter((y)-> y%2==0).reduce(0, (a, b) -> a + b);
		System.out.println(num);
		
		long num1 = list.stream().filter((y)->y<50).count();
		System.out.println(num1);
	}
}
