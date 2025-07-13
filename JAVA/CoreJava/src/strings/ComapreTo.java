package strings;

public class ComapreTo {

	public static void main(String[] args) {

		//Comparing strings using compareTo()--continuation of StringsIntro Class refer it:
		
		String s1 = "SACHIN";
		String s2 = "SAURAV";
		
		System.out.println(s1.compareTo(s2)); //-18
//Will comapre char by char -  S and S- true, A and A - true, C and U - false: subtract ASCII values of both=> 67-85= -18
//s1<s2 : -ve value will be returned (based on ASCII values : 67<85, Hence -ve value)
//Hence we understand based on the value - -ve : s1<s2, +ve : s1>s2, 0 : s1=s2
		
		//So if these are made vice versa will get +ve
		s1 = "SAURAV"; //// we are not modifying the string, just changing the reference variable to a new object
		s2 = "SACHIN";
		System.out.println(s1.compareTo(s2)); //18 //+ve //s2<s1
		
		String s3 = "SACHIN";
		String s4 = "SACHIN";
		int m = s3.compareTo(s4);
		System.out.println(m);// 0 //since they both are equal
		
		if(m>0) {
			System.out.println("string 1 is greater than string 2");
		}else if(m<0) {
			System.out.println("String 2 is greater than string 1");
		}else {
			
		}
		
		// Case 1: Unequal length, compared char-by-char, no difference found, so compare by length
		String s5 = "JAVA";     // After matching 'A', there are 0 remaining chars
		String s6 = "JAVAC";    // After matching 'A', there is 1 more char 'C'
		System.out.println(s5.compareTo(s6)); // -1 → 0 - 1 (s5 is shorter) → s5 < s6

		// Case 2: Reversed from above
		String s7 = "JAVAC";    // After matching 'A', 1 more char
		String s8 = "JAVA";     // After matching 'A', 0 more char
		System.out.println(s7.compareTo(s8)); // 1 → 1 - 0 → s7 > s8

		// Case 3: More difference in length
		String sa = "JAVAJAVA"; // Same up to "JAVA", then has 4 extra chars
		String sb = "JAVA";     // Ends after "JAVA"
		System.out.println(sa.compareTo(sb)); // 4 → sa has 4 extra chars → sa > sb

		// Case 4: concat() doesn't modify original string unless reassigned
		String sc = "JAVA";
		System.out.println(sc); // JAVA
		sc.concat("Programming"); // Creates new String "JAVAPROGRAMMING" but not assigned
		System.out.println(sc); // JAVA → original string unchanged (immutable)

		
		
		
		
		
		
		
		/*Q: If strings are immutable, how can we reassign them like s1 = "NewValue"?
		Strings are immutable, so their content cannot be modified.
		But string reference variables like s1 can point to different string objects.
		When we do s1 = "NewValue", we are not modifying the original object,
		we're just changing the reference to a new object.*/		
		
	}

}
