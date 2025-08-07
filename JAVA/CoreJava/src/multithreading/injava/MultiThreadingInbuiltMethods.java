package multithreading.injava;

class Alpha extends Thread{
	@Override
	public void run() {
		Thread t = currentThread(); //can be called directly method name like this as we are inheriting this method by extending to Thread.
		System.out.println(t); //When called through start method it prints abt current thread - Thread[#21,Thread-0,5,main] -And this is Thread-0
	}
}

class Beta extends Thread{
	@Override
	public void run() {
		Thread t = currentThread(); //can be called directly method name like this as we are inheriting this method by extending to Thread.
		System.out.println(t); //Thread-1 : Thread[#22,Thread-1,5,main]
	}
}

class Gamma extends Thread{
	@Override
	public void run() {
		System.out.println(currentThread());
		setName("S");
		System.out.println(currentThread());
	}
}

public class MultiThreadingInbuiltMethods extends Thread{ //Can class with main method extend Thread - Yes

	public static void main(String[] args) {

		//1.static currentMethod() in Thread class: which will give information about the thread that is currently executing
		Thread t = Thread.currentThread();
		System.out.println(t);
		//O/p : Thread[#1,main,5,main] 
		//1st term- Thread Id, 2nd term - Name of thread, 3rd term - Priority(By Default java gives 5 to every thread which is average of Priorities in scale(1 to 10), 4th term - Thread group 
	
		//We can get each terms separately also:
		System.out.println(t.getName()); //Name of thread only
		System.out.println(t.getPriority()); //prints priority only 
		System.out.println(t.getThreadGroup()); //thread group and max priority
		
		//We can change the thread name , priority as below
		t.setName("v");
		System.out.println(t.getName());
		t.setPriority(4);
		System.out.println(t.getPriority());
		
		//Knowing current thread by calling this method in run() method and start it in main method - will give that threads details
//		Alpha a = new Alpha();
//		a.start();
		
		Alpha a = new Alpha();
		Beta b = new Beta();
		a.start();
		b.start();
		
		//Changing name of thread inside run method
		Gamma g = new Gamma();
		g.start();
		
	}
}
