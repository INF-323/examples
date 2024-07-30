package LambdaExp;

/* O Swing é um framework da linguagem de programação Java utilizado para a criação
 de interfaces gráficas (GUI - Graphical User Interfaces).
Ele faz parte da Java Foundation Classes (JFC) e fornece um conjunto de componentes gráficos
 e uma estrutura robusta para a construção de aplicações de desktop.
*/
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda Example");
        JButton button = new JButton("Click Me");

        // Usando uma expressão lambda para implementar ActionListener
        button.addActionListener(e -> System.out.println("Button Clicked"));

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}