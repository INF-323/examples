package aula2.interfaces;

public class Valida {

        public static void main(String[] args) {
            System.out.println("Nome válido: " + Validador.validarNome("João"));  // Imprime "Nome válido: true"
            System.out.println("CPF válido: " + Validador.validarCPF("12345678901"));  // Imprime "CPF válido: true"
            System.out.println("RG válido: " + Validador.validarRG("123456789"));  // Imprime "RG válido: true"
    
            System.out.println("Nome válido: " + Validador.validarNome("João123"));  // Imprime "Nome válido: false"
            System.out.println("CPF válido: " + Validador.validarCPF("1234A678901"));  // Imprime "CPF válido: false"
            System.out.println("RG válido: " + Validador.validarRG("12345678X"));  // Imprime "RG válido: false"
        }
}
