package aula2.interfaces;

interface Item {
    public void empresta();
    public void qualNome();
}

abstract class ItemBiblioteca implements Item {
    protected String titulo;
    protected boolean isEmprestado;
}

class Livro extends ItemBiblioteca {

    public void empresta() {
        isEmprestado = true;
        System.out.println("Executando empresta() de Livro");
    }

    public void qualNome() {
        System.out.println("O nome do livro e' " + titulo);
    }

    Livro(String t) {
        titulo = t;
        isEmprestado = false;
    }

}

class CD extends ItemBiblioteca {

    public void empresta() {
        isEmprestado = true;
        System.out.println("Executando empresta() de CD");
    }

    public void qualNome() {
        System.out.println("O nome do CD e' " + titulo);
    }

    CD(String t) {
        titulo = t;
        isEmprestado = false;
    }
}

class UsuarioSI {

    String nome;
    ItemBiblioteca item;
    boolean jaPossui;

    public void empresta(ItemBiblioteca i) {
        if (!jaPossui) {
            i.empresta();
            item = i;
            jaPossui = true;
        } else
            System.out.println("Voce ja' tem um item");
    }

    UsuarioSI(String n) {
        nome = n;
        jaPossui = false;
    }

    public void qualEmprestado() {
        item.qualNome();
    }
}

class ComInterface {

    public static void main(String args[]) {

        UsuarioSI usuario = new UsuarioSI("Luis Inacio");
        Livro livro = new Livro("C++ em Quatro Aulas");
        CD cd = new CD("Baladas");

        usuario.empresta(livro);
        usuario.empresta(cd);

        usuario.qualEmprestado();
    }
}
