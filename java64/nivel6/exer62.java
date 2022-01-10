
import javax.swing.JOptionPane;

public class exer62 {
    public static void main(String[] args) {
        double base, altura;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base: "));
        JOptionPane.showMessageDialog(null, "Hipotenusa: " + hipotenusa(base, altura));
    }

    public static double hipotenusa(double base, double altura) {
        double hipotenusa = (base * base) + (altura * altura);
        hipotenusa = Math.sqrt(hipotenusa);
        return hipotenusa;
    }
}