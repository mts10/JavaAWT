package Interface;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.Subtração;
import logica.Adiçao;
import logica.Multiplicação;
import logica.Divisao;

public class ActionCalcular extends AbstractAction {
    private JComboBox<String> operacao;
    private JTextField n1;
    private JTextField n2;

    public ActionCalcular (JComboBox<String> operacao, JTextField n1, JTextField n2){
     this.operacao = operacao;
     this.n1 = n1;
     this.n2 = n2;
    }
    public ActionCalcular(){

    }

    public JTextField getN1() {
        return n1;
    }
    public void setN1(JTextField n1) {
        this.n1 = n1;
    }
    public JTextField getN2() {
        return n2;
    }
    public void setN2(JTextField n2) {
        this.n2 = n2;
    }
    public JComboBox<String> getOperacao() {
        return operacao;
    }
    public void setOperacao(JComboBox<String> operacao) {
        this.operacao = operacao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(operacao.getSelectedItem().equals("Adiçao")) {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Adiçao adiçao = new Adiçao(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado de %.2f + %.2f é %.2f", x, y, adiçao.calculo()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
 
        } else if(operacao.getSelectedItem().equals("Multiplicação")) {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Multiplicação multiplicação = new Multiplicação(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado de %.2f x %.2f é %.2f", x, y, multiplicação.calculo()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
        } else if(operacao.getSelectedItem().equals("Divisao")) {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Divisao divisao = new Divisao(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado de %.2f / %.2f é %.2f", x, y, divisao.calculo()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Subtração sub = new Subtração(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado de %.2f - %.2f é %.2f", x, y, sub.calculo()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
        }
        
    }
    
}
