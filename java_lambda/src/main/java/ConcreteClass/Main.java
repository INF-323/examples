package ConcreteClass;

public class Main {

	public static void main(String[] args) {
		new Thread (new MyCode()).start();
	}

}

class MyCode implements Runnable{

	@Override
	public void run() {
		System.out.println("Mamãe ... olha eu aqui na Unicamp!");
	}
	
	
}