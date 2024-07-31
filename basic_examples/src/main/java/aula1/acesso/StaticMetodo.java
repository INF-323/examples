package aula1.acesso;

class ContaCor4{
  static private float saldoAtual;  // atributo a ser oferecido acesso

  
  ContaCor4(){
	  saldoAtual= 35;
	  
  }
  
  ContaCor4( float val ){
	  saldoAtual= val;
	  
  }
  
  
  static void creditaValor (float val) {  
    saldoAtual = saldoAtual + val;
  }

  float getSaldo() {  
    return saldoAtual;
  }

}

public class StaticMetodo { 
    public static void main(String[] args) {
    
        ContaCor4 conta = new ContaCor4(50);     // cria um objeto conta    

        ContaCor4.creditaValor(10.0f); // armazena 10
        
        System.out.println("Saldo : " + conta.getSaldo()); 
    }
} 
