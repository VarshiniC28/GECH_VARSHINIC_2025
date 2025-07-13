package strings;

public class StringConcatenationUsingPlusSymol {

	public static void main(String[] args) {

		//String concatenation:
		//==> Adding to 2 Strings which results in new String, String is immutable
		String s1 = "JAVA";
		String s2 = "PYTHON";
		String s3 = "JAVA"+"PYTHON";
		String s4 = "JAVA"+"PYTHON";
		
		System.out.println(s3==s4);//true JAVAPYTHON in scp is already there, so s3 and s4 will have same address. 
		System.out.println();
		
		s3 = s1+s2;
		s4 = s1+s2;
		System.out.println(s3==s4);
		//false because when we concatenate  " "+" "  with values/that object will be created on SCP and will have same address, since they are equal
		// but when we concatenate using reference s1+s2 then brand new obj is created in heap area, so s3 and s4 will have diff addresses.
		System.out.println();
		
		s3 = s1+"PYTHON";
		s4 = s1+"PYTHON";
		System.out.println(s3==s4);
		//false because when we concatenate  ref+" " or " "+ref with ref and value , new obj will be created in heap area., s3 and s4 will have diff obj address, hence false.
		System.out.println();
	}

}
