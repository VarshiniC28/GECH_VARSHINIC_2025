package multithreading.injava;

class Warrior extends Thread{
	
	String res1 = "bramhastra";
	String res2 = "Sarpastra";
	String res3 = "Pashupatastra";
	
	@Override
	public void run() { // RUNNING state: When thread is scheduled and run() starts executing
		String name = Thread.currentThread().getName(); // Still in RUNNING

		if(name.equalsIgnoreCase("Arjuna")) {
			arjun(); // Depending on name, thread goes into Arjuna method
		}else if(name.equalsIgnoreCase("Karna")) {
			karna(); // Or Karna method
		}
	}
	
	void arjun() {
		try {
			Thread.sleep(2000); // TIMED_WAITING: Thread sleeps for 2 seconds before acquiring any lock, 
			//When a thread is in sleep and finished sleep , that thread goes back to runnable state before going to running
			
			synchronized (res1){ // BLOCKED if another thread holds res1; else enters RUNNING after acquiring lock
				System.out.println("Arjuna acquired Bramhastra");

				Thread.sleep(3000); // TIMED_WAITING: while holding res1

				synchronized (res2){ // BLOCKED if another thread holds res2
					System.out.println("Arjuna acquired Sarpastra");

					Thread.sleep(3000); // TIMED_WAITING: while holding res1 + res2

					synchronized (res3){ // BLOCKED if another thread holds res3
						System.out.println("Arjuna acquired Pashupatastra");
						// When done: thread releases res3 lock
					} // Exiting res3 block: res3 monitor is released
				} // Exiting res2 block: res2 monitor is released
			} // Exiting res1 block: res1 monitor is released
			// Thread will eventually reach TERMINATED after completing run()
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void karna() {
		try {
			Thread.sleep(2000); // TIMED_WAITING

			synchronized (res1){ // BLOCKED if already held, else RUNNING
				System.out.println("Karna acquired Bramhastra");

				Thread.sleep(3000); // TIMED_WAITING

				synchronized (res2){ // BLOCKED if already held
					System.out.println("Karna acquired Sarpastra");

					Thread.sleep(3000); // TIMED_WAITING

					synchronized (res3){ // BLOCKED if already held
						System.out.println("Karna acquired Pashupatastra");
						// Exiting will release res3
					}
				}
			}
			// Thread reaches TERMINATED after run() finishes
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadLifeCycle {

	public static void main(String[] args) {

		// Thread Life cycle :
		/*
		 * NEW       → When thread object is created using new Thread()
		 * RUNNABLE  → After start() is called; thread is ready to run and waiting for CPU
		 * RUNNING   → When CPU picks the thread and executes run()
		 * BLOCKED   → When thread tries to enter a synchronized block but the lock is already held
		 * TIMED_WAITING → When thread is sleeping or waiting with a timeout (e.g., sleep, join)
		 * WAITING   → Waiting indefinitely (e.g., wait())
		 * TERMINATED → When run() method completes or thread is stopped
		 */
		
		//Creating 2 threads for each method
		Warrior w1 = new Warrior(); // NEW: Thread object created
		Warrior w2 = new Warrior(); // NEW: Another thread object created
		w1.setName("Arjuna");
		w2.setName("Karna");
		
		w1.start(); // RUNNABLE: Thread w1 ready to run
		w2.start(); // RUNNABLE: Thread w2 ready to run
		// JVM Thread Scheduler will pick one or both to move to RUNNING based on availability
	}

}
