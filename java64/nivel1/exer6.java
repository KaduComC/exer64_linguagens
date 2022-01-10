import javax.swing.JOptionPane;

public class exer6 {
    public static void main(String[] args) {
        double C, F;

        C = Double.parseDouble(JOptionPane.showInputDialog(null, "C: "));

        F = (9 * C + 160) / 5;

        JOptionPane.showMessageDialog(null, "F: " + F);
    }
}