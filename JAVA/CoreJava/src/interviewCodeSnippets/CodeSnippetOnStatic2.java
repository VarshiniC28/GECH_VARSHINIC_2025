package interviewCodeSnippets;

public class CodeSnippetOnStatic2 {

	int i = 5; // instance variable, belongs to the object

	public static void main(String[] args) {

		System.out.println(++i); // error: cannot access instance variable 'i' directly since no object is created yet
		// To fix: create an object, then access it: System.out.println(++new CodeSnippetOnStatic2().i);
	}

}
