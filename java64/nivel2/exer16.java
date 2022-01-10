import javax.swing.JOptionPane;

public class exer16 {
    public static void main(String[] args) {
        int valor1, valor2;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 1"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 2"));

        if (valor1 > valor2) JOptionPane.showMessageDialog(null, "Valor 1 é maior que Valor 2");
        if (valor1 < valor2) JOptionPane.showMessageDialog(null, "Valor 2 é maior que Valor 1");
        if (valor1 == valor2) JOptionPane.showMessageDialog(null, "Os dois valores são iguais");
    }
}