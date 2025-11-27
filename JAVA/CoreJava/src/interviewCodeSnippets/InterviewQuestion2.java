package interviewCodeSnippets;

public class InterviewQuestion2 {
	
	//1 + 11 + 111 + 1111 + ..... Till n terms
	
	    // Function for finding summation
	    static int summation(int n){
	        int sum = 0, j = 1;
	        for (int i = 1; i <= n; i++) {
	            sum = sum + j;
	            j = (j * 10) + 1;
	        }

	        return sum;
	    }

	public static void main(String[] args) {

		 int n = 15;
		 System.out.println(summation(n));
	}

}
