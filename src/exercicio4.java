// Escrever um algoritmo que lê:
//  a porcentagem do IPI a ser acrescido no valor das peças
//  o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//  o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
//  O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. (Fórmula:(valor1*quant1 + valor2*quant2)*(IPI/100 + 1))
import javax.swing.JOptionPane;

public class exercicio4 {

    public static void main (String[] args){
        //PEÇA 1
        int codPecaUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da peça:"));
        float valorPecaUm = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da peça (formato 00.00):"));
        int qntdePecaUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de peças em estoque:"));
        //PEÇA 2
        int codPecaDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da segunda peça:"));
        float valorPecaDois = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da segunda peça (formato 00.00):"));
        int qntdePecaDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de peças da segunda peça em estoque:"));
        //IPI
        float percentageIpi = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a porcentagem do IPI das peças:"));
        //CALCULO VALOR TOTAL (COM IPI)
        float valorTotal = (valorPecaUm * qntdePecaUm + valorPecaDois * qntdePecaDois)*(percentageIpi/100 + 1);       
        //IMPRESSAO NA TELA DOS DADOS PEÇA 1 E PEÇA 2 E VALOR TOTAL
        JOptionPane.showMessageDialog(null, "O código da primeira peça é: "+ codPecaUm + ".\n Seu preço é de: "+ valorPecaUm +" reais.\n E sua quantidade em estoque é: "+ qntdePecaUm +".");
        JOptionPane.showMessageDialog(null, "O código da segunda peça é: "+ codPecaDois + ".\n Seu preço é de: "+ valorPecaDois +".\n E sua quantidade em estoque é: "+ qntdePecaDois +".");
        JOptionPane.showMessageDialog(null, "O valor total a ser pago pelas duas peças(com IPI) é de: " + valorTotal + " reais." );

    }
    
}
