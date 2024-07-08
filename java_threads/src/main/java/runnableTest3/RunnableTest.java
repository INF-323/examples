package runnableTest3;

public class RunnableTest implements Runnable {
	int counter, range;
	
	RunnableTest(int c, int r){
		counter = c;
		range = r;
	}
	
	@Override
	//We remove thread interference by using synchronized.
	
	
	//Option 1
	  public synchronized void run() {
	  
	  for ( int i = 0; i < range; i++) { System.out.println("Imprimindo " +
	  Thread.currentThread().getName() + ": "+counter); counter++; }
	  
	  }	  
	 	 
	
	//Option 2 ...
	
/*	  public void run() {
	  
		synchronized (this) {
			System.out.println( Thread.currentThread().getName() + " iniciando ..." +counter);
	  
		  for ( int i = 0; i < range; i++) {
			  System.out.println("Imprimindo " + Thread.currentThread().getName() + ": "+counter); 
			  counter++;
		  }  
		}
		System.out.println( Thread.currentThread().getName() + " finalizando ..." +counter);

	 }
*/	 	

	
    //Option 3
	//How about this one ... Is there any difference?
	/*
	 * public void run() {
	 * 
	 * 
	 * for ( int i = 0; i < range; i++) { System.out.println("Imprimindo " +
	 * Thread.currentThread().getName() + ": "+counter); 
	 * synchronized (this) {
	 * 
	 * counter++; } } System.out.println( Thread.currentThread().getName() +
	 * " finalizando ..." +counter); }
	 * 
	 */	
}
