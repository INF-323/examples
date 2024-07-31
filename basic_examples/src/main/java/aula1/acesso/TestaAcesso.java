package aula1.acesso;

import java.util.*;

class ContaCor2 {
  private float saldoAtual;  // atributo a ser oferecido acesso
}

public class TestaAcesso { 
    public static void main(String[] args) {
    
        ContaCor2 conta = new ContaCor2();     // cria objeto conta
         
        conta.saldoAtual = 10.0f;         

        System.out.println("Saldo : " + conta.saldoAtual); 

    }
} 
