package multithreading.injava;

class Bathroom{
	synchronized void bathroom() { //synchronized keyword make only one thread to be executed/access these methods instructions at a time
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" has left the bathroom");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Boy extends Thread{
	
	Bathroom ba;
	public Boy(Bathroom ba) { //This will receive the Bathroom b reference /address and now ba instance variable in Boy class will refer to Bathroom Object
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathroom();
	}
}

class Girl extends Thread{ //Now Girl class has access to bathroom and can access its method in run to make thread work
	
	Bathroom ba;
	public Girl(Bathroom ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathroom();
	}
}

class Others extends Thread{
	
	Bathroom ba;
	public Others(Bathroom ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathroom();
	}
}

public class SynchronizationMethodThreadSafety  {

	public static void main(String[] args) throws Exception{

		// SYNCHRONIZATION (Thread Safety): Is the locking system in Java where we can lock the shared resources/methods with help of synchronized keyword to ensure only one thread can access instructions/executed at any point of time.

		Bathroom b = new Bathroom(); //We must pass this reference to below objects to make those threads to go to this Bathroom object

		Boy bo = new Boy(b);
		Girl g = new Girl(b);
		Others o = new Others(b);
		
		bo.setName("Boy");
		g.setName("Girl");
		o.setName("Others");
		
		//This is same as sequential
//		bo.start();
//		bo.join();
//		g.start();
//		g.join();
//		o.start();
//		o.join();
		
		//So we can use synchronized keyword to Bathroom methods.
		bo.start();
		g.start();
		o.start();
		/*
		 * Boy has entered the bathroom
		 * Boy is using the bathroom
		Boy has left the bathroom
		Girl has entered the bathroom
		Girl is using the bathroom
		Girl has left the bathroom
		Others has entered the bathroom
		Others is using the bathroom
		Others has left the bathroom
		 */
		

	}

}
