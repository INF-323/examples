package aula2.interfaces;

public interface Validador {
 
        // Método estático para validar nome
        static boolean validarNome(String nome) {
            return nome != null && !nome.isEmpty() && nome.chars().allMatch(Character::isLetter);
        }
    
        // Método estático para validar CPF
        static boolean validarCPF(String cpf) {
            return cpf != null && cpf.length() == 11 && todosNumeros(cpf);
        }
    
        // Método estático para validar RG, assumindo que só pode aceitar números
        static boolean validarRG(String rg) {
            return rg != null && rg.length() == 9 && todosNumeros(rg);
        }
    
        // Método privado para verificar se todos os caracteres de um campo são números.
        // Só funciona a partir de java 9. Para executar em Java 8 remova o private.
        private static boolean todosNumeros(String valor) {
            return valor.chars().allMatch(Character::isDigit);
        }
}
