package aula1.acesso;

class ContaCor1 {
  float saldoAtual; 

  }

public class CriaConta {
  public static void main(String[] args) {

    ContaCor1 conta = new ContaCor1(); // cria objeto conta

    conta.saldoAtual= 10.0f; // inicializa saldo

    System.out.println("Saldo : " + conta.saldoAtual);
  }
}
