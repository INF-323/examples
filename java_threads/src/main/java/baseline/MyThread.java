package baseline;


public class MyThread extends Thread {
	int counter, range;
	
	MyThread(int c, int r){
		counter = c;
		range = r;
	}
	
	@Override
	public void run() {
		
		for ( int i = 0; i < range; i++) {
			System.out.println("Imprimindo " + currentThread().getName() + ": "+counter);
			counter+=2;		
		}
		
	}
	
	 

}
