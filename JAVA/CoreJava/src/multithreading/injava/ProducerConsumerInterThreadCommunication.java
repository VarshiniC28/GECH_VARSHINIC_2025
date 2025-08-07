package multithreading.injava;


class Queue{
	private int data;

	void setData(int data) {
		this.data = data;
		System.out.println("Producer produced the data: "+data);
	}

	void getData() {
		System.out.println(data);
		System.out.println("Consumer consumed the data: "+data);
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
			q.setData(i++);
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
	}

}
