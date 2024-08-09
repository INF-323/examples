package aula1.acesso;

class ContaCor1 {
  float saldoAtual; 

  ContaCor1() {
    saldoAtual = 0.0f;
  }

  ContaCor1(float saldo) {
    saldoAtual = saldo;
  }
}

public class CriaConta {
  public static void main(String[] args) {

    ContaCor1 conta = new ContaCor1(20); // cria objeto conta

    conta.saldoAtual= 10.0f; // inicializa saldo

    System.out.println("Saldo : " + conta.saldoAtual);
  }
}
