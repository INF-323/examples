package AnonymousClass;


public class Main {

	public static void main(String[] args) {
		
		new Thread (new Runnable()  {
			public void run() {
				System.out.println("Mamãe ... olha eu aqui na Unicamp!");
			}
		}).start();
	}
}
