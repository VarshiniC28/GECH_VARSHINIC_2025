package stringsinJava;

public class StringsInJava {

	public static void main(String[] args) {
		/*
		 * STRINGS: It is a group of characters.
		 * => strings are immutable i.e once assigned we cant change the value but can reassign the value.
		 * Ex: table
		 * --> need to close within "".
		 * 
		 * HOW TO DECLARE THE STRING:
		 * 1. USING STRING LITERAL:
		 * String var_name = "string_value"
		 * 
		 * 2. using new keyword:
		 * String var_anme = new String("sting_value");
		 * */
		
		String str1 = "String1";
		System.out.println(str1);
		
		String str2 = new String("String1");
		System.out.println(str2);
		
		String str3 = "String1";
		String str4 = new String("String1");
		
		//checking the relation between 2 strings:
		//Checking values using equals method
		System.out.println(str1.equals(str2)); //Checks for values //O/P : true
		System.out.println(str1==str2); // check for references/addresses //O/P : false
		
		System.out.println(str1==str3); //true
		System.out.println(str1.equals(str3));//true
		
		System.out.println(str2==str4);//false because we use new keyword for both so str2 and str4 creates 2 seperate objects though both stored in heap as references becomes different
		System.out.println(str2.equals(str4));// true since values are same.
		
		//===========================================================
		
		//Strings are immutable:
		String str5 = new String("String5");
		str5.concat("Hello");
		System.out.println(str5); // String5 (immutable)cant change
		
		//but can reassign values
		str5 = "Str";
		System.out.println(str5);
		
	}

}
