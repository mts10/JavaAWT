package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.Circulo;
import logica.Retangulo;
import logica.Triangulo;

public class ActionCalcular extends AbstractAction {
    private JComboBox<String> cmbForma;
    private JTextField txtRaio;
    private JTextField txtBase;
    private JTextField txtAltura;
    public ActionCalcular() {

    }
    public ActionCalcular(JComboBox<String> cmbForma, JTextField txtRaio,
        JTextField txtBase, JTextField txtAltura) {
        this.cmbForma = cmbForma;
        this.txtRaio = txtRaio;
        this.txtBase = txtBase;
        this.txtAltura = txtAltura;
    }

    public JComboBox getCmbForma() {
        return cmbForma;
    }

    public void setCmbForma(JComboBox cmbForma) {
        this.cmbForma = cmbForma;
    }

    public JTextField getTxtBase() {
        return txtBase;
    }
    
    public void setTxtBase(JTextField txtBase) {
        this.txtBase = txtBase;
    }

    public JTextField getTxtRaio() {
        return txtRaio;
    }

    public void setTxtRaio(JTextField txtRaio) {
        this.txtRaio = txtRaio;
    }

    public JTextField getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(JTextField txtAltura) {
        this.txtAltura = txtAltura;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (cmbForma.getSelectedItem().equals("Círculo")) {
            double raio = Double.parseDouble(txtRaio.getText());
            Circulo circulo = new Circulo(raio);
            JOptionPane.showMessageDialog(null, 
                String.format("A área do círculo é %f", circulo.calcularArea()), 
                "Forma Geométrica", JOptionPane.INFORMATION_MESSAGE
            );
        } else if (cmbForma.getSelectedItem().equals("Retângulo")) {
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            Retangulo retangulo = new Retangulo(base, altura);
            JOptionPane.showMessageDialog(null, 
                String.format("A área do retângulo é %f", retangulo.calcularArea()), 
                "Forma Geométrica", JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            Triangulo triangulo = new Triangulo(base, altura);
            JOptionPane.showMessageDialog(null, 
                String.format("A área do triângulo é %f", triangulo.calcularArea()), 
                "Forma Geométrica", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    
}
