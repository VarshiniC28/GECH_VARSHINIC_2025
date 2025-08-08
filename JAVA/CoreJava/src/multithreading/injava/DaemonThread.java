package multithreading.injava;

class Virat extends Thread{
	@Override
	public void run() {
		
		BatCoach b = new BatCoach();
		BowlCoach bo = new BowlCoach();
		b.setName("Ba");
		bo.setName("Bo");
		
		//This setDaemon(true) method makes the threads daemon when the argument is true and if its said false it will no longer be daemon thread
		b.setDaemon(true); 
		bo.setDaemon(true);
		
		//To check whether the thread is daemon thread or not
		System.out.println(b.isDaemon()); //true
		System.out.println(bo.isDaemon()); //true if they are daemon threads
		
		b.start();
		bo.start();
		
		try {
			System.out.println("Enters ground");
			Thread.sleep(2000);
			System.out.println("Do warmup");
			Thread.sleep(2000);
			System.out.println("Fielding");
			Thread.sleep(2000);
			System.out.println("bowling");
			Thread.sleep(2000);
			System.out.println("Batting");
			System.out.println("Leave the ground");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class BatCoach extends Thread{
	@Override
	public void run() {
		for(; ;) {
			try {
				System.out.println("Batting coach in the ground");
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class BowlCoach extends Thread{
	@Override
	public void run() {
		for(; ;) {
			try {
				System.out.println("Bowling coach in the ground");
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class DaemonThread {

	public static void main(String[] args) {

//		Daemon thread - Helper Thread for primary thread.. Eg: auto save in word which will do its work until wprd app is open
		
		//Identify daemon and primary thread, we want Thread-1 and 2 to execute only till primary thread i.e thread-0 is executing
		
		/* Rule :
		 * 1. Identify daemon threads
		 * 2. Primary thread should be the one to create the daemon threads - Create Objects of daemon threads and start them inside run method of primary thread as above
		 * 3. Primary thread should use setDaemon() which takes boolean value as argument(set to true) and create Thread
		 * 4. Must call setDaemon(true) before start()
		 * So now the daemon threads execute until primary thread is executing
		 * */
		
		Virat v = new Virat();
		v.setName("V");
		v.start();

		
		
	}

}
