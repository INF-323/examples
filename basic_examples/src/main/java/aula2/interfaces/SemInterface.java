package aula2.interfaces;

class Livro {

    String titulo;
    boolean isEmprestado;

    public void empresta() {
        isEmprestado = true;
        System.out.println("Executando empresta() de Livro");
    }

    Livro(String t) {
        titulo = t;
        isEmprestado = false;
    }

    public void qualNome() {
        System.out.println(titulo);
    }
}

class CD {

    String titulo;
    boolean isEmprestado;

    public void empresta() {
        isEmprestado = true;
        System.out.println("Executando empresta() de CD");
    }

    CD(String t) {
        titulo = t;
        isEmprestado = false;
    }

    public void qualNome() {
        System.out.println(titulo);
    }
}

class Usuario {

    String nome;
    Livro livro;
    CD cd;
    int jaEmprestado; // 0 = nada; 1 = livro; 2 = cd

    public void empresta(Livro l) {
        if (jaEmprestado == 0) {
            l.empresta();
            livro = l;
            jaEmprestado = 1;
        } else
            System.out.println("Voce ja' tem um item");
    }

    public void empresta(CD c) {
        if (jaEmprestado == 0) {
            c.empresta();
            cd = c;
            jaEmprestado = 2;
        } else
            System.out.println("Voce ja tem um item");
    }

    Usuario(String n) {
        jaEmprestado = 0;
        nome = n;
    }

    public void quaisEmprestados() {
        if (jaEmprestado == 1)
            livro.qualNome();
        else if (jaEmprestado == 2)
            cd.qualNome();
        else
            System.out.println("Voce nao tem nada emprestado");
    }
}

class SemInterface {

    public static void main(String args[]) {

        Usuario usuario = new Usuario("Luis Inacio");
        Livro livro = new Livro("C++ em Quatro Aulas");
        CD cd = new CD("Baladas");

        usuario.empresta(livro);
        usuario.empresta(cd);

        usuario.quaisEmprestados();
    }
}
