package aula2.casting;

class C {
    void metodo() { 
        System.out.println("Metodo de C");
    }
}

class D extends C {
    void somenteD() {
        System.out.println("Metodo de D");
    }
}

//Downcasting sem redefinição. Está tentando chamar um método que não existe na classe C.
public class DowncastingSemRedefinicao {
    public static void main (String Args[]) {
        C c = new C();
	c.metodo();
	c = new D();
    c.metodo();
	c.somenteD();
    }
}

	
    
