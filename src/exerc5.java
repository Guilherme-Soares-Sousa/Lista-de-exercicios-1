// Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)
import javax.swing.JOptionPane;

public class exerc5 {

    public static void main (String[] args){

        
        float minimalWageBrasil = 788.00f;

        //ENTRADA DO SALÁRIO DO USUÁRIO
        float salarioUsuario = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o salário que recebe atualmente: "));

        //CALCULO DOS VALORES REQUISITADOS
        float salariosMinimos = salarioUsuario/minimalWageBrasil;

        //LEITURA DO QUE O EXERCICIO PEDE
        JOptionPane.showMessageDialog(null, "O valor médio de salário mínimo atualmente é de " + minimalWageBrasil + " reais.\nE o salário que você recebe atualmente é de " + salarioUsuario + " reais.\nQue resulta em " + salariosMinimos + " salários mínimos.");

    }

}