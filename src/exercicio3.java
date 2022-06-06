// Informar um saldo e imprimir o saldo com reajuste de 1%.

import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main (String[] args){

        String msgEntrada = "Entre com seu saldo: ";
        float saldo = Float.parseFloat(JOptionPane.showInputDialog(msgEntrada));
        double saldoReajuste = saldo + (saldo * 0.01);
        JOptionPane.showMessageDialog(null, "Seu salário é " + saldo + "\nSendo de " + saldoReajuste + " com reajuste de 1%.");
    }
}
//ah man