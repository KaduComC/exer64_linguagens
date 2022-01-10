import javax.swing.JOptionPane;

public class exer49 {
    public static void main(String[] args) {
        int n, iguais = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de componentes:"));
        int[] v1 = new int[n];
        int[] v2 = new int[n];

        for (int i = 0; i < n; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os números do primeiro vetor " + (i + 1) + "°:"));
        }

        for (int x = 0; x < n; x++) {
            v2[x] = Integer.parseInt(JOptionPane.showInputDialog("Informe os números do segundo vetor " + (x + 1) + "°:"));
        }

        for (int z = 0; z < n; z++) {
            if (v1[z] == v2[z]) {
                iguais++;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de valores iguais: " + iguais);
    }
}