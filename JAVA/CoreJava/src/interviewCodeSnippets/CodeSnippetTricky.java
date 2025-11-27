package interviewCodeSnippets;

public class CodeSnippetTricky {

	int i = 1; // instance variable (belongs to object, not the class)

	public static void main(String[] args) {
		
		CodeSnippetTricky c = new CodeSnippetTricky();
//		System.out.println(c.i++);
		
		//Uncomment below
//		System.out.println(i++); // ❌ Error: Cannot access non-static variable 'i' from a static context
		                         // 'main' is static → no object is created yet
		                         // To fix: make 'i' static → static int i = 1;
		                         // OR create object: new CodeSnippetTricky().i
	}

}
