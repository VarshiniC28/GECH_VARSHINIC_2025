package interviewCodeSnippets;

public class InterviewQues {

	public static void main(String[] args) {

//		dis(); //here static member is accessing instance member, since instance can be accessed by only instance members
		
		disp(); //can be accessed as it is static
		
		int[] arr = new int[Integer.MAX_VALUE]; //OutOfMemoryError, since that much heap memory is not available.
	}
	
	void dis() {
		
	}
	
	static void disp() {
		//disp(); //function calling itself is called as recursion. 
		//StackOverflowError will be occurred which is runtime error, since there is lack of resources, i.e the stack frames for disp will be keep repeatedly created in stack segment and once stack memory is filled and there will be overflow.
	}

	
}
