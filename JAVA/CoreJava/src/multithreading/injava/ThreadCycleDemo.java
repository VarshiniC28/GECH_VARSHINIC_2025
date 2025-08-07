package multithreading.injava;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " is in RUNNING state"); // RUNNING

		try {
			Thread.sleep(2000); // TIMED_WAITING (Thread is sleeping)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(getName() + " is about to TERMINATE"); // About to finish
	}
}

public class ThreadCycleDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread(); // NEW
		System.out.println("Thread created, current state: " + t1.getState()); // NEW

		t1.start(); // RUNNABLE
		System.out.println("After start(), current state: " + t1.getState()); // RUNNABLE or RUNNING

		try {
			Thread.sleep(100); // Main thread sleeps so t1 enters sleep
			System.out.println("While t1 is sleeping, state: " + t1.getState()); // TIMED_WAITING
			t1.join(); // Main thread waits for t1 to finish (WAITING)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("After t1 finishes, state: " + t1.getState()); // TERMINATED
	}
}
