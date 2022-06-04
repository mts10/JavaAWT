package grafica;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmCalculadoraGeometrica extends JFrame {
    private JTextField txtRaio;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JComboBox<String> cmbForma;
    private JButton btnCalcular;
    public FrmCalculadoraGeometrica() {
        setSize(new Dimension(240, 160));
        //setSize(new Dimension(600, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new GridLayout(5, 2, 10, 10));
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        add(new JLabel("Raio:"));
        add(txtRaio = new JTextField(15));
        // Equivalente a:
        // txtRaio = new JTextField();
        // add(txtRaio);
        add(new JLabel("Base:"));
        add(txtBase = new JTextField(15));

        add(new JLabel("Altura:"));
        add(txtAltura = new JTextField(15));

        add(new JLabel("Forma:"));
        
        String items[] = {"Círculo", "Retângulo", "Triângulo"};
        add(cmbForma = new JComboBox<String>(items));

        add(btnCalcular = new JButton("Calcular"));
        ActionCalcular action = new ActionCalcular(cmbForma, txtRaio, txtBase, txtAltura);
        btnCalcular.addActionListener(action);
    }
}
