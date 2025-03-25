package shape;

class Shapes{
	public void calculateArea(){
		System.out.println("Calculate the area of a shape: ");
	}
}

class Circle extends Shapes{
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public void calculateArea() {
		System.out.println("Area of circle is "+ (Math.PI*this.radius*this.radius));
	}
}
class Rectangle extends Shapes{
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void calculateArea() {
		System.out.println("Area of Rectangle: "+this.length*this.breadth);
	}
}
public class shape {

	public static void main(String[] args) {
		Shapes shape = new Shapes();
		shape.calculateArea();
		Circle circle = new Circle(4);
		circle.calculateArea();
		Rectangle rectangle = new Rectangle(5,4);
		rectangle.calculateArea();
	}

}
