package aula2.excecoes;


import java.lang.Exception;


class ThrowEmMetodo {

	public static void chamado() throws Exception{


		boolean deuErro = false;

		System.out.println("    Entrando em chamado()");

		if (deuErro) {
			System.out.println("    Lancando Exception");
			throw new Exception();
		}

		System.out.println("    Saindo de chamado()");

	}

	public static void main(String args[]) {

		try {

			System.out.println("\nEntrando no try");
			chamado();
			System.out.println("Saindo do try\n");

		}

		catch(Exception e) {

			System.out.println("\nEntrando no catch");
			System.out.println("Capturando Exception");
			System.out.println("Saindo do catch\n");    
		}

		finally {

			System.out.println("Entrando no finally");
			System.out.println("Executando finally");
			System.out.println("Saindo do finally\n");
		}
	}

}






