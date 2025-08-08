package multithreading.injava;


class Queue{
	private int data;
	boolean isDataPresent = false;

	//Whenever the resource/method has notify or wait we must make it synchronized - and using notify() and wait() is communication between threads
	synchronized void setData(int data) { //only one thread can access this at any point of time
		if(isDataPresent==false) {
			this.data = data;
			System.out.println("Producer produced the data: "+data);
			isDataPresent = true;
			notify(); //To notify that there is data to other threads we use this method, if we dont use notify, it may lead to dead lock or we could say there will be one 
		}
		else { //if the data is present and not empty then wait
			try {
				wait(); //if we dont use wait, there will be skip of lot of iterations
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}

	synchronized void getData() {
		if(isDataPresent == true) {
			System.out.println("Consumer consumed the data: "+data);
			isDataPresent = false;
			notify(); //notify()-any one of the thread will be back to RUNNABLE, notifyAll()- All threads will be be back

		}
		else { ///if data is not present yet , before u consume wait
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Boy11 extends Thread{
	Queue q;
	public Boy11(Queue q) {
		this.q = q;
	}
	
	@Override
	public void run() {
		int i=0;
		for(; ;) { //for loop with just ; and no conditions is called infinite loop
			q.setData(i++); //there is difference as 2 4 6 because of processor speed its not possible for it to print
		}
	}
}

class Girl11 extends Thread{
	
	Queue q;
	public Girl11(Queue q) {
		this.q = q;
	}
	
	
	@Override
	public void run() {
		for(; ; ) {
			q.getData();
		}
	}
}

public class ProducerConsumerInterThreadCommunication { //Producer and consumer problem 

	public static void main(String[] args) {

		Queue q = new Queue();
		
		Boy11 b = new Boy11(q);
		Girl11 g = new Girl11(q);
		
		b.setName("Producer");
		g.setName("Consumer");
		
		b.start();
		g.start();
		
		
		//Here the problem is , When Thread-0 is selected by Thread scheduler - it produces data like 1 2 3 4 - after its times over at last the data it has is 4
		//Now when the Thread-1 is alloted with time, it keeps consuming only the last data present in data variable i.e 4 - so o/p will be 4 4 4
		//There is con-current execution but what we want is produce 1  consume 1 , produce 2 consume 2 : so we use inter-thread communication
	}

}
