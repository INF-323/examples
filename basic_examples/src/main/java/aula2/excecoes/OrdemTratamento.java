package aula2.excecoes;


import java.lang.Exception;

class ExceptionFilha extends Exception {
    
}

class ExceptionNeta extends ExceptionFilha {

}

class OrdemTratamento {

    public static void main(String args[]) {
	
	boolean deuErro;
	deuErro = true;
	
	try {
	
	    System.out.println("\nEntrando no try");
	
	    if (deuErro) {
	        System.out.println("Lancando Excecao\n");
	        throw new ExceptionFilha();
	    }
	    
	    System.out.println("Saindo do try\n");
	
	}
	


	catch(ExceptionNeta neta) {
	
	    System.out.println("Entrando no catch de ExceptionNeta");
	    System.out.println("Capturando excecao neta");
	    System.out.println("Saindo do catch de ExceptionNeta\n");    
        }

    catch(ExceptionFilha filha) {
	
	    System.out.println("Entrando no catch de ExceptionFilha");
	    System.out.println("Capturando excecao filha");
	    System.out.println("Saindo do catch de ExceptionFilha\n");    
        }

    catch(Exception pai) {
    	
    System.out.println("Entrando no catch de Exception");
    System.out.println("Capturando excecao pai");
    System.out.println("Saindo do catch de Exception\n");    
    }

	
	finally {
	
	    System.out.println("Entrando no finally");
	    System.out.println("Finalizando metodo main()");
	    System.out.println("Saindo do finally\n");
	}
    }
	
}
	    
	 
	   
	
	   
