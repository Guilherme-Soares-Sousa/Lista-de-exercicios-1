// Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
// números 4, 5 e 6. A soma das duas médias. A média das médias.
import javax.swing.JOptionPane;
public class exercicio2 {

    public static void main (String[] args){
        //declaraçao variaveis para média
        float primeiraMedia = (7 + 8 + 9)/3;
        float segundaMedia = (4 + 5 + 6)/3;
        float somaMedia = primeiraMedia + segundaMedia;
        float mediaMedias = somaMedia/2;
        //
        JOptionPane.showMessageDialog(null, "A média dos números 7, 8 e 9 é: " + primeiraMedia + "\nE a média dos números 4, 5 e 6 é: " + segundaMedia);
        JOptionPane.showMessageDialog(null, "Sendo a soma dessas médias: " + somaMedia);
        JOptionPane.showMessageDialog(null, "E a média das médias: " + mediaMedias);

    }

}
