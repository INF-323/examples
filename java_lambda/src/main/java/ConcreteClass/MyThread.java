package ConcreteClass;

public class MyThread {

	public static void main(String[] args) {
		new Thread (new MyCode()).start();
	}

}

class MyCode implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello there! This is the run() method!");
	}
	
	
}