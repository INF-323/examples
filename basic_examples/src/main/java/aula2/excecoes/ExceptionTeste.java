package aula2.excecoes;


import java.lang.Exception;

class ExceptionTeste
 {

    public static void main(String args[]) {
	
	boolean deuErro;
	deuErro = true;
	
	try {
	
	    System.out.println("\nEntrando no try");
	
	    if (deuErro) {
	        System.out.println("Lancando Excecao e\n");
	        throw new Exception("Excecao e");
	    }
	    
	    System.out.println("Saindo do try\n");
	
	}
	
	catch(Exception e) {
	
	    System.out.println("Entrando no catch");
	    System.out.println("Capturando excecao e");
	    System.out.println("Saindo do catch\n");    
        }
	
	finally {

		System.out.println("Entrando no finally");
		System.out.println("Finalizando metodo main()");
		System.out.println("Saindo do finally\n");
	}
    }
	
}
	    
	 
	   
	
	    

