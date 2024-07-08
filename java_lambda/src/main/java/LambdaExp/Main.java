package LambdaExp;


public class Main {

	public static void main(String[] args) {
		
		new  Thread (
				//Lambda Expression: (argument list) -> Body
				()->System.out.println("Mamãe ... olha eu aqui na Unicamp! E usando Lambda!!!")				
				).start();
	}
}
