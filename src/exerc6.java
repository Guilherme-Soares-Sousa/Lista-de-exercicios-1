// Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
import javax.swing.JOptionPane;

public class exerc6 {

    public static void main (String[] args){
        //ENTRADA DO NUMERO DESEJADO
        int numeroDeEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro qualquer:"));
        //CALCULO PEDIDO
        int calculoAnte = numeroDeEntrada - 1;
        //CALCULO PEDIDO
        int calculoSuce = numeroDeEntrada + 1;
        //IMPRESSAO NA TELA
        JOptionPane.showMessageDialog(null,"O número inteiro escolhido foi: "+ numeroDeEntrada + ".\nSeu antecessor é: "+ calculoAnte + ".\nE seu sucessor: "+ calculoSuce + "." );

    }
    
}
