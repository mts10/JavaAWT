package Interface;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
    private JTextField n1;
    private JTextField n2;
    private JComboBox<String> operacao;
    private JButton btnCalcular;

    public Calculadora() {
        setTitle("Minha Calculadora");
        setSize(new Dimension(300, 180));
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       setLayout(new FlowLayout());
       add(new JLabel("X:"));
       add(n1 = new JTextField(10));

       add(new JLabel("Y:"));
       add(n2 = new JTextField(10));

       add(new JLabel("Operação: "));

       String items[] = {"Divisao", "Multiplicação", "Adiçao", "Subtração"};
       add(operacao = new JComboBox<String>(items));

       add(btnCalcular = new JButton("Calcular"));
       ActionCalcular action = new ActionCalcular(operacao, n1, n2);
       btnCalcular.addActionListener(action);

    }
    
}
