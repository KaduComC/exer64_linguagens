import javax.swing.JOptionPane;

public class exer46 {
    public static void main(String[] args) {
        int nXY;

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
            JOptionPane.showMessageDialog(null, x[z] + " * " + y[z] + " = " + (x[z] * y[z]));
        }
    }
}