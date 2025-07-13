package strings;

public class StringConcatenationUsingConcat {

	public static void main(String[] args) {

		//Concatenation using concat()
		String s1 = "JAVA";
		String s2 = "PYTHON" ;
		
		//Whenever we use concat() new obj is created inside heap area in heap segment not in StringsConstantPool
		String s3= "JAVA".concat("PYTHON"); 
		//Whenever we use .concat() the brand new object is created in Heap Segment's Heap area and address is stored in s3 which is inside Stack segment.
		String s4= "JAVA".concat("PYTHON"); //same goes with this new obj is created in heap area, and s4 stores the address of it.
		
		System.out.println(s3==s4); //false, since ref vars have diff address
		System.out.println(s3.equals(s4)); //true //since values are same
		
		s3 = s1.concat("PYTHON");
		s4 = s1.concat("PYTHON");
		System.out.println(s3==s4); //false, since ref vars have diff address (using concat hence new obj for both in heap area)
		System.out.println(s3.equals(s4)); //true //since values are same
		
		s3 = s1.concat(s2);
		s4 = s1.concat(s2);
		System.out.println(s3==s4); //false, since ref vars have diff address (using concat hence new obj for both in heap area)
		System.out.println(s3.equals(s4)); //true //since values are same
		
	}

}
