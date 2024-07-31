package aula1.acesso;

class ContaCor3 {
  // primeiro teste sem o <static>, depois o insira
  private float saldoAtual;

  void creditaValor(float val) {
    saldoAtual = saldoAtual + val;
  }

  float getSaldo() { // leitura do saldo
    return saldoAtual;
  }

}

public class StaticVar {
  public static void main(String[] args) {

    ContaCor3 conta1 = new ContaCor3(); // cria um objeto conta
    ContaCor3 conta2 = new ContaCor3();

    conta1.creditaValor(10.0f); // armazena 10
    System.out.println("Saldo : " + conta1.getSaldo());

    conta2.creditaValor(5.0f); // e mais 5
    System.out.println("Saldo : " + conta2.getSaldo());

  }
}
