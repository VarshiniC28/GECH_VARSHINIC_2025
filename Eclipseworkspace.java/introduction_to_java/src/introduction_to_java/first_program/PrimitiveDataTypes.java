package introduction_to_java.first_program;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		//DATA TYPES: 1. Primitive 2. Non-primitive
		/*
		 * Primitive Data types 
		 * 1. byte = can write as 23 - (default value=0)
		 * 2. short = 200   (default value=0)
		 * 3. int= 3000      (default value=0)
		 * 4. long = 300L     (default value=0L)
		 * 5. float = 8.9f     (default value=0.0f)
		 * 6. double = 9.1     (default value=0.0)
		 * 7. char = 'a';       (default value='')
		 * 8.boolean = true / false   (default value=false)
		 * */
		
		//DECLARATION OF VARIABLE>
		/*Variable is a container used to store the values based on the datatype.
		 * <datatype> variable_name;
		 * */
		byte age;
		
		//Initialization: variable_name = value;
		age =20;
		
		//<datatype> variable_name = value;
		
		byte age1 = 21;
		
		System.out.println(age);
		System.out.println(age1);
		
		byte bt = 126;
		System.out.println("bytevalue="+bt);
		
		short st = bt;
		System.out.println("shortvalue="+st);
		
		int it = st;
		System.out.println("intvalue="+it);
		
		long lg = it;
		System.out.println("longvalue="+lg);
		
		float decimal = 8.9f;
		System.out.println("floatvalue="+decimal);
		
		double number = 9.9;
		System.out.println("double value:" +number);
	}

}
