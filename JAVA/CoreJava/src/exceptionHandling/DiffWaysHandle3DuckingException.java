package exceptionHandling;
import java.util.Scanner;

class Demo1{
	void alpha() throws Exception{ //escaped exception by just warning there will be exception but not handling it - this is called ducking
		System.out.println("Connection established.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numerator: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the denominator: ");
		int b  =sc.nextInt();
		
		int c = a/b;
		System.out.println(c);
		
		System.out.println("Connection terminated");
		sc.close();
	}
}

public class DiffWaysHandle3DuckingException {

	public static void main(String[] args)  { //now main method is also escaping if here also there is throws Exception, hence Default Exception handler will come in picture
		
		//Ducking : its escaping of the exception
		
		Demo1 d = new Demo1();
		try {
			d.alpha();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
