import java.util.Random;
import javax.swing.JOptionPane;

public class exer50 {
    public static void main(String[] args) {
        int tentativas = 0;
        int valor;
        Random aleatorio = new Random();
        int valorRandon = aleatorio.nextInt(10);

        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Valor da tentativa"));
            tentativas++;
            if (valor == valorRandon) {
                JOptionPane.showMessageDialog(null, "O valor da tentaiva é igual ao valor sorteado\nTentativas: " + tentativas);
            } else if (valorRandon > valor) {
                JOptionPane.showMessageDialog(null, "O valor sorteado é maior");
            } else if (valorRandon < valor){
                JOptionPane.showMessageDialog(null, "O valor sorteado é menor");
            }
        } while (valor != valorRandon);

    }
}