package exceptionInjava;

public class ExceptionInJava3 {

	public static void main(String[] args) {
		
		//Multiple catches: => When we try use multiple catch blocks it prints only one so we shpuld go from child to parent(Exception) not from parent to child
		
		int [] arr = new int[4];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		try {
			System.out.println(arr[10]);
			System.out.println(10/0); //2nd catch block for this
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Hello World");
	}

}
