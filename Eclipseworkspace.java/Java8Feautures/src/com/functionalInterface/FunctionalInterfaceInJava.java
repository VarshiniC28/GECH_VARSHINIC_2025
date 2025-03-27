package com.functionalInterface;

@FunctionalInterface // (Its optional) by using this annotation we can create only one abstract
						// method , but if we remove it we can add multiple functions.
interface Interface1 {
	public void display();

}

class Display implements Interface1 {

	@Override
	public void display() {
		System.out.println("Hiiiiiiiiiiii!!!!!");

	}

}

public class FunctionalInterfaceInJava {

	public static void main(String[] args) {
		Display display = new Display(); //Traditional way of using interface.
		display.display();

	}

}
