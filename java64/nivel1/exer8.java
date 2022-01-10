import javax.swing.JOptionPane;

public class exer8 {
    public static void main(String[] args) {
        double V, R, A;

        R = Double.parseDouble(JOptionPane.showInputDialog(null, "Raio: "));
        A = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: "));

        V = 3.12159 * R * R * A;

        JOptionPane.showMessageDialog(null, "Volume: " + V);
    }
}