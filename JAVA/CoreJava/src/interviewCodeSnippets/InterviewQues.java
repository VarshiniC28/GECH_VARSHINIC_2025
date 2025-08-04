package interviewCodeSnippets;

public class InterviewQues {

	public static void main(String[] args) {

//		dis(); //here static member is accessing instance member, since instance can be accessed by only instance members
		
		disp(); //can be accessed as it is static
		
		//int[] arr = new int[Integer.MAX_VALUE]; //OutOfMemoryError, since that much heap memory is not available.
		
		disp1();
	}
	
	void dis() {
		
	}
	

	static void disp() {
		//disp(); //function calling itself is called as recursion. 
		//StackOverflowError will be occurred which is runtime error, since there is lack of resources, i.e the stack frames for disp will be keep repeatedly created in stack segment and once stack memory is filled and there will be overflow.
	}

	
	//Can we handle the stack over flow error? Yes we can handle runtime errors using try and catch block as below
	
	static void disp1() {
		try {
			disp1();
		}
//		catch(StackOverflowError e) {
//			System.out.println("Handled run time error using try and catch");
//			System.out.println(e.getMessage());
//		}
		catch(Error e) { //same as Exception Error is also a generic inbuilt Error class in java
			System.out.println("handled");
		}
	}
	
}
