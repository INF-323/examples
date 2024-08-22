package runnableTest2;

//Essa classe ilustra duas Threads que compartilham o mesmo objeto RunnableTest. 
//O objeto RunnableTest possui um contador que é incrementado por cada Thread.
//O resultado é que o contador é incrementado por ambas as Threads, mas o resultado final é imprevisível.
//Esse erro é conhecido como condição de corrida. O resultado final depende de como o sistema operacional
//intercala a execução das Threads.
//Para resolver esse problema, é necessário sincronizar o acesso ao objeto compartilhado.
public class Main {
	
	public static void main(String[] args) {

		
		System.out.println("Main Thread starting ...");
		
		//Now we use the same RunnableTest object for both Threads!!!
		//Note that both Threads update the same counter!
		RunnableTest r = new  RunnableTest(0, 50);
		
		Thread T1 = new Thread( r);
		T1.setName("T1");
		Thread T2 = new Thread( r);
		T2.setName("T2");
		
		T1.start();
		T2.start();
		
		System.out.println("Main Thread finishing ...");
		
	}

}
