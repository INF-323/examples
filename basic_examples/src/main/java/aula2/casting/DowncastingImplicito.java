package aula2.casting;

class X {
    void metodo() { 
        System.out.println("Metodo de X");
    }
}

class Y extends X {
    void metodo() {
        System.out.println("Metodo de Y");
    }
}

// Não é permitido em Java. Conversão de X, que é mais genérico, para Y, que é mais específico.
public class DowncastingImplicito {
    public static void main (String Args[]) {
        Y y = new Y();
	y.metodo();
	y = new X();
	y.metodo();
    }
}

	
    
