import javax.swing.JOptionPane;

public class exer47 {
    public static void main(String[] args) {
        int x, maior = 0, menor = 0, igual = 0;
        int[] numeros = new int[10];

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X:"));

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe  o " + (i + 1) + "° valor:"));
        }

        for (int y = 0; y < numeros.length; y++) {
            if (numeros[y] > x) maior++;
            if (numeros[y] < x) menor++;
            if (numeros[y] == x) igual++;
        }
        JOptionPane.showMessageDialog(null, "Maior quue X: " + maior + "\nMenor que X: " + menor + "\nIgual a X: " + igual);
    }
}