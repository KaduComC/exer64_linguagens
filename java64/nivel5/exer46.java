import javax.swing.JOptionPane;

public class exer46 {
    public static void main(String[] args) {
        int nXY;
        int produto = 0;

        nXY = Integer.parseInt(JOptionPane.showInputDialog("Valor do vetor X e Y: "));

        int[] x = new int[nXY];
        int[] y = new int[nXY];

        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Os valores de X - " + (i + 1) +"°: "));
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = Integer.parseInt(JOptionPane.showInputDialog("Os valores de Y - " + (i + 1) +"°: "));
        }

        for (int z = 0; z < y.length; z++) {
            produto = produto + x[z] * y[z];
        }
        JOptionPane.showMessageDialog(null, "Produto esalar é: " + produto);
    }
}