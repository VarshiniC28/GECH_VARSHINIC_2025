package InheritanceInJava;

//in a file to create one more class we dont use public because there could be only one public class as default which can be accessed in the same package
// to classes we can give only 2 access specifiers : public , default(as below), final , abstract
class Student{
	//states
	public int age =23;
	public String name = "VARSHA";
	public double marks = 600;
	
	//actions
	public void isPlaying() {
		System.out.println(this.name + " is playing");
	}
	
	public void isSleeping() {
		System.out.println(this.name +" is sleeping");
	}

}

public class ClassObjectInJava {

	public static void main(String[] args) {
		
		//class: 
		/*class will represent the state and behavior of an object
		 * state -> property
		 * behavior -> action.
		 * */
		
		/*Object:
		 * Object is a implementation of class(state and action)
		 * eg:
		 * Student2
		 * =======================
		 * property:
		 * USN, name, branch
		 * 
		 * action:
		 * isPlaying(), isSleeping();
		 * =============================
		 * HOW TO DECLARE CLASS AND OBJECT
		 * 	class class_name{
		 * 		state
		 * action
		 * }
		 * ========
		 * ex:
		 * class Student{
		 * 		property:
		 * 		public int age = 30;
		 * 
		 * 		action:
		 * 		public void isPlaying(){
		 * 		syso("The student is playing");
		 * 	}
		 * }
		 * 
		 * Student std1 = new Student();
		 * ==========
		 * */
		
		// creating a object:
		// class_name obj_name = new class_name();
		
		//student 1
		Student std1 = new Student();
		System.out.println(std1.name);
		System.out.println(std1.age);
		System.out.println(std1.marks);
		std1.isPlaying();
		std1.isSleeping();
		
		//student 2
		Student std2 = new Student();
		System.out.println(std2.name);
		System.out.println(std2.age);
		System.out.println(std2.marks);
		std2.isPlaying();
		std2.isSleeping();
	}

}
