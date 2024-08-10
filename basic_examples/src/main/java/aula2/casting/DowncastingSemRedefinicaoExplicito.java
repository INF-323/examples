package aula2.casting;

class E {
    void metodo() {
        System.out.println("Metodo de E");
    }
}

class F extends E {
    void somenteF() {
        System.out.println("Metodo de F");
    }
}

public class DowncastingSemRedefinicaoExplicito {
    public static void main(String Args[]) {
        E e = new E();
        e.metodo();
        e = new F();
        if (e instanceof F)
            ((F) e).somenteF();
    }
}
