package multithreading.injava;
import java.util.Scanner;

class Dividing implements Runnable{ //Runnable functional interface
	@Override
	public void run() {
		//1st task
		System.out.println("Dividing started");
		Scanner sc = new Scanner(System.in);
//		System.out.println(sc.nextInt()/sc.nextInt()); //When we give denominator as 0 , there will be execution, only this thread will be abruptly terminated and other threads will continue executing as threads are independent.
		//Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero - So we can use try catch
		
		try {
			System.out.println(sc.nextInt()/sc.nextInt());
		}
		catch(Exception e) {
//			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		System.out.println("Dividing completed");
	}
}

class PrintChar implements Runnable{
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

class PrintNums implements Runnable{
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


public class MultithreadingException {

	public static void main(String[] args) {
		
		Dividing a = new Dividing();
		PrintChar pc = new PrintChar();
		PrintNums pn = new PrintNums();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(pc);
		Thread t3 = new Thread(pn);
		
		t1.start();
		t2.start();
		t3.start();
		
		//Every java program will have atleast one thread i.e main thread, hence if there is any exception while in main method we get Exception in main thread.
		
	}

}
