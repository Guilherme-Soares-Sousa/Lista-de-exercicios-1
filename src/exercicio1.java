// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
// mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
// (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
import javax.swing.JOptionPane;

public class exercicio1 {

    public static void main(String[] args) {
        //Variáveis para mensagens de entrada
        String msgEntradaAno = "Quantos anos se passaram desde que você nasceu?";
        String msgEntradaMes = "Quantos meses do ano atual já se passaram?";
        String msgEntradaDia = "Qual o dia de hoje?";
        //Entrada dos dados
        int ano = Integer.parseInt(JOptionPane.showInputDialog(msgEntradaAno));
        int meses = Integer.parseInt(JOptionPane.showInputDialog(msgEntradaMes));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(msgEntradaDia));

        //Conversão dos dados
        int conversao = (ano * 365) + (meses * 30) + dia;

        JOptionPane.showMessageDialog(null, "Você nasceu fazem " + ano + " anos.\n" + meses + " meses.\ne " + dia + " dia(s).\n Isso dá " + conversao + " dias.");
        JOptionPane.showMessageDialog(null, 1+1);
    }
}
