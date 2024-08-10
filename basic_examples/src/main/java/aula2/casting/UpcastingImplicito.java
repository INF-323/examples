package aula2.casting;

class A {
	void metodo() { 
		System.out.println("Metodo de A");
	}
}

class B extends A {
	void metodoB() {
		System.out.println("Metodo de B");
	}
}

public class UpcastingImplicito {
	public static void main (String Args[]) {
		A a = new A();
		a.metodo();
		a = new B();
		a.metodo();
	}
}



