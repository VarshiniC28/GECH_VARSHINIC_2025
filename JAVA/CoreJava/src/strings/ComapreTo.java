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
		
		/*Q: If strings are immutable, how can we reassign them like s1 = "NewValue"?
		Strings are immutable, so their content cannot be modified.
		But string reference variables like s1 can point to different string objects.
		When we do s1 = "NewValue", we are not modifying the original object,
		we're just changing the reference to a new object.*/		
		
	}

}
