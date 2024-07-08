package runnableTest4;

import java.util.concurrent.atomic.AtomicInteger;

public class RunnableTest implements Runnable {
	int range;
	AtomicInteger counter;
	
	RunnableTest(AtomicInteger c, int r){
		counter = c;
		range = r;
	}
	
	@Override
	//We remove thread interference by using synchronized.
	
/*	  public synchronized void run() {
	  
	  for ( int i = 0; i < range; i++) { System.out.println("Imprimindo " +
	  Thread.currentThread().getName() + ": "+counter); counter++; }
	  
	  }
*/	  
	 	 
	
	//Let's try this one ...
	
	  public void run() {
	  
		  for ( int i = 0; i < range; i++) {
			  System.out.println("Imprimindo " + Thread.currentThread().getName() + ": "+ counter.getAndIncrement()); 
		  }  
		System.out.println( Thread.currentThread().getName() + " finalizando ...");

	 }
	 	
	
	
	//How about this one ... Is there any difference?
/*	public void run() {

		
			for ( int i = 0; i < range; i++) {
			//	System.out.println("Imprimindo " + Thread.currentThread().getName() + ": "+counter);
				synchronized (this) {
					
					counter++;
				}
			}	
			System.out.println( Thread.currentThread().getName() + " finalizando ...");
	}
*/
}
