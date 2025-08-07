package multithreading.injava;

import java.util.Scanner;

class SingleRunMethod extends Thread{
	
	@Override
	public void run() {
		
		String name = getName();
		
		if(name.equals("ADD")) {
			adding();
		}else if(name.equals("CHARS")) {
			printchars();
		}else {
			printNums();
		}
	}
	
	void adding() {
		//1st task
				System.out.println("Adding started");
				Scanner sc = new Scanner(System.in);
//				System.out.println(sc.nextInt()/sc.nextInt()); //When we give denominator as 0 , there will be execution, only this thread will be abruptly terminated and other threads will continue executing as threads are independent.
				//Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero - So we can use try catch
				
				try {
					System.out.println(sc.nextInt()+sc.nextInt());
				}
				catch(Exception e) {
//					e.printStackTrace(); 
					System.out.println(e.getMessage());
				}
				System.out.println("Adding completed");
			}
	
	void printchars() {
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
	
	void printNums() {
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

public class MultiThreadingWithSingleRunMethod {

	public static void main(String[] args) {

//		Multi-Threading With Single Run Method
		
		//Creating 3 threads for each method
		SingleRunMethod s1 = new SingleRunMethod();
		s1.setName("ADD");
		
		SingleRunMethod s2 = new SingleRunMethod();
		s2.setName("CHARS");
		
		SingleRunMethod s3 = new SingleRunMethod();
		s3.setName("NUMS");
		
		//To make one run() method to sit in all three threads small stack also
		s1.start();
		s2.start();
		s3.start();
		
		//As usual Thread scheduler will tell JVM to execute other threads when current thread has delay
	}

}
