import javax.swing.JOptionPane;

public class exer7 {
    public static void main(String[] args) {
        double C, F;

        F = Double.parseDouble(JOptionPane.showInputDialog(null, "F: "));

        C = (F - 32) * 5 / 9;

        JOptionPane.showMessageDialog(null, "C: " + C);
    }
}