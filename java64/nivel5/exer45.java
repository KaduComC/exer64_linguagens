import javax.swing.JOptionPane;

public class exer45 {
    public static void main(String[] args) {
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Valor do vetor: "));
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) +"° valor: "));
        }

        for (int x = n - 1; x >= 0; x--) {
            System.out.println(numeros[x]);
        }
    }
}