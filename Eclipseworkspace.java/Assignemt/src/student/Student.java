package student;

class StudentClassA{
	private String name;
	private int rollNumber;
	private double marks;
	
	public StudentClassA(String name, int i, double marks ) {
		super();
		this.name = name;
		this.rollNumber = i;
		this.marks = marks;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student Data: [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + "]";
	}

	public void StudentResult() {
		System.out.println(this.rollNumber+ ". "+this.name +"'s marks is: "+this.marks);
		if(marks>=40 && marks<=100) {
			System.out.println(this.name+" has passed the exam. ");
		}else if(marks<40 && marks>=0) {
			System.out.println(this.name+ " has failed the exam. ");
		}else {
			System.out.println("Invalid Marks!");
		}
	}
}
public class Student {

	public static void main(String[] args) {
		StudentClassA student1 = new StudentClassA("Varsha",1,100);
		System.out.println(student1);
		student1.StudentResult();
		
		StudentClassA student2 = new StudentClassA("Sanjay",2,100);
		System.out.println(student2);
		student2.StudentResult();
	}

}