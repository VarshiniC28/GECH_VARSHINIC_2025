package introduction_to_java.first_program;

public class SwitchObject {

	public static void main(String[] args) {
		// we can also pass the object for switch statement
		Object obj = 1;
		switch(obj) {
		case String s -> System.out.println("string type"); 
		case Integer i -> System.out.println("Integer type"); 
		default -> System.out.println("invalid");
		}
	}

}
