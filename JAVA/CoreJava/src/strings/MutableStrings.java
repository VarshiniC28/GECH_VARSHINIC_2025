package strings;

import java.util.Scanner;

public class MutableStrings {

	public static void main(String[] args) {

		//Mutable String in Java:
		//=> we create mutable string by creating object of class StringBuffer, StringBuilder
		
		//StringBuffer
		StringBuffer s = new StringBuffer();//creates new obj in heap area which has (Has part, Does part), ad this is in has which has 16 locations
		System.out.println(s.capacity()); //16 since it has 16 locations.
		
		System.out.println(s.append("JAVA")); //or new StringBuffer("JAVA");
		s.append(" JAVASCRIPT ");
		s.append("JAMESGOSLING");
		System.out.println(s);
		System.out.println(s.capacity());// increased to 34 how? may be 16 *2+2. dont know actual formula and how even this formaula works
		
		//deleting the chars inbetween
		s.delete(1, 10); //exclusive 10
		System.out.println(s);
		
		//---------------------------------------------
		
		//StringBuilder
		StringBuilder sa = new StringBuilder();
		System.out.println(sa.capacity()); //16
		sa.append("JAVA ");
		sa.append("JAVASCRIPT ");
		sa.append("JAMES GOSLING");
		System.out.println(sa);
		System.out.println(sa.capacity()); //34
		
		System.out.println(sa.reverse());
		
		sa.delete(1, 10);
		System.out.println(sa);
		
		//difference : StringBuffer methods are syncronized, StringBuilder is not syncronized
		
		//Reverse a string:
		String sv = "Varshini";
		System.out.println(sv);
		
		//reverse method is in string buffer
		//so we need to covert string to stringBuffer first and pass the string to StringBuffer obj
		StringBuffer st = new StringBuffer(sv);
		System.out.println(st.reverse());
		
//		to Use lowerCase() on stringBuffer we should convert it into String then use loweCase()
		StringBuffer svt = new StringBuffer("JAVA");
//		svt.toLowerCase(); //will give error
		String s1 = new String(svt); //now we can convert to lowercase
		System.out.println(s1.toLowerCase());
		
		//or another method is using toString()
		StringBuffer s2 = new StringBuffer("JAVA");
		String s3 = s2.toString();
		System.out.println(s3.toLowerCase());
		
		//Whatever string user give as input by keyboard is immutable
		//Cant take i/p for StringBuffer and builder.
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s6 = sc.nextLine();
		System.out.println(s6);
		
		//To print the o/p in red color we use System.err(Used to display errors) instead of System.out but should not use it to print o/p
		System.err.println(s6);
	}
	
	

}
