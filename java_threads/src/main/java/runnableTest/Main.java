package runnableTest;

public class Main {
	
	public static void main(String[] args) {

		
		System.out.println("Main Thread starting ...");
		
		Thread Pares = new Thread( new  RunnableTest(0, 50));
		Pares.setName("pares");
		
		Thread Impares = new Thread( new  RunnableTest(1, 50));
		Impares.setName("impares");
		
		Pares.start();
		Impares.start();
		
		System.out.println("Main Thread finishing ...");
		
	}

}
