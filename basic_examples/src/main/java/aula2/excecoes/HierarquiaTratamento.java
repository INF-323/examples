package aula2.excecoes;


import java.lang.Exception;


class Exception1 extends Exception {

}

class Exception2 extends Exception {

}

class HierarquiaTratamento {

    public static void main(String args[]) {
	
    	int numException;
    	numException = 2;

    	try {

    		System.out.println("\nEntrando no try externo");

    		try {

    			System.out.println("  Entrando no try interno\n");

    			if (numException == 1) {
    				System.out.println("  Lancando Exception1\n");
    				throw new Exception1();
    			}
    			else {
    				System.out.println("  Lancando Exception2\n");
    				throw new Exception2();
    			}
    		}

    		catch (Exception1 hum) { 
    			System.out.println("  Entrando no catch de Exception1");
    			System.out.println("  Capturando Exception1");
    			System.out.println("  Saindo do catch de Exception1\n");    
    		}

    		finally {
    			System.out.println("  Entrando no finally interno");
    			System.out.println("  Executando finally interno");
    			System.out.println("  Saindo do finally interno \n");
    		}

    		System.out.println("  Saindo do try interno\n");

    	}

    	catch(Exception2 dois) {

    		System.out.println("Entrando no catch de try externo");
    		System.out.println("Capturando Exception2");
    		System.out.println("Saindo do catch do try externo\n");    
    	}

    	finally {

    		System.out.println("Entrando no finally externo");
    		System.out.println("Executando finally externo");
    		System.out.println("Saindo do finally externo\n");
    	}
    }

}
	    
	 
	   
	
	    

