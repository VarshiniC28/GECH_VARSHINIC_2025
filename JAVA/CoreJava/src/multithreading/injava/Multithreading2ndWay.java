package multithreading.injava;
import java.util.Scanner;

class Adding implements Runnable{ //Runnable functional interface
	@Override
	public void run() {
		//1st task
		System.out.println("Adding started");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()+sc.nextInt());
		System.out.println("Adding completed");
	}
}

class PrintChars implements Runnable{
	@Override
	public void run() {
		//2nd task - chars
				System.out.println("Printing characters");
				for(int i=65; i<=69; i++) {
					System.out.println((char)i);
					
					try {
						Thread.sleep(2000);			
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("Printing characters completed");
	}
}

class PrintNum implements Runnable{
	@Override
	public void run() {
		//3rd task - num
				System.out.println("Printing numbers");
				for(int i=1; i<=10; i++) {
					System.out.println(i);
					
					try {
						Thread.sleep(2000);			
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("Completed");
	}
}


public class Multithreading2ndWay {

	public static void main(String[] args) {
		
		//Note: Thread class implements Runnable Interface

		//2nd way of achieving is by implementing Runnable functional interface.
		/*Why there is 2nd method ? Because in first method there is disadvantage 
		 * i.e we cant achieve multiple inheritance with class 
		 * so there is Runnable Functional interface with run() method which can help us solve this diamond problem and also achieve multi-threading.
		 */
		
		//When we create object for classes implementing Runnable interface there will be no separate small stacks for each class as in first method, 
		//So we must create 3 objects of Thread class directly as below it will create 3 small stacks - Thread-0 , Thread-1, Thread-2 in heap segment.
		//And pass the reference vars of the classes that are implementing runnable interface to Constructor of the thread objects.
		Adding a = new Adding();
		PrintChars pc = new PrintChars();
		PrintNum pn = new PrintNum();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(pc);
		Thread t3 = new Thread(pn);
		
		//Now to make respective run() methods go sit in small stacks of each threads we use start() - which will result concurrent execution.
		t1.start();
		t2.start();
		t3.start();
		
		//Then Thread scheduler tells JVM to assign schedules for each threads as same in first method.
	}

}
