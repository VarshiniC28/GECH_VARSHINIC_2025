	package interviewCodeSnippets;
	
	class NextQues {
	    
	    int a; // instance variable (belongs to the object, not class)

	    static { //uncomment below line
//	        System.out.println(a); // ❌ Error: Cannot make a static reference to non-static variable 'a'
	                               // Explanation: 'a' is tied to an object (instance of the class),
	                               // but static blocks run **before** any object is created,
	                               // so there’s no instance memory available to refer to 'a'.
	    }

	    //**Static can be accessed by both static and non-static members, but instance members can only be accessed by non-static (object-level) code.**

	    
	    {
	        System.out.println(a); // ✅ Valid: This is an instance initializer block
	                               // It runs *when an object is created*, so instance variable 'a' exists
	    }
	}

	
	class Em{
		static {
			System.out.println("Hi");
		}
	}
	public class CodeSnippetOnStatic {
		
		public static void main(String[] args) {
			
			Em e = new Em();
			
//			System.out.println("Hello");
			
			
			//Output: Hello , because first static main method will be loaded and Hi will be executed only if its needed that e class is loaded i=here in main method by creating object.
			//But if we create a object for e, static block will be first executed first then Hello
			
			NextQues q = new NextQues();
		}
	
	}
