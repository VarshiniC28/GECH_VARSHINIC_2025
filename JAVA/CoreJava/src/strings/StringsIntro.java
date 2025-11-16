package strings;

public class StringsIntro {

	public static void main(String[] args) {

		//Strings:
		/* => Strings are sequence of characters and enclose in " ".
		 * => Strings are objects of inbuilt final class String in Java.
		 * => Strings are immutable.  once created, their value cannot be changed.
		 * => String is widely used for storing text values, passwords, inputs, etc.
		 * => There is both immutable and mutable, where immutable belongs to inbuilt String class and mutable String belongs to class StringBuilder and StringBuffer.
		 * */
		
		//Different ways to create Immutable Strings:
		//1. Using string literal (stored in String Pool):
		String s = "Java";
		
		//2. Using new keyword (stored in Heap):
		String st = new String("Java");
		
		//3. From character Array
		char[] c = {'J','a','v','a'};
		String str = new String(c);
		
		//---------------------------------------------------------------
		//Strings are stored in heap memory as they are objects (Heap memory has SCP and heap area)
//		• Java stores string literals i.e Without new keyword in a special memory area called the **String Constant Pool (SCP)** and duplicates are not allowed
//		• When we use `new String("text")`, it creates a new object in Heap area even if the same string already exists in SCP(duplicates are allowed)	
		
		//-----------------------------------------------------------
		
		//Strings Comparision:
/*		1. `equals()`       → compares value  
		2. `==`             → compares reference (address)  
		3. `compareTo()`    → strings are compared character by character.
		returns:
		     - 0 if equal
		     - +ve if s1 > s2
		     - -ve if s1 < s2
		4.equalsIgnoreCase() → Strings are compared based by ignoring case.
		*/
		
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		System.out.println(s1==s2); //compares address/reference //true since scp doesnt allow duplicates, s1 and s2 will have same address and points to same obj that has JAVA
		System.out.println(s1.equals(s2)); //compares values //since values are same it is true
		
		//-----------------------------------------------------------------
		
		String s3 = "JAVA"; //stored in SCP and its ref is given to s3
		String s4 = new String("JAVA"); //stored in heap area and its ref is given to s4
		
		System.out.println(s3==s4); //compares address/reference //false since s3 has address of obj created in SCP , and s4 has address of obj in heap area. both 2 diff objects with diff address
		System.out.println(s3.equals(s4)); //compares values //since values are same it is true
		
		//---------------------------------------------------------------------
		
		String s5 = "JAVA";
		String s6 = "jAVA";
		System.out.println(s5.equals(s6)); //false //because java is case sensitive
		System.out.println(s5.equalsIgnoreCase(s6)); //true //ignores case
		
		//-------------------------------------------------------------------------
		
		String s7 = new String("JAVA");
		String s8 = new String("JAVA");
		System.out.println(s7==s8); //false beacuse s7 and s8 creates 3 seperate new objects, since new is used it goes to heap area, and heap area allows duplicates, so 2 new objs are created
		System.out.println(s7.equals(s8)); //true
		
		//---------------------------------------------------------------------
		
		String s9 = "JAVA";
		String s10 = "java";
		System.out.println(s9==s10); //false // java case sensitive and JAVA , java will create 2 diff objects in SCP since they are not same, so when 2 obj ref is compared its diff hence false
		System.out.println(s9.equals(s10)); //false //case sensitive hence not equal
	}

}
