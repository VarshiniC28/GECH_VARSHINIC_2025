package arrays;

public class DeclarationInstantiation {

	public static void main(String[] args) {
		
		//Drawbacks of Array:
//		○ Arrays can only store homogeneous data 
//		○ Array cannot grow or shrink in size once declared - Fixed size.
//		○ Array requires Contiguous memory allocation not dispersed.
//		Hence to overcome we use collection framework and ArrayList or Linked List in that.
		
		/** Advantages of array:
		 * 1. Random access.
		 * 2. type safety - the elements inside the array is based on one datatype.
		 * 3. type casting - To print the element in arrays - no need to type cast. 
		 * */
		
		//Different type of declaration and instantiation for 1D
		int [] a = new int[5];
		//or
		//When we already know the data use this and below method, otherwise we use the same as above
		int [] b =new int[] {1,2,3,4,5}; 
		//or
		int [] c = {1,2,3,4,5};
		
		//----------------------------------------------------------------
		
		//Different type of declaration and instantiation for 2D
		int [][] d = new int[3][4];
		//or
		//When we already know the data use this and below method, otherwise we use the same as above
		int [][] e ={{1,2,3,4}, {5,6,7,8}, {1,2,3,4}}; 

		//----------------------------------------------------------------
		
		//Different type of declaration and instantiation for 2D Jagged Array
		int [][] f = new int[3][];
		d[0] = new int[4]; 
		d[1] = new int[6]; 
		d[2] = new int[3]; 
		//or
		//When we already know the data use this and below method, otherwise we use the same as above
		int [][] g ={{1,2,3,4}, {5,6,7,8,9,10}, {1,2,3}}; 
		
		//----------------------------------------------------------------
		
		//Different type of declaration and instantiation for 3D Array
		//When we already know the data use this and below method, otherwise we use the same as above
		int [][][] h ={{{1,2,3,4},{4,5,6,7}},{{1,2,3,4},{5,6,7,8}}}; 
	}

}
