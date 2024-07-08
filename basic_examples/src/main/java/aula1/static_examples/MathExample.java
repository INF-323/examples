package aula1.static_examples;

// Exemplo de uso de métodos estáticos da biblioteca Math
public class MathExample {
    public static void main(String[] args) {
        // Exemplo de uso de métodos estáticos da biblioteca Math
        double number = 4.5;
        
        // Exemplo de uso do método abs()
        double absoluteValue = Math.abs(number);
        System.out.println("O valor absoluto de " + number + " é " + absoluteValue);
        
        // Exemplo de uso do método sqrt()
        double squareRoot = Math.sqrt(number);
        System.out.println("A raiz quadrada de " + number + " é " + squareRoot);
        
        // Exemplo de uso do método pow()
        double power = Math.pow(number, 2);
        System.out.println(number + " elevado ao quadrado é " + power);
        
        // Exemplo de uso do método sin()
        double sine = Math.sin(number);
        System.out.println("O seno de " + number + " é " + sine);
        
        // Exemplo de uso do método cos()
        double cosine = Math.cos(number);
        System.out.println("O cosseno de " + number + " é " + cosine);
        
        // Exemplo de uso do método tan()
        double tangent = Math.tan(number);
        System.out.println("A tangente de " + number + " é " + tangent);
    }
}
