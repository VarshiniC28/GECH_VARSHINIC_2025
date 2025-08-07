package multithreading.injava;

class Alp extends Thread{
	@Override
	public void run() {
		try{
			System.out.println(getName()+" started to executing");
			sleep(3000);
			System.out.println(getName()+" is executing");
			sleep(3000);
			System.out.println(getName()+" completed executing");
			sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Bet extends Thread{
	@Override
	public void run() {
		try{
			System.out.println(getName()+" is executing");
			sleep(3000);
			System.out.println(getName()+" is executing");
			sleep(3000);
			System.out.println(getName()+" completed executing");
			sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}



public class MultiThreadingInbuiltMethods2 extends Thread { //Can class with main method extend Thread - Yes

	public static void main(String[] args) throws Exception{
		
		//join(), isAlive()
		
//		System.out.println("Main thread started executing");
//		Alp a = new Alp();
//		Bet b =new Bet();
//		a.start();
//		b.start();
//		System.out.println("Main thread completed executing");
		
		
		//O/p: Main thread first starts and completes execution, later thread 0 and 1 will complete.
		/*Main thread started executing
		Main thread completed executing
		Thread-1 is executing
		Thread-0 started to executing
		Thread-1 is executing
		Thread-0 is executing
		Thread-1 completed executing
		Thread-0 completed executing
		*/
		
		//--------------------------------------------------------------
		
		// To make main thread start first and complete last, while threads 0 and 1 (a and b) execute in between
		System.out.println("Main thread started executing"); // Main thread begins

		Alp a = new Alp(); // Creates object 'a' of thread class Alp → Thread-0 stack created in stack segment
		Bet b = new Bet(); // Creates object 'b' of thread class Bet → Thread-1 stack created in stack segment

		a.start(); // Starts Thread-0 → Its own run() method executes on a separate thread
		a.join();  // Main thread waits for Thread-0 to finish before continuing

		System.out.println(a.isAlive()); //false //checks whether the thread is executed or has already executed
		
		b.start(); // Starts Thread-1 → Executes its run() independently
		b.join();  // Main thread waits for Thread-1 to finish before continuing
		
		System.out.println(b.isAlive()); //false //checks whether the thread is executed or has already executed

		System.out.println("Main thread completed executing"); // Main thread finishes after both a and b complete

		//o/p
		/*
		 * Main thread started executing
Thread-0 started to executing
Thread-0 is executing
Thread-0 completed executing
Thread-1 is executing
Thread-1 is executing
Thread-1 completed executing
Main thread completed executing
		 */
		
		//---------------------------------------------------------------------------
		
		//2 ways to create small stack
		//1. By creating objects o those classes that are extending to Thread class
		//2. Creating Thread class Objects and passing references of classes to constructor
		
		
		
	}
}
