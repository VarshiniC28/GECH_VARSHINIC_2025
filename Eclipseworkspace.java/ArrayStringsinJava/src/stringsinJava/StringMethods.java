package stringsinJava;

public class StringMethods {

	public static void main(String[] args) {
		//String Methods:
		
		/*
		 * 1. equals
		 * 2. ==
		 * 3. compareTo
		 * 4. toUpperCase
		 * 5. toLowerCase
		 * 6. trim
		 * 7. concat
		 * 8. startsWith
		 * 9. endsWith
		 * 10. strip
		 * 11. equalsignorecase
		 * 12. isBlank()
		 * */
		
		String str1 =new String("HellO ab");
		String str2 =new String("Hello ab");
		String str3 = new String(" ");
		
		//1. equals
		System.out.println("equals: "+str1.equals(str2));
		
		//2. equalsignorecase = ignores case difference
		System.out.println("equalsIgnoreCase: "+str1.equalsIgnoreCase(str2));
		
		//3. == 
		System.out.println("== symbol : " +(str1==str2));
		
		//4. concat
		System.out.println(str1.concat(" ").concat(str2).concat(" hi"));
		
		//5.toUpperCase
		System.out.println(str1.toUpperCase());
		
		//6. toLowerCase;
		System.out.println(str1.toLowerCase());
		
		//7. strip()
//		trim() → Removes only leading and trailing spaces (ASCII space U+0020).
//		strip() → Removes leading and trailing Unicode whitespace (includes special spaces like \u2003, \u00A0, etc.).
		System.out.println("Before strip: [" + str1 + "]");
        System.out.println("After strip: [" + str1.strip() + "]");
		
		//8. compareTo
		System.out.println(str1.compareTo(str2));
		
		//9. trim
		System.out.println(str1.trim());
		
		//10. startsWith
		System.out.println(str1.startsWith("e"));
		System.out.println(str1.startsWith("H"));
		
		//11. endsWith
		System.out.println(str1.endsWith(" "));
		
		//12. isBlank()
		System.out.println(str3.isBlank());
	}

}
