package multithreading.injava;

class Warriors extends Thread {

	String res1 = "bramhastra";
	String res2 = "Sarpastra";
	String res3 = "Pashupatastra";

	@Override
	public void run() { // RUNNING state: Thread is now executing
		String name = Thread.currentThread().getName(); // RUNNING state

		if (name.equalsIgnoreCase("Arjuna")) {
			arjun(); // Arjuna thread starts execution
		} else if (name.equalsIgnoreCase("Karna")) {
			karna(); // Karna thread starts execution
		}
	}

	void arjun() {
		try {
			Thread.sleep(2000); // TIMED_WAITING: Thread sleeps for 2 sec, then goes back to RUNNABLE → RUNNING

			synchronized (res3) { // Tries to acquire res3 monitor
				// If Karna has already locked res3, Arjuna thread goes to BLOCKED state
				System.out.println("Arjuna acquired Bramhastra");

				Thread.sleep(3000); // TIMED_WAITING: Holds res3 while sleeping

				synchronized (res2) { // Tries to acquire res2
					// BLOCKED if Karna has already locked res2
					System.out.println("Arjuna acquired Sarpastra");

					Thread.sleep(3000); // TIMED_WAITING again

					synchronized (res1) { // Tries to acquire res1
						// If Karna is already holding res1 → DEADLOCK
						System.out.println("Arjuna acquired Pashupatastra");
					} // res1 released
				} // res2 released
			} // res3 released

			// If completed successfully → TERMINATED
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void karna() {
		try {
			Thread.sleep(2000); // TIMED_WAITING: Sleeps 2s, back to RUNNABLE → RUNNING

			synchronized (res1) { // Karna locks res1 first
				// If Arjuna later tries to lock res1 (already held) → Arjuna gets BLOCKED
				System.out.println("Karna acquired Bramhastra");

				Thread.sleep(3000); // TIMED_WAITING

				synchronized (res2) { // Tries to lock res2 (if already held → BLOCKED)
					System.out.println("Karna acquired Sarpastra");

					Thread.sleep(3000); // TIMED_WAITING

					synchronized (res3) { // Tries to acquire res3
						// If Arjuna already holds res3 → DEADLOCK
						System.out.println("Karna acquired Pashupatastra");
					} // res3 released
				} // res2 released
			} // res1 released

			// When run() completes → TERMINATED
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadLifeCycleDeadLock {

	public static void main(String[] args) {

		// Thread Life cycle :
		/*
		 * NEW           → When thread object is created using new Thread()
		 * RUNNABLE      → After start() is called; ready to run, waiting for CPU
		 * RUNNING       → When JVM picks the thread and run() starts executing
		 * TIMED_WAITING → Thread is sleeping or waiting with timeout (e.g., sleep)
		 * BLOCKED       → Waiting to acquire a lock (monitor) already held by another thread
		 * WAITING       → Waiting indefinitely (e.g., wait() or join() without timeout)
		 * TERMINATED    → After run() completes or thread is killed
		 * DEADLOCK      → Special case of BLOCKED: Two or more threads are waiting for each other’s locks forever
		 * DEADLOCK - Its state where 2/more Threads enter Blocked state infinitely/forever due to interdependency of releasing lock
		 * LIVELOCK - 
		 */

		//Creating 2 threads for each warrior
		Warriors w1 = new Warriors(); // NEW: Thread created but not yet started
		Warriors w2 = new Warriors(); // NEW: Another thread created

		w1.setName("Arjuna");
		w2.setName("Karna");

		w1.start(); // RUNNABLE: ready for execution
		w2.start(); // RUNNABLE: ready for execution

		// JVM Thread Scheduler may:
		// 1. Allow Arjuna to lock res3, then Karna locks res1 → Both will BLOCK waiting on each other's resource
		// 2. DEADLOCK occurs if:
		//    Arjuna holds res3 and waits for res2 → which Karna holds after res1 → and Karna tries to acquire res3
		//    → Both threads are BLOCKED forever: classic DEADLOCK
	}

}
