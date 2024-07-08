package runnableTest4;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	
	public static void main(String[] args) {

		
		System.out.println("Main Thread starting ...");
		
		//Now we use the same RunnableTest object for both Threads!!!
		//Note that both Threads update the same counter!
		RunnableTest r = new  RunnableTest(new AtomicInteger(), 50);
		
		Thread T1 = new Thread( r);
		T1.setName("T1");
		Thread T2 = new Thread( r);
		T2.setName("T2");
		
		T1.start();
		T2.start();
		
		System.out.println("Main Thread finishing ...");
		
	}

}
