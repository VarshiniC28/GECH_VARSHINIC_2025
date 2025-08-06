package multithreading.injava;

import java.util.Scanner;

public class NoMultithreading {

	public static void main(String[] args) {

		//Multi-thrading - Multiple/many threads
		//Threads - Thread is collection of instructions which is executed independently which a part of process
		//Multi-threading is the concurrent execution of two or more threads to perform tasks simultaneously, maximizing CPU utilization and improving application performance.
	
	
		//No multi-threading code - Has dependent processes(even though they are independent) because , tasks are executed one after another sequentially.
		
		//1st task - add
		System.out.println("Adding started");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()+sc.nextInt());
		System.out.println("Adding completed");
		
		//2nd task - chars
		System.out.println("Printing characters");
		for(int i=65; i<=69; i++) {
			System.out.println((char)i);
			
			try {
				Thread.sleep(2000);			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing characters completed");
		
		//3rd task - num
		System.out.println("Printing numbers");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Completed");
	}

}
