package introduction_to_java.first_program;

public class LoopingStatement {

	public static void main(String[] args) {
		/*Looping statement
		 * 1. for loop
		 * 2. while loop
		 * 3. do-while loop
		 * 4. for-each loop
		 * */
		
		//1. for loop
		//for(int i=0; condition; incr/decr){//code}
		System.out.println("for loop");
		int num = 5;
		for(int i=1; i<=num; i++) {
			System.out.println("Hello");
		}
		
		//2. while loop
		//while(condition){//code, incr/decr}
		System.out.println("While loop");
		int num1= 0;
		while(num1<=3) {
			System.out.println("Hello");
			num1++;
		}
		
		//3. do-while loop- do{//code, incr/decr}while(condition);
		System.out.println("do-while loop");
		int num2 = 1;
		do {
			System.out.println("World");
			num2++;
		}while(num2<=2);
		
		//4. for each loop
		//for(<datatype>variable-name :collection{}
		System.out.println("for each loop");
		int[] array1 = {1,2,3,4,};
		for(int a:array1) {
			System.out.println(a);
		}
		

	}

}
