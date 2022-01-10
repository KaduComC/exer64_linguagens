import java.util.Arrays;
import javax.swing.JOptionPane;

public class exer36 {
    public static void main(String[] args) {
        int quantidade = 10, media, total = 0;
        int[] valores = new int[quantidade];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("" + (i + 1) + "° valor: "));
            total += valores[i];
        }

        media = total / quantidade;
        Arrays.sort(valores);
        JOptionPane.showMessageDialog(null, "Maior: " + valores[quantidade - 1] + "\nMenor: " + valores[0] + "\nMédia: " + media);
    }
}