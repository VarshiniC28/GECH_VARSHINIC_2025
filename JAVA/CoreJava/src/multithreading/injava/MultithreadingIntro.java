package multithreading.injava;
import java.util.Scanner;

class Demo extends Thread{
	@Override
	public void run() {
		//1st task
		System.out.println("Adding started");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()+sc.nextInt());
		System.out.println("Adding completed");
	}
}

class Demo1 extends Thread{
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

class Demo2 extends Thread{
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


public class MultithreadingIntro {

	public static void main(String[] args) {

		//Multi-thrading - Multiple/many threads
		//Threads - Thread is collection of instructions which is executed independently which a part of process
		//Multi-threading is the concurrent execution of two or more threads to perform tasks simultaneously, maximizing CPU utilization and improving application performance.
		
		
		//Multi-threading code - Has dependent processes(even though they are independent) because , tasks are executed one after another sequentially but we can make it run concurrently using multi - threading 
		//In java main method stack frame is also considered as Thread 
		
		//to make these tasks independent we can put each of them in run() methods from Thread class as above.
		
		//small stack for d will be created inside stack segment(after as usual Object memory is allocated inside Heap) when we create object for a class that extends to Thread class, and this small stack is Thread-0(for first object of class with first task).
		//Then similarly small stack for d1 is created in stack segment called as Thread-1
		//Then similarly small stack for d2 is created in stack segment called as Thread-2
		Demo d =new Demo();
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();

		//As per principle of Multi-threading we must not call run() methods directly instead they should be called using start method .
		//When d.start() is called this start method's stack frame is created inside Thread-0 small stack which is inside Stack segment
		d.start();
		//When d1.start() is called this start method's stack frame is created inside Thread-1 small stack which is inside Stack segment
		d1.start();
		//When d.start() is called this start method's stack frame is created inside Thread-2 small stack which is inside Stack segment
		d2.start();
		
		//there is a software like RTS, compiler called Thread Scheduler which schedules threads which are independent.
		//Thread Scheduler tell JVM to start executing from 0, and based on delays, to save time, it will schedule other threads to execute., after all are executed it is terminated
	}

}
