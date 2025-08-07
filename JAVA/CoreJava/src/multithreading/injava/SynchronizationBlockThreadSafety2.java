package multithreading.injava;

class Bathroom1{
	//Now to make only 5 and 6 to be synchronized we can use synchronized keyword for a block also
	void bathroom() { //synchronized keyword make only one thread to be executed/access these methods instructions at a time
		try {
			System.out.println(Thread.currentThread().getName()+" is executing 1");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is executing 2");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is executing 3");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is executing 4");
			Thread.sleep(2000);
			
			//So here only 5 and 6 will be synchronized
			//Why synchronize block: Synchronize only the **critical part**, not the whole method.
			synchronized(this){ //So this keyword will make only current object thats executing to access this statements and lock until this block is executed.
				System.out.println(Thread.currentThread().getName()+" is executing 5");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" is executing 6");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Boy1 extends Thread{
	
	Bathroom1 ba;
	public Boy1(Bathroom1 ba) { //This will receive the Bathroom b reference /address and now ba instance variable in Boy class will refer to Bathroom Object
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathroom();
	}
}

class Girl1 extends Thread{ //Now Girl class has access to bathroom and can access its method in run to make thread work
	
	Bathroom1 ba;
	public Girl1(Bathroom1 ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathroom();
	}
}

class Others1 extends Thread{
	
	Bathroom1 ba;
	public Others1(Bathroom1 ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathroom();
	}
}

public class SynchronizationBlockThreadSafety2  {

	public static void main(String[] args) throws Exception{

		// SYNCHRONIZATION (Thread Safety): Is the locking system in Java where we can lock the shared resources/methods with help of synchronized keyword to ensure only one thread can access instructions/executed at any point of time.

		Bathroom1 b = new Bathroom1(); //We must pass this reference to below objects to make those threads to go to this Bathroom object

		Boy1 bo = new Boy1(b);
		Girl1 g = new Girl1(b);
		Others1 o = new Others1(b);
		
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
		 * Girl is executing 1
Others is executing 1
Boy is executing 1
Others is executing 2
Girl is executing 2
Boy is executing 2
Boy is executing 3
Girl is executing 3
Others is executing 3
Others is executing 4
Boy is executing 4
Girl is executing 4
Others is executing 5
Others is executing 6
Girl is executing 5
Girl is executing 6
Boy is executing 5
Boy is executing 6

		 * */
	}

}
