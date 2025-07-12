package arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		// Jagged Array:
		// ○ Used to store irregular (non-rectangular) data in 2D form

//		int[][] a = new int[2][5];
		// Example: 2 classrooms → one has 3 students, another has 5
		// So we take 2 rows (classrooms), and columns = max students = 5

		// ⚠️ But this approach is not memory optimal
		// → First row only needs 3, but we're allocating 5 columns for both
		// → 2 unused int slots = 2 * 4 bytes = 8 bytes wasted

		int[][] a = new int[2][];
		a[0] = new int[3]; // first class has 3 students
		a[1] = new int[5]; // second class has 5 students
		
		//---------------------------------------------------------------------------------------------------
		
		//Jagged array for 2 schools, 1 with 3 class rooms and the other with 2 classrooms. 
		//1st school - 1st class - 2 students
		//1st school - 2nd class - 3 students
		//1st school - 3rd class - 3 students
		
		//2nd school - 1st class - 2 students
		//2nd school - 2nd class - 3 students
		
		int s[][][] = new int[2][][]; //2schools
		
		s[0] = new int [3][]; //1st school has 3 classes
		s[1] = new int [2][]; //2nd school has 2 classes
		
		s[0][0] = new int[2]; //1st school, 1st class
		s[0][1] = new int[3]; //1st school, 2nd class
		s[0][2] = new int[3]; //1st school, 3rd class
		
		s[1][0] = new int[2]; //2nd school, 1st class
		s[2][1] = new int[3]; //2nd school, 2nd class
		
		//____________________________________________________________________________________________________________

		
		
		
	}

}
