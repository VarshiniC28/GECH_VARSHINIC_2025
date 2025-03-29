package com.predicatefunction;

import java.util.function.Consumer;

public class ConsumerInjava {

	public static void main(String[] args) {
		// CONSUMER
		/*
		 * it will consume the values but won't return anything
		 */
		
		// consumer is the functional interface that consume value but doenst return anything 
		// but later we use that variable and make it accept the value using accept method.
		Consumer<String> c = (s)->System.out.println(s); // here printing not returning
		c.accept("heloo");
	}

}