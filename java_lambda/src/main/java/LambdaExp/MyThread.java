package LambdaExp;


public class MyThread {

	public static void main(String[] args) {
		
		new  Thread (
				//Lambda Expression: (argument list) -> Body
				()->System.out.println("Hello There! This is from the lambda expression!")				
				).start();
	}
}
