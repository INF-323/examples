package runnableTest2;

public class RunnableTest implements Runnable {
	int counter, range;
	
	RunnableTest(int c, int r){
		counter = c;
		range = r;
	}
	
	@Override
	public void run() {
		
		for ( int i = 0; i < range; i++) {
			System.out.println("Imprimindo " + Thread.currentThread().getName() + ": "+counter);
			counter++;		
		}
		
	}
	
	 

}
