import javax.swing.JOptionPane;

public class exer17 {
    public static void main(String[] args) {
        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor"));

        if (valor >= 0 && valor <= 9) {
            JOptionPane.showMessageDialog(null, "Valor válido");
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }
}