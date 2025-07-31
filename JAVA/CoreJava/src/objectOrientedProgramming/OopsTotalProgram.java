package objectOrientedProgramming;

import java.util.Scanner;

abstract class Shape{
	float area; //cant be private since all classes need area 
	abstract void acceptInput() ;
	abstract void calcArea();
	public void dispArea() { //acts like getter , since it gets the o/p
		System.out.println("The area of "+ " is: " +area);
	}
}

class Square extends Shape{
	private float side;
	
	@Override
	public void acceptInput() { //behaves like setter as it gets input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side: ");
		side = sc.nextFloat();
	}
	
	@Override
	void calcArea() {
		area = (float)Math.pow(side, 2); //because the inbuilt class has this pow method which takes parameters as double, but our are var is float so explicit type casting is needed
	}

}

class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	
	@Override
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		length = sc.nextFloat();
		System.out.print("Enter the breadth: ");
		breadth = sc.nextFloat();
	}
	
	@Override
	void calcArea() {
		area = length*breadth;
	}
	
}	

class Circle extends Shape{
	
	float radius;
	@Override
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = sc.nextFloat();
	}
	
	@Override
	void calcArea() {
		area = (float) (Math.PI*(Math.pow(radius, 2)));
	}
}

//Polymorphism through loose coupling if asked

class Geometry{
	
	void maths(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}


public class OopsTotalProgram {

	public static void main(String[] args) {

		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		g.maths(s);
		g.maths(r);
		g.maths(c);
	}

}
