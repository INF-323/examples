package AnonymousClass;


public class MyThread {

	public static void main(String[] args) {
		
		new Thread (new Runnable()  {
			public void run() {
				System.out.println("Mamãe ... olha eu aqui na Unicamp!");
			}
		}).start();
	}
}
