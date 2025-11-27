package accessModifiers.Static;

class Demo1{
	
	static int a;
	
	static{
		System.out.println("Inside static block");
	}
	
	static void method() {
		System.out.println("Inside static method");
	}
}

class OuterClass{ //Outer class cant be static 
	
	static class innerClass{ //Inner class can be static which can access only static members of outer class.
		
	}
}

public class StaticClass {

	public static void main(String[] args) {

		//Since we are accessing the static using class name not object we call it as Class members.
		//Similarly instance var, blocks, methods are called as Object members/Instance members(Object is Instance of class) since they need Object creation to execute.
		System.out.println(Demo1.a);
		Demo1.method();
		
		//Integer.pareseInt() - Integer is a class and parseInt is a static method hence called directly using class name.
		//Integer.MAX_VALUE - MAXVALUE is also a static method
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
